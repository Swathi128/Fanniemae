package com.fanniemae.automation.registry;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.enums.Browser;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public final class RegistryKey {
	private RegistryKey() {}
	
	public static final String TEST_SUITE_RESULT = "test-suite.result".intern();
	public static final String WORKBOOK_EXCEL = "workbook.excel".intern();
	public static final String WORKBOOK_VIRTUAL = "workbook.virtual".intern();
	public static final String DAO_EXCEL = "dao.excel".intern();
	public static final String ZIPPED_REPORTS = "zipped.reports".intern();
	public static final String CURRENT_EXE_SNAP_ROOT_PATH = "current.exe.snap.root.path".intern();
	public static final String SUITE_EXE_START_TIME = "suite.execution.start.time".intern();
	public static final String SUITE_EXE_END_TIME = "suite.execution.end.time".intern();
	public static final String MAIL_PARAM = "mail.param".intern();
	public static final String DEFAULT_WEB_DRIVER = "webdriver".intern();
	public static final String CHROME_DRIVER = Browser.CHROME.toString();
	public static final String IE_DRIVER = Browser.IE.toString();
	public static final String FIREFOX_DRIVER = Browser.FIREFOX.toString();
	public static final String EXCEL_RESULT_COL_INDEX = FanniemaeConstants.EXCEL_RESULT_COL_INDEX;
	public static final String EXCEL_RESULTCOMMENT_COL_INDEX = FanniemaeConstants.EXCEL_RESULTCOMMENT_COL_INDEX;
	public static final String EXCEL_TESTCASEID_COL_INDEX = FanniemaeConstants.EXCEL_TESTCASEID_COL_INDEX;
	public static final String EXCEL_DEFAULT_CONFIGURED_SHEET_NAME = FanniemaeConstants.TEST_DATA_DEFAULT_WORKBOOK_SHEET_NAME;
	public static final String EXCEL_DEFAULT_CONFIGURED_WORKBOOK_NAME = FanniemaeConstants.TEST_DATA_DEFAULT_WORKBOOK_NAME;
	public static final String PDF_REPORT_OUTPUT_STREAM = "pdf.report.output.stream";
	public static final String PDF_REPORT_FILE_PATH = "pdf.report.file-path";
	public static final String DEFAULT_CONFIGURED_BROWSER = "pdf.report.file-path";
	public static final String DIR_TIMESTAMP_SUFFIX = "dir.timestamp.suffix";
}