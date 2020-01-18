package com.fanniemae.automation.test.page.actions;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getAttributeValue;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getText;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForElementClickable;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;


public class CreateContractMaster 
{
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private Elementsfactory elementFactory;
	private WebDriver driver = null;
	
	public CreateContractMaster(Elementsfactory elementfactory, WebDriver driver) {
		super();
		this.elementFactory = elementfactory;
		this.driver = driver;
	}
	
	private static int contractTitle =FanniemaeConstants.AZ;
	private static int contractType =FanniemaeConstants.BA;
	private static int supplier=FanniemaeConstants.BC;
	private static int costcenter=FanniemaeConstants.BD;
	private static int pepolesoftproject=FanniemaeConstants.BE;
	private static int primaryCategory=FanniemaeConstants.BF;
	private static int productsServicesDescription=FanniemaeConstants.BG;
	private static int contractStatusIndicator=FanniemaeConstants.BI;
	private static int statusUpdateNextSteps=FanniemaeConstants.BJ;
	private static int thirdPartyData=FanniemaeConstants.BO;
	private static int transactionLegalSME=FanniemaeConstants.BP;
	private static int chargedtheloan=FanniemaeConstants.BQ;
	private static int legal=FanniemaeConstants.BR;
	private static int createdfromPR=FanniemaeConstants.BS;
	private static int getBudgetBUApprovalProvidedinFieldglass=FanniemaeConstants.BU;
	
	public boolean createMasterServicesAgreement(String testCaseName,String testCaseNumber, String DEFAULT_SHEET_NAME){
		try {
			park(2);
			click(driver, elementFactory.createMasterServicesAgreement.contracts);
			click(driver, elementFactory.createMasterServicesAgreement.createcontract);
			waitForPageLoad(driver,15);
			captureScreenShotOnPass(driver, testCaseName);
			click(driver, elementFactory.createMasterServicesAgreement.cspviolation);
			captureScreenShotOnPass(driver, testCaseName);
			/////
			park(3);
			////
			sendKeys(driver, elementFactory.createMasterServicesAgreement.contractTitle, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractTitle, DEFAULT_SHEET_NAME));
			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.contractType,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractType, DEFAULT_SHEET_NAME));
			park(5);
			sendKeys(driver, elementFactory.createMasterServicesAgreement.supplier, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, supplier, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(3);
			waitForPageLoad(driver,15);
			sendKeys(driver, elementFactory.createMasterServicesAgreement.costcenter, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, costcenter, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(3);
			waitForPageLoad(driver,15);
			sendKeys(driver, elementFactory.createMasterServicesAgreement.pepolesoftproject, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, pepolesoftproject, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(3);
			waitForPageLoad(driver,15);
			click(driver, elementFactory.createMasterServicesAgreement.fileattach);
			captureScreenShotOnPass(driver, testCaseName);
			Runtime.getRuntime().exec(ADD_FILES_EXE);
			park(2);
			sendKeys(driver, elementFactory.createMasterServicesAgreement.primaryCategory, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, primaryCategory, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(3);
			waitForPageLoad(driver,15);
			sendKeys(driver, elementFactory.createMasterServicesAgreement.productsServicesDescription, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, productsServicesDescription, DEFAULT_SHEET_NAME));			
			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.contractStatusIndicator,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractStatusIndicator, DEFAULT_SHEET_NAME));
			sendKeys(driver, elementFactory.createMasterServicesAgreement.statusUpdateNextSteps, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, statusUpdateNextSteps, DEFAULT_SHEET_NAME));		
			//Approvals
			park(1);
			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.thirdPartyData,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, thirdPartyData, DEFAULT_SHEET_NAME));
			park(1);
			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.transactionLegalSME,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, transactionLegalSME, DEFAULT_SHEET_NAME));
			park(1);
			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.chargedtheloan,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, chargedtheloan, DEFAULT_SHEET_NAME));
			park(4);
			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.legal,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, legal, DEFAULT_SHEET_NAME));
			park(2);
			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.createdfromPR,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, createdfromPR, DEFAULT_SHEET_NAME));		
			park(3);
			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.budgetBUApprovalProvidedinFieldglass,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, getBudgetBUApprovalProvidedinFieldglass, DEFAULT_SHEET_NAME));			
			park(5);
			return true;
		}
		catch (Exception e) 
		{
			LOG.error("Failed to createMasterServicesAgreement ",e);
			return false;
		}
		
	}
	
}
