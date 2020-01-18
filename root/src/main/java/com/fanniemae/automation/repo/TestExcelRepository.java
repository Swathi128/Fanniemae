package com.fanniemae.automation.repo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.registry.Registry;
import com.fanniemae.automation.registry.RegistryKey;
import com.fanniemae.automation.util.CommonUtils;
import com.techouts.fanniemae.exceptions.ExcelReadWriteException;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public final class TestExcelRepository {
	
	private XSSFWorkbook excelWorkBook = null;
	private XSSFCell cell = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	
	private Path path = null;
	private static final int RESULTCOLUMNINDEX;
	private static final int COMMENTCOLUMNINDEX;
	private static final int TESTCASEIDCOLUMNINDEX;

	public TestExcelRepository() {}
	
	public TestExcelRepository(Path path) {
		super();
		this.path = path;
	}

	static{
		RESULTCOLUMNINDEX = CommonUtils.getDefaultConfTestCaseResultExcelColumnIndex();
		COMMENTCOLUMNINDEX = CommonUtils.getDefaultConfTestCaseResultCommentExcelColumnIndex();
		TESTCASEIDCOLUMNINDEX = CommonUtils.getDefaultConfTestCaseIdExcelColumnIndex();
	}
	
	private static final Logger LOG = Logger.getLogger(TestExcelRepository.class.getName());
	
	public boolean loadFile(){
		return loadExcelFile(path);
	}
	
	public boolean loadExcelFile(Path path) {
		if(Objects.nonNull(path)){
			try{
				if(Objects.nonNull(excelWorkBook))
					excelWorkBook.close();
				excelWorkBook = new XSSFWorkbook(path.toFile());
				this.path = path;
				Registry.setAttribute(RegistryKey.WORKBOOK_EXCEL, excelWorkBook);
				return true;
			} catch (FileNotFoundException e) {
				LOG.error("File is not available at the given Path[" + path + "]");
				return false;
			} catch (IOException e) {
				LOG.error("Error occurred while read/write operation on file.");
				return false;
			} catch (Exception e) {
				LOG.error("Unknown error occurred while loading excel file.",e);
				return false;
			}
		}else{
			LOG.error("Path cannot be empty for loading ExcelBook.");
			return false;
		}
	}

	public String getCellDataOnTestCase(String testCase, int columnIndex, String sheetName) {
		LOG.info("ExcelRead request recieved with TestCase["+testCase+"], ColumnIndex["+columnIndex+"] and SheetName["+sheetName+"].");
		sheet = excelWorkBook.getSheet(sheetName);
		int rowNum = getRowIdContainsTestCase(testCase, TESTCASEIDCOLUMNINDEX, sheet);
		cell = sheet.getRow(rowNum).getCell(columnIndex);
		String cellData =  null;
		if(Objects.nonNull(cell))
			cellData = cell.getStringCellValue();			
		LOG.info("Found value for TestCase["+testCase+"] with ColumnIndex["+columnIndex+"] and RowIndex["+rowNum+"] is: " + cellData);
		return cellData;
	}

	public int getRowIdContainsTestCase(String testCase, int testCaseColNum, XSSFSheet sheet) {
		if(Objects.nonNull(sheet)){
			int lastRowInSheet = sheet.getLastRowNum();
			for (int i = 0; i <=lastRowInSheet; i++) {
				if (getCellData(i, testCaseColNum, sheet).equalsIgnoreCase(testCase)) {
					LOG.debug("TestCase["+testCase+"] with ColumnIndex["+testCaseColNum+"] found in RowIndex["+i+"].");
					return i;
				}
			}
		}
		throw new ExcelReadWriteException("Couldn't find TestCase["+testCase+"] entry from ColumnIndex["+testCaseColNum+"].");
	}

	public void updateTestCaseResultToExcel(String result, String testCase, String sheetName) {
			updateTestCaseResultToExcel(result, testCase, sheetName, RESULTCOLUMNINDEX);
	}

	public void updateTestCaseResultToExcel(String result, String testCase, String sheetName, int columnIndex) {
		LOG.info("ExcelWrite[Data:["+result+"]] request received for Sheet["+sheetName+"] with SearchContent["+testCase+"] match for RowIndex, at ColumnIndex["+columnIndex+"].");
		try{
			sheet = excelWorkBook.getSheet(sheetName);
			int rowNum = getRowIdContainsTestCase(testCase, FanniemaeConstants.TEST_CASE_ID, sheet);
			row = excelWorkBook.getSheet(sheetName).getRow(rowNum);
			cell = row.getCell(columnIndex);
			if (Objects.isNull(cell)) {
				cell = row.createCell(columnIndex);
				cell.setCellValue(result);
			} 
			else
				cell.setCellValue(result);
			flush();
			LOG.info(UtilContent.FORMAT + rowNum + UtilContent.FORMAT + columnIndex + UtilContent.FORMAT + result);
		} catch (Exception e) {
			String msg = "Error occurred in writing TestCase["+testCase+"] Result["+result+"] to ExcelSheet["+sheetName+":[["+columnIndex+"]].";
			LOG.error(msg);
			throw new ExcelReadWriteException(msg,e);
		}
	}

	public String[][] loadTestDataToArrayWithSheetName(Path path, String sheetName) {
		String[][] excelData = null;
		try(XSSFWorkbook workbook = new XSSFWorkbook(path.toFile())){
			sheet = workbook.getSheet(sheetName);
			int totalRows = sheet.getLastRowNum();
			int totalColumns = sheet.getRow(1).getLastCellNum() - 1;
			excelData = new String[totalRows][totalColumns];
			for (int i = 1; i <= totalRows; i++) {
				for (int j = 0; j< totalColumns; j++) {
					excelData[i-1][j] = getCellData(i, j, sheet);
				}
			}
		}catch(Exception e){
			throw new ExcelReadWriteException("Error occurred while loading complete TestData from ExcelSheet["+sheetName+"] to String[][].",e);
		}
		return excelData;
	}

	public String getCellData(int rowNum, int colNum, XSSFSheet sheet) {
		try {
			return new DataFormatter().formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		} catch (Exception e) {
			String msg = "Error occurred while parsing data from sheet with RowIndex["+rowNum+"] ColumnIndex["+colNum+"].";
			LOG.error(msg);
			throw new ExcelReadWriteException(msg,e);
		}
	}

	public void updateTestCaseCommentToExcel(String testCaseID, String sheetname, String errorMessage) {
		try {
			sheet = excelWorkBook.getSheet(sheetname);
			int rowIndex = getRowIdContainsTestCase(testCaseID, TESTCASEIDCOLUMNINDEX, sheet);
			row = sheet.getRow(rowIndex);
			cell = row.getCell(COMMENTCOLUMNINDEX);
			if (cell == null)
				cell = row.createCell(COMMENTCOLUMNINDEX);
			cell.setCellValue(errorMessage);
			LOG.info(UtilContent.FORMAT + rowIndex + UtilContent.FORMAT + "writing process completed.");
		} catch (Exception e) {
			LOG.error(UtilContent.GEN_ERR_MSG);
			throw new ExcelReadWriteException(UtilContent.GEN_ERR_MSG);
		}
	}

	public void flush(){
		if(Objects.nonNull(path)){
			try(FileOutputStream outputStream = new FileOutputStream(path.toFile())){
					excelWorkBook.write(outputStream);
			}catch(Exception e){
				String msg = "Unknown error occurred while writing the data to pysical location["+path+"].";
				LOG.error(msg,e);
				throw new ExcelReadWriteException(msg,e);
			}
		}else {
			LOG.error("ExceBook destination path cannot be null/empty to write data.");		
		}
	}
	
	public void close(){
		try {
			closeBook();
			LOG.debug("Closed Book and OutputStream of Excel Repository.");
		} catch (Exception e) {
			String msg = "Unknown error occurred while closing the workbook.";
			LOG.error(msg,e);
			throw new ExcelReadWriteException(msg,e);
		}
	}
	
	private void closeBook() throws IOException {
		if(Objects.nonNull(excelWorkBook))
			excelWorkBook.close();
		excelWorkBook = null;
	}
	
	public void closeOnFlush(){
		flush();
		close();
	}
	
	static final class UtilContent {
		private UtilContent() {}
		public static final String GEN_ERR_MSG = "Error in writing the value in excel file".intern();
		public static final String FORMAT =  "----------------".intern();
	}
}