package com.fanniemae.automation.dao;

import java.nio.file.Path;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;

import org.apache.log4j.Logger;

import com.fanniemae.automation.dto.workbook.Cell;
import com.fanniemae.automation.dto.workbook.Row;
import com.fanniemae.automation.dto.workbook.Sheet;
import com.fanniemae.automation.dto.workbook.Workbook;
import com.fanniemae.automation.registry.Registry;
import com.fanniemae.automation.registry.RegistryKey;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class WorkbookOperations {

	private Workbook workbook;

	private static final Logger LOG = Logger.getLogger(WorkbookOperations.class.getName());

	public WorkbookOperations(Path workbookPath) {
		this(new DefaultExcelDAO(workbookPath).extractWorkbook());
	}
	
	public WorkbookOperations(Workbook workbook) {
		this.workbook = workbook;
		Registry.setAttribute(RegistryKey.WORKBOOK_VIRTUAL, workbook);
		LOG.debug("VirtualWorkbook is loaded to Registry.");
	}

	public void writeToCell(String sheetName, int rowIndex, int cellIndex, String value) {
		LOG.debug("Request received to write value in cell of Sheet[" + sheetName + "], RowIndex[" + rowIndex+ "], CellIndex[" + cellIndex+"].");
		if(rowIndex == 0) {
			LOG.warn("Cannot perform write operation on header row.");
			return;
		}
		for (Sheet sheet : workbook.getSheets()) {
			if (sheet.getName().equals(sheetName)) {
				LOG.debug("Sheet[" + sheet + "] found with given sheetName[" + sheetName + "].");
				writeToCell0(sheet, rowIndex, cellIndex, value);
				break;
			}
		}
	}

	private void writeToCell0(Sheet sheet, int rowIndex, int cellIndex, String value) {
		for (Row row : sheet.getRows()) {
			if (row.getIndex() == rowIndex) {
				LOG.debug("Row[" + row + "] found with given RowIndex[" + rowIndex + "].");
				writeToCell1(row, cellIndex, value);
			}
		}
	}
	
	private void writeToCell1(Row row, int cellIndex, String value) {
		for (Cell cell : row.getData().keySet()) {
			if (cell.getIndex() == cellIndex) {
				LOG.debug("Cell[" + cell + "] found with given CellIndex[" + cellIndex + "].");
				row.getData().get(cell).setValue(value);
				break;
			}
		}
	}
	
	public String readFromCell(Sheet sheet, int rowIndex, int cellIndex) {
		LOG.debug("request received to get the cell value from Sheet:" + sheet + ", RowIndex:" + rowIndex+ ", CellIndex:" + cellIndex);
		return (Objects.nonNull(sheet)) ? parseSheet(sheet, rowIndex, cellIndex) : null;
	}
	
	public String readFromCell(String sheetName, int rowIndex, int cellIndex) {
		return readFromCell(getSheet(sheetName), rowIndex, cellIndex);
	}
	
	private String parseSheet(Sheet sheet, int rowIndex, int cellIndex) {
		for (Row row : sheet.getRows()) {
			if (rowIndex == 0) {
				LOG.debug("Parsing cell value for Header.");
				Optional<Cell> optionalCell = row.getData().keySet().stream().filter(
						a -> (a.getIndex() == cellIndex) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue())
						.findFirst();
				if (optionalCell.isPresent())
					return optionalCell.get().getValue();
				else
					return null;
			} else if (row.getIndex() == rowIndex) {
				LOG.debug("Row[" + row + "] found with given RowIndex[" + rowIndex + "].");
				return parseRowByLambda(row, cellIndex);
			}
		}
		return null;
	}
	
	private Sheet getSheet(String sheetName){
		Optional<Sheet> optional = workbook.getSheets().stream().parallel().filter(a -> sheetName.equals(a.getName())).findAny();
		return (optional.isPresent()) ? optional.get() : null;
	}
	
	public String getValueOnMatchFromColumn(String sheetName, String match, int columnIndexToCheckForMatch, int columnIndex){
		Sheet sheet = getSheet(sheetName);
		LOG.info("Request received for data from "+sheet+" with content["+match+"] match from CellIndex["+columnIndexToCheckForMatch+"] with actual ColumnIndex["+columnIndex+"].");
		if(Objects.nonNull(sheet)){
			Integer rowIndex = getRowIndexForValue(match, sheet, columnIndexToCheckForMatch);
			if(Objects.nonNull(rowIndex)){
				return readFromCell(sheet, rowIndex, columnIndex);
			}
		}
		LOG.warn("No Value found for input SheetName["+sheetName+"], Content["+match+"], ColumnIndex["+columnIndex+"], returning null.");
		return null;
	}
	
	private Integer getRowIndexForValue(String value, Sheet sheet, int columnIndex){
		for(Row row : sheet.getRows()){
			if(row.getIndex() != 0 ){
				for(Cell cell : row.getData().values()){
					if(Objects.nonNull(cell) && cell.getIndex() == columnIndex && value.equals(cell.getValue())){
						return row.getIndex();
					}
				}
			}
		}
		return null;
	}
	
	private String parseRowByLambda(Row row, int cellIndex){
		Optional<Entry<Cell, Cell>> optional = row.getData().entrySet().parallelStream().filter(a-> (a.getValue().getIndex() == cellIndex) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue()).findAny();
		return (optional.isPresent()) ? optional.get().getValue().getValue() : null;
	}
}