package com.fanniemae.automation.test;



import java.io.FileOutputStream;
import java.nio.file.Path;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.dao.WorkbookOperations;
import com.fanniemae.automation.driver.WebDriverProducer;
import com.fanniemae.automation.dto.mail.MailParam;
import com.fanniemae.automation.dto.testcase.SuiteResult;
import com.fanniemae.automation.dto.testcase.TestCaseResult;
import com.fanniemae.automation.enums.Browser;
import com.fanniemae.automation.mail.DefaultMailService;
import com.fanniemae.automation.mail.MailContentPreparer;
import com.fanniemae.automation.registry.Registry;
import com.fanniemae.automation.registry.RegistryKey;
import com.fanniemae.automation.repo.TestExcelRepository;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.test.page.actions.CreateRequistion;
import com.fanniemae.automation.test.page.actions.CorporateSupplier;
import com.fanniemae.automation.test.page.actions.CreateContractMaster;
import com.fanniemae.automation.test.page.actions.RealEstateBroker;
import com.fanniemae.automation.util.CommonUtils;
import com.fanniemae.automation.util.PathProvider;
import com.fanniemae.automation.util.TestReportGenerator;
import com.fanniemae.automation.webElements.model.WebElements;
import com.techouts.fanniemae.exceptions.FannieMaeBusinessException;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public abstract class AbstractTest implements AbstractPerformer
{
	
	protected static final WebDriver DRIVER;
	protected static final String DEFAULT_SHEET_NAME;
	protected static final String DEFAULT_WORKBOOK_NAME;
	protected static final TestExcelRepository REPOSITORY;
	protected static final WorkbookOperations VIRTUAL_BOOK_REPOSITORY;
	protected static final boolean IS_EXCEL_MOD_IN_BEFORE_CLASS;
	protected static final boolean IS_EXCEL_MOD_IN_BEFORE_SUITE;
	protected static final Path WORKBOOK_PATH;
	protected static final String CHROME_SYS_PROP_KEY = "webdriver.chrome.driver";
	protected static final String FIREFOX_SYS_PROP_KEY = "webdriver.gecko.driver";
	protected static final String IE_SYS_PROP_KEY = "webdriver.ie.driver";
	protected static  HomePageActions HOMEPAGE_ACTIONS;
	
	
	protected static final Logger LOG = Logger.getLogger(AbstractTest.class.getName()); 
	
	
	static{
		
		
		DEFAULT_SHEET_NAME = PathProvider.getDefaultConfiguredWorkbookSheetName();
		DEFAULT_WORKBOOK_NAME = PathProvider.getDefaultConfiguredWorkbookName();
		DRIVER = WebDriverProducer.getWebDriver(CommonUtils.getConfiguredDriverBrowser(), CommonUtils.getConfiguredCapabilities());
		//WEBELEMENTFACTORY = PageFactory.initElements(DRIVER, WebElementFactory.class);
//		WEBELEMENTFACTORY=PageFactory.initElements(DRIVER, Elementsfactory.class);
//        WEBELEMENTS1=PageFactory.initElements(DRIVER,WebElements.class);
		WORKBOOK_PATH = PathProvider.getTestDataFilePath();
		REPOSITORY = new TestExcelRepository();
		VIRTUAL_BOOK_REPOSITORY = new WorkbookOperations(WORKBOOK_PATH);
//		HOMEPAGE_ACTIONS = new HomePageActions(WEBELEMENTFACTORY, DRIVER);
		//CreateRequistion = new CreateRequistion(WEBELEMENTFACTORY, DRIVER);
		//CorporateSupplier=new CorporateSupplier(WEBELEMENTFACTORY, DRIVER);
		//CreateContractMaster=new CreateContractMaster(WEBELEMENTFACTORY, DRIVER);
		//RealEstateBroker=new RealEstateBroker(WEBELEMENTFACTORY, DRIVER);
		Elementsfactory elementFactory =	new Elementsfactory();
		elementFactory.init(DRIVER);
		
//		WebElements  elements=new WebElements();
//		elements.init(DRIVER);
		IS_EXCEL_MOD_IN_BEFORE_SUITE = CommonUtils.getConfigForExcelModInBeforeSuiteContext();
		IS_EXCEL_MOD_IN_BEFORE_CLASS = (!IS_EXCEL_MOD_IN_BEFORE_SUITE) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue();
	}
	
	@BeforeClass
	public void beforeClass(){
		this.performBeforeClass();
	}
	
	@AfterClass
	public void afterClass(){
		this.performAfterClass();
	}
	
	@Override
	public void performBeforeClass(){
		LOG.debug("Performing BeforeClass operation.");
		if(IS_EXCEL_MOD_IN_BEFORE_CLASS){
			boolean isLoaded = REPOSITORY.loadExcelFile(WORKBOOK_PATH);
			if(!isLoaded){
				int exitCode = 1;
				LOG.error("Error occurred while loading ExcelBook. exiting system with ErrorCode:"+exitCode);
				System.exit(exitCode);
			}
		}
	}
	
	@Override
	public void performAfterClass(){
		LOG.debug("Performing AfterClass operation.");
		if(IS_EXCEL_MOD_IN_BEFORE_CLASS)
			REPOSITORY.close();
	}
	
	@Override
	public void init(){
		LOG.debug("TestNG suite execution started. initializing all the application dependencies.");
		Registry.setAttribute(RegistryKey.SUITE_EXE_START_TIME, new Date());
		//String timestamp = (String)Registry.getAttribute(RegistryKey.DIR_TIMESTAMP_SUFFIX);
		String timestamp = CommonUtils.getCurExeDirTimestamp();
		CommonUtils.checkAndCreateProjStructure();
		CommonUtils.genScreenshotDirsForCurrentExe(timestamp);
		Registry.setAttribute(RegistryKey.DEFAULT_CONFIGURED_BROWSER, CommonUtils.getConfiguredDriverBrowser());
		Registry.setAttribute(RegistryKey.TEST_SUITE_RESULT, new SuiteResult());
		Registry.setAttribute(RegistryKey.MAIL_PARAM, new MailParam());
		Registry.setAttribute(RegistryKey.CURRENT_EXE_SNAP_ROOT_PATH, PathProvider.getCurExecScreenshotRootDir(timestamp));
		Registry.setAttribute(RegistryKey.EXCEL_RESULT_COL_INDEX, CommonUtils.getDefaultConfTestCaseResultExcelColumnIndex());
		Registry.setAttribute(RegistryKey.EXCEL_RESULTCOMMENT_COL_INDEX, CommonUtils.getDefaultConfTestCaseResultCommentExcelColumnIndex());
		Registry.setAttribute(RegistryKey.EXCEL_DEFAULT_CONFIGURED_SHEET_NAME, PathProvider.getDefaultConfiguredWorkbookSheetName());
		Registry.setAttribute(RegistryKey.EXCEL_DEFAULT_CONFIGURED_WORKBOOK_NAME, PathProvider.getDefaultConfiguredWorkbookName());
		Registry.setAttribute(RegistryKey.PDF_REPORT_FILE_PATH, PathProvider.getGenPDFReportFilePath(timestamp));
		if(IS_EXCEL_MOD_IN_BEFORE_SUITE){
			boolean isLoaded = REPOSITORY.loadExcelFile(WORKBOOK_PATH);
			if(!isLoaded){
				int exitCode = 1;
				LOG.error("Error occurred while loading ExcelBook. exiting system with ErrorCode:"+exitCode);
				System.exit(exitCode);
			}
		}
		LOG.debug("Initializing completed for application dependencies.");
	}
	
	@Override
	public void destroy(){
		LOG.debug("Performing post suite execution operation and Destroying all the initialized content.");
		Registry.setAttribute(RegistryKey.SUITE_EXE_END_TIME, new Date());
		WebDriverProducer.closeAll();
		if(IS_EXCEL_MOD_IN_BEFORE_SUITE)
			REPOSITORY.close();
		new TestReportGenerator().generate();
		triggerEmail();
		Object obj = Registry.getAttribute(RegistryKey.PDF_REPORT_OUTPUT_STREAM);
		if(Objects.nonNull(obj))
			IOUtils.closeQuietly((FileOutputStream)obj);
		
		
		Registry.removeAll();
		try{
			Runtime.getRuntime().exec(CommonUtils.getConfiguredWebDriverKillCommand());
		}catch(Exception e){
			LOG.warn("Unable to perform WebDriver process kill operation. kill the process manually to speed-up machine");
		}
		LOG.debug("TestNG suite execution finished.");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		this.init();
	}
	
	@AfterSuite
	public void afterSuite() {
		this.destroy();
	}
	
	
	
	private void triggerEmail(){
		LOG.debug("Preparing neccessary Data for email.");
		new MailContentPreparer().prepare();
		MailParam mailParam = (MailParam)Registry.getAttribute(RegistryKey.MAIL_PARAM);
		SuiteResult suiteResult = (SuiteResult)Registry.getAttribute(RegistryKey.TEST_SUITE_RESULT);
		new DefaultMailService(mailParam, suiteResult).transport();
	}
	
	static{
		LOG.debug("Setting up system properties for Selenium WebDriver.");
		System.setProperty(CHROME_SYS_PROP_KEY, PathProvider.getForDriver(Browser.CHROME).toString());
		System.setProperty(FIREFOX_SYS_PROP_KEY, PathProvider.getForDriver(Browser.FIREFOX).toString());
		System.setProperty(IE_SYS_PROP_KEY, PathProvider.getForDriver(Browser.IE).toString());
	}
	
	protected boolean addFailedTestCaseResult(String testCaseName, String comment) {
		getSuiteResult().setTestCaseResult(getTestCaseResult(testCaseName, FanniemaeConstants.FALSE, comment));
		return true;
	}
	
	protected boolean addPassedTestCaseResult(String testCaseName) {
		getSuiteResult().setTestCaseResult(getTestCaseResult(testCaseName, FanniemaeConstants.TRUE, null));
		return true;
	}
	
	private TestCaseResult getTestCaseResult(String testCaseName, boolean isPassed, String comment) {
		return (StringUtils.isNotBlank(comment)) ? new TestCaseResult(testCaseName, isPassed, comment) : new TestCaseResult(testCaseName, isPassed);
	}
	
	private SuiteResult getSuiteResult() {
		SuiteResult suiteResult = (SuiteResult)Registry.getAttribute(RegistryKey.TEST_SUITE_RESULT);
		if(Objects.isNull(suiteResult)) {
			suiteResult = new SuiteResult();
			Registry.setAttribute(RegistryKey.TEST_SUITE_RESULT, suiteResult);
		}
		return suiteResult;
	}
	
	protected void getPage(String url) {
		DRIVER.get(url);
		DRIVER.manage().window().maximize();
	}
	
	protected void getFannieMaePage() {
		DRIVER.get(PathProvider.getFannieMaeBaseURL());
		DRIVER.manage().window().maximize();
	}

	public void performPostExceptionProcess(String testCaseName, String testCaseIdFromExcel, String comment, Exception e, String sheetName) {
		LOG.info("performPostExceptionProcess for Error occurred at method: " + testCaseName + ". comment:" + comment);
		try {
			addFailedTestCaseResult(testCaseName, comment);
			catchBlockupdate(testCaseName, testCaseIdFromExcel, sheetName);
			HOMEPAGE_ACTIONS.logout(testCaseName);
			throw new FannieMaeBusinessException("throwing exception to make sure capturing testcase result to testNG",e);
		}catch(Exception ex) {
			throw new FannieMaeBusinessException("throwing exception to make sure capturing testcase result to testNG",ex);
		}
		
	}
	
	private void catchBlockupdate(String testCaseName, String testCaseIdFromExcel, String sheetName) {
		try {
			WebElementOperations.captureScreenShotOnFail(DRIVER, testCaseName);
		} catch (Exception e) {
			LOG.error("Error occurred while performing post exception process for testCaseName:"+testCaseName+", testCaseIdFromExcel:"+testCaseIdFromExcel+", to ExcelSheet:"+sheetName);
		}
	}
	
	
//	public static Elementsfactory getWebElementFactory(){
//		return WEBELEMENTFACTORY ;
//	}
	
	protected WebDriver getDriver(){
		return DRIVER;
	}
	
	public static TestExcelRepository getExcelRepository(){
		return REPOSITORY;
	}
	
	public static String getDefaultConfiguredWorkbookSheetName(){
		return DEFAULT_SHEET_NAME;
	}
	
	public static String getDefaultConfiguredWorkbookName(){
		return DEFAULT_WORKBOOK_NAME;
	}
	
	public static boolean isExcelModPermissionAvailableInBeforeClass(){
		return IS_EXCEL_MOD_IN_BEFORE_CLASS;
	}
	
	public static boolean isExcelModPermissionAvailableInBeforeSuite(){
		return IS_EXCEL_MOD_IN_BEFORE_CLASS;
	}
}