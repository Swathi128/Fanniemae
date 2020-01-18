package com.fanniemae.automation.dao;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fanniemae.automation.dto.workbook.Row;
import com.fanniemae.automation.dto.workbook.Sheet;
import com.fanniemae.automation.dto.workbook.Workbook;
import com.techouts.fanniemae.exceptions.FannieMaeBusinessException;

/**
 * 
 * @author TO-WVLD-12
 *
 */
class DefaultExcelDAO {

	private static final Logger LOG = Logger.getLogger(DefaultExcelDAO.class.getName());
	
	private XSSFWorkbook workbook = null;
	private Path path = null;
	private DataFormatter formatter;
	
	public DefaultExcelDAO(Path path) {
		if(Objects.isNull(path))
			throw new IllegalArgumentException("Path cannot be null/empty.");
		this.path = path;
		try (XSSFWorkbook book = new XSSFWorkbook(path.toFile())){
			workbook = book;
		} catch (InvalidFormatException | IOException e) {
			LOG.error("Error occurred while loading/parsing the workbook from provided Path["+path+"]",e);
			throw new FannieMaeBusinessException(e);
		}
		formatter = new DataFormatter();
	}
	
	public Workbook extractWorkbook() {
		Workbook book = new Workbook(path.getFileName().toString());
		for(int i=0; i<workbook.getNumberOfSheets(); i++) {
			book.addSheet(extractSheet(workbook.getSheetAt(i)));
		}
		LOG.debug("Returning extracted workbook from Path["+workbook+"].");
		return book;
	}
	
	public Sheet extractSheet(XSSFSheet xssfSheet) {
		Sheet sheet = null;
		if(Objects.nonNull(xssfSheet)){
			sheet = new Sheet(xssfSheet.getSheetName());
			for(int i=1; i<xssfSheet.getLastRowNum(); i++) {
				sheet.setRow(extractRow(i, xssfSheet));
			}
		}else {
			LOG.warn("Supplied XSSFSheet[null] found null.");	
		}
		return sheet;
	}
	
	public Row extractRow(int index, XSSFSheet sheet) {
		XSSFRow headerRow = sheet.getRow(0);
		XSSFRow dataRow = sheet.getRow(index);
		Map<com.fanniemae.automation.dto.workbook.Cell , com.fanniemae.automation.dto.workbook.Cell> parsedData = new HashMap<>();
		Iterator<Cell> itr = headerRow.cellIterator();
		while(itr.hasNext()){
			Cell cell = itr.next();
			if(cell==null)
				LOG.debug("Cell object found null, returning null");
			else{
				int headerCellIndex = cell.getColumnIndex();
				if(Objects.nonNull(dataRow)){
					com.fanniemae.automation.dto.workbook.Cell key = new com.fanniemae.automation.dto.workbook.Cell();
					com.fanniemae.automation.dto.workbook.Cell value = new com.fanniemae.automation.dto.workbook.Cell();
					parseValue(cell, key);
					parseValue(dataRow.getCell(headerCellIndex),value);
					parsedData.put(key, value);
				}
				else
					LOG.debug("Row data found null, skipping data insertion for new VirtualCell.");
			}	
		}
		return new Row(parsedData , index, sheet.getSheetName());
	}
	
	public Path getPath() {
		return path;
	}

	private void parseValue(Cell cell, com.fanniemae.automation.dto.workbook.Cell vCell) {
		if(Objects.nonNull(cell)){
			CellType cellType = cell.getCellTypeEnum();
			int cellIndex = cell.getColumnIndex();
			switch (cellType) {
			case _NONE:
				createCell(cellIndex, formatter.formatCellValue(cell), cellType, vCell);
				break;
			case NUMERIC:
				createCell(cellIndex, String.valueOf(cell.getNumericCellValue()), cellType, vCell);
				break;
			case STRING:
				createCell(cellIndex, cell.getStringCellValue(), cellType, vCell);
				break;
			case FORMULA:
				createCell(cellIndex, cell.getCellFormula(), cellType, vCell);
				break;
			case BLANK:
				createCell(cellIndex, StringUtils.EMPTY, cellType, vCell);
				break;
			case BOOLEAN:
				createCell(cellIndex, String.valueOf(cell.getBooleanCellValue()), cellType, vCell);
				break;
			case ERROR:
				createCell(cellIndex, new String(new byte[] {cell.getErrorCellValue()}), cellType, vCell);
				break;	
			default:
				LOG.error("Unsupported CellType.");
				break;
			}
		}
	}
	
	private void createCell(int index, String value, CellType cellType, com.fanniemae.automation.dto.workbook.Cell cell){
		cell.setCellType(cellType);
		cell.setIndex(index);
		cell.setValue(value);
		cell.setEmpty(false);
	}
}
