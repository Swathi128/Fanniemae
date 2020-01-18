package com.fanniemae.automation.util;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Capabilities;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.enums.Browser;
import com.fanniemae.automation.registry.Registry;
import com.fanniemae.automation.registry.RegistryKey;
import com.fanniemae.automation.util.exceptions.FannieMaeBusinessException;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class CommonUtils {
	
	private CommonUtils() {}
	
	private static final String RUN = "RUN_";
	private static final Logger LOG = Logger.getLogger(CommonUtils.class.getName());
	
	public static void genScreenshotDirsForCurrentExe(String timestamp) {
		if(StringUtils.isNotBlank(timestamp)){
			try {
				Path screenshotDir = PathProvider.getForScreenshotsDir();
				Path curExeDir = Paths.get(screenshotDir.toString(),RUN + timestamp);
				FileUtils.forceMkdir(curExeDir.toFile());
				FileUtils.forceMkdir(Paths.get(curExeDir.toString(), FanniemaeConstants.PASSED).toFile());
				FileUtils.forceMkdir(Paths.get(curExeDir.toString(), FanniemaeConstants.FAILED).toFile());
				Registry.setAttribute(RegistryKey.CURRENT_EXE_SNAP_ROOT_PATH,curExeDir);
			}catch(IOException e) {
				throw new FannieMaeBusinessException("Error occurred while creating the Directories for current execution",e);
			}
		}else {
			LOG.error("Program current execution timestamp cannot be empty, it leads to wrong filename generations for the session.");
		}
	}
	
	public static String getTimestamp(String format) {
		return new SimpleDateFormat(format).format(new Date());
	}
	
	public static Browser getConfiguredDriverBrowser() {
		Object obj = Registry.getAttribute(RegistryKey.DEFAULT_CONFIGURED_BROWSER);
		return (Objects.nonNull(obj)) ? ((Browser)obj) : Browser.valueOf(PropertyUtil.getString(FanniemaeConstants.DRIVER_BROWSER));
	}
	
	public static Capabilities getConfiguredCapabilities() {
		return null;
	}
	
	public static XSSFWorkbook getWorkbookFromRegistry() {
		return (XSSFWorkbook)Registry.getAttribute(RegistryKey.WORKBOOK_EXCEL);
	}
	
	public static int getDefaultConfTestCaseResultExcelColumnIndex() {
		Object obj = Registry.getAttribute(RegistryKey.EXCEL_RESULT_COL_INDEX);
		if(Objects.nonNull(obj))
			return ((Integer)obj).intValue();
		else
			return PropertyUtil.getInt(FanniemaeConstants.EXCEL_RESULT_COL_INDEX);
	}
	
	public static int getDefaultConfTestCaseResultCommentExcelColumnIndex() {
		Object obj = Registry.getAttribute(RegistryKey.EXCEL_RESULTCOMMENT_COL_INDEX);
		if(Objects.nonNull(obj))
			return ((Integer)obj).intValue();
		else
			return PropertyUtil.getInt(FanniemaeConstants.EXCEL_RESULTCOMMENT_COL_INDEX);
	}
	
	public static int getDefaultConfTestCaseIdExcelColumnIndex() {
		Object obj = Registry.getAttribute(RegistryKey.EXCEL_TESTCASEID_COL_INDEX);
		if(Objects.nonNull(obj))
			return ((Integer)obj).intValue();
		else
			return PropertyUtil.getInt(FanniemaeConstants.EXCEL_TESTCASEID_COL_INDEX);
	}

	public static boolean getConfigForExcelModInBeforeSuiteContext() {
		return PropertyUtil.getString(FanniemaeConstants.IS_EXCEL_MOD_BEFORE_SUITE).equalsIgnoreCase(FanniemaeConstants.Y_FLAG) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue();
	}
	
	public static void checkAndCreateProjStructure(){
		Path gen = PathProvider.getForGenDir();
		Path screenshots = PathProvider.getForScreenshotsDir();
		Path misc = PathProvider.getForMiscDir();
		Path reports = PathProvider.getForReportsDir();
		Path logs = PathProvider.getForLogs();
			try {
				if(gen.toFile().exists())
					FileUtils.forceMkdir(gen.toFile());
				if(!screenshots.toFile().exists())
					FileUtils.forceMkdir(screenshots.toFile());
				if(!misc.toFile().exists())
					FileUtils.forceMkdir(misc.toFile());
				if(!reports.toFile().exists())
					FileUtils.forceMkdir(reports.toFile());	
				if(!logs.toFile().exists())
					FileUtils.forceMkdir(logs.toFile());	
			} catch (IOException e) {
				throw new FannieMaeBusinessException("Error occurred while creating project structure.",e);
		}
	}
	
	public static String getConfiguredWebDriverKillCommand(){
		Browser browser = getConfiguredDriverBrowser();
		if(Objects.nonNull(browser)){
			switch (browser) {
				case IE: return PropertyUtil.getString(FanniemaeConstants.IE_PROCESS_KILL);
				case FIREFOX: return PropertyUtil.getString(FanniemaeConstants.FIREFOX_PROCESS_KILL);
				default: return PropertyUtil.getString(FanniemaeConstants.CHROME_PROCESS_KILL);
			}
		}
		return PropertyUtil.getString(FanniemaeConstants.CHROME_PROCESS_KILL);
	}
	
	public static String getCurExeDirTimestamp() {
		Object object = Registry.getAttribute(RegistryKey.DIR_TIMESTAMP_SUFFIX);
		if(Objects.nonNull(object)) {
			return (String)object;
		}else {
			String timestamp = new SimpleDateFormat(FanniemaeConstants.DDMMYYHHMMSSSSS).format(new Date());
			Registry.setAttribute(RegistryKey.DIR_TIMESTAMP_SUFFIX, timestamp);
			return timestamp;
		}}
}