package com.techouts.fanniemae.testcases;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.executeJS;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.webElementHighlighter;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;
import com.fanniemae.automation.Elementsfactory.model.approval;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.lowagie.text.factories.ElementFactory;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class CreateContractMasterServicesAgreement extends AbstractTest {
	private static final Logger LOG = Logger.getLogger(CreateContractMasterServicesAgreement.class.getName());
	
	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int homePageTitle = FanniemaeConstants.L;
	
	static {
		Elementsfactory elementsfactory=new Elementsfactory();
		elementsfactory.init(DRIVER);
		
		HOMEPAGE_ACTIONS=new HomePageActions(elementsfactory, DRIVER);
	}
	
	
	@Test(priority = 5)
	public void createContractMasterServicesAgreement() {
		String testCaseNumber = "5";
		String testCaseName = "createContractMasterServicesAgreement";
		try {
			getFannieMaePage();
			Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseNumber);
			Assert.assertTrue(HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME)),"Login to the application failed");
			captureScreenShotOnPass(getDriver(), testCaseName);
			HOMEPAGE_ACTIONS.createMasterServicesAgreement(testCaseName, testCaseNumber,DEFAULT_SHEET_NAME);
			webElementHighlighter(getDriver(),approval.saveButton);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,approval.saveButton);
			park(2);
			waitForPageLoad(getDriver(), 15);
			
			webElementHighlighter(getDriver(),approval.contractTeamSet);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,approval.contractTeamSet);
			park(2);
			waitForPageLoad(getDriver(), 15);
			WebElementOperations.click(getDriver(), approval.saveButtonMarkC);
			click(getDriver(), approval.approveButton);
			HOMEPAGE_ACTIONS.logout(testCaseName);
			addPassedTestCaseResult(testCaseName);
			LOG.info("Successfully create contract Master services Agreement");
		} catch (Exception e) {
			performPostExceptionProcess(testCaseName, testCaseNumber, "contractMasterServicesAgreement has failed", e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	
}
