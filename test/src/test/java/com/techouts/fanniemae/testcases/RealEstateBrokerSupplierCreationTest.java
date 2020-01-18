package com.techouts.fanniemae.testcases;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.acceptAlertIfPresent;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.executeJS;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getTimeStamp;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForElementPresence;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.webElementHighlighter;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;
import com.fanniemae.automation.Elementsfactory.model.RealEstateBroker;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.lowagie.text.factories.ElementFactory;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class RealEstateBrokerSupplierCreationTest extends AbstractTest {
	
	private static final Logger LOG = Logger.getLogger(RealEstateBrokerSupplierCreationTest.class.getName());
	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int homePageTitle = FanniemaeConstants.L;
	private int supplierType= FanniemaeConstants.AD;
	private int legalName= FanniemaeConstants.AF;
	private int addressLine1= FanniemaeConstants.AG;
	private int city= FanniemaeConstants.AH;
	private int zip= FanniemaeConstants.AI;
	private int state= FanniemaeConstants.AJ;
	private int country= FanniemaeConstants.AK;
	private static int additional = FanniemaeConstants.AN;
	private int equatorId= FanniemaeConstants.AY;
	CorporateSupplierCreationTest corporateSupplierCreationTest;
	static {
		Elementsfactory elementFactory=new Elementsfactory();
		elementFactory.init(DRIVER);
		
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory,DRIVER);
	}
	
	@Test(priority = 4)
	public void createRealEstateBrokerSupplier() {
		String testCaseNumber = "4";
		String testCaseName = "CreateRealEstateBrokerSupplier";
		corporateSupplierCreationTest=new CorporateSupplierCreationTest();
		try {
			getFannieMaePage();
			String legalNameUpdate=REPOSITORY.getCellDataOnTestCase(testCaseNumber, legalName, DEFAULT_SHEET_NAME);
		  	Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseName);
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker(testCaseName, testCaseNumber, legalNameUpdate),"Fails to add Main Info Details due to issue");
			Assert.assertTrue(additionalInfoOfRealEstateBroker(testCaseName,testCaseNumber),"Fails during add additional information");
			waitForPageLoad(getDriver(),15);
			String email="test"+getTimeStamp(FanniemaeConstants.DDMMYYHHMMSSSSS)+"@testing.com";
			corporateSupplierCreationTest.contactInfoForCreateSupplier2(testCaseName,testCaseNumber,"BPC","Test",email);
			park(2);
			supplierContactManagement(testCaseName,email,"12345");
			dropDownByTextVisibility(getDriver(),RealEstateBroker.supplierRole ,"Broker Assistant / Backup");
			park(2);
			dropDownByTextVisibility(getDriver(), RealEstateBroker.supplierRole, "Broker Primary Contact");
			webElementHighlighter(getDriver(), RealEstateBroker.createSupplierSaveButton);
			//executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBroker.createSupplierSaveButton);
			park(2);
			waitForPageLoad(getDriver(), 15);
			email="test"+getTimeStamp(FanniemaeConstants.DDMMYYHHMMSSSSS)+"@testing.com";;
			corporateSupplierCreationTest.contactInfoForCreateSupplier2(testCaseName,testCaseNumber,"BO","Test",email);
			park(2);
			supplierContactManagement(testCaseName,email,"12345");
			park(0.5);
			dropDownByTextVisibility(getDriver(), RealEstateBroker.supplierRole2, "MLA Signer");
			park(0.5);
			dropDownByTextVisibility(getDriver(), RealEstateBroker.supplierRole2, "Broker / Owner");
			park(0.5);
			dropDownByTextVisibility(getDriver(), RealEstateBroker.supplierRole2, "Main RFx contact");
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), RealEstateBroker.createSupplierSaveButton);
			park(2);
			waitForPageLoad(getDriver(), 15);executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBroker.createSupplierSaveButton);
			approvalWorkflowForRealEstateBroker(testCaseName);
			click(getDriver(), RealEstateBroker.mainInfoTab);
			park(1);
			waitForPageLoad(getDriver(), 15);
			webElementHighlighter(getDriver(), RealEstateBroker.supplierId);
			String supplierId=RealEstateBroker.supplierId.getText();
			LOG.info("Supplier ID is "+supplierId);
			park(1);
			//Assert.assertTrue(HOMEPAGE_ACTIONS.searchAndVerifyCreatedOne(testCaseName,testCaseNumber, supplierId, DEFAULT_SHEET_NAME),"After create supplier search and find supplier fails");
			HOMEPAGE_ACTIONS.logout(testCaseName);
			addPassedTestCaseResult(testCaseName);
		} catch (Exception e) {
			String msg = "TestCase["+testCaseName+"] has failed.";
			LOG.error(msg,e);
			performPostExceptionProcess(testCaseName, testCaseNumber, msg, e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	
	public boolean clickOnThreeDotsAndSelectData(String testCaseName,WebElement button,String searchText){
		try {
			click(getDriver(),button);
			switchToFrame(getDriver(), 0);
			captureScreenShotOnPass(getDriver(), testCaseName);
			sendKeys(getDriver(),RealEstateBroker.createSupplierBankInfoSearchBox,searchText);
			click(getDriver(),RealEstateBroker.createSupplierBankInfoSearchBtn);
			click(getDriver(),RealEstateBroker.createSupplierBankInfoClickOnResult);
			switchToDefaultContentFrame(getDriver());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	private boolean mainInfoDetailsOfRealEstateBroker(String testCaseName, String testCaseNumber, String legalNameUpdate){
		try {
			//Navigate corporate
			click(getDriver(),RealEstateBroker.createSupplierSupplierLink);
			click(getDriver(), RealEstateBroker.createSupplierLink);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			
			//create Corpora
			dropDownByTextVisibility(getDriver(), RealEstateBroker.createSupplierSupplierType, REPOSITORY.getCellDataOnTestCase(testCaseNumber, supplierType, DEFAULT_SHEET_NAME));
			park(4);
			waitForPageLoad(getDriver(), 15);
			park(4);
			sendKeys(getDriver(),RealEstateBroker.createSupplierLegalName,legalNameUpdate);
			sendKeys(getDriver(),RealEstateBroker.createSupplierMainSupplierAddressNameAdditional,"Test Address");
			sendKeys(getDriver(),RealEstateBroker.createSupplierAddressLine1,REPOSITORY.getCellDataOnTestCase(testCaseNumber, addressLine1, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBroker.createSupplierCity,REPOSITORY.getCellDataOnTestCase(testCaseNumber, city, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBroker.createSupplierZip,REPOSITORY.getCellDataOnTestCase(testCaseNumber, zip, DEFAULT_SHEET_NAME));
			HOMEPAGE_ACTIONS.autoSuggestionHandle(RealEstateBroker.createSupplierState, REPOSITORY.getCellDataOnTestCase(testCaseNumber, state, DEFAULT_SHEET_NAME));
			dropDownByTextVisibility(getDriver(), RealEstateBroker.createSupplierCountry, REPOSITORY.getCellDataOnTestCase(testCaseNumber, country, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBroker.createSupplierRealEstateBrokerEquatorIdEVID,REPOSITORY.getCellDataOnTestCase(testCaseNumber, equatorId, DEFAULT_SHEET_NAME));
			click(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerUsingWeb);
			click(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerIsPayable);
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(),RealEstateBroker.createSupplierSaveButton);
			executeJS(getDriver(), FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBroker.createSupplierSaveButton);
			return true;
		}
		catch (Exception e) 
		{
			LOG.error("Fails to add main info details fo Real Estate Broker Suppler");
			return false;
		}
	}
	private boolean approvalWorkflowForRealEstateBroker(String testCaseName){
		try {
			//ApprovalWorkflowTab
			click(getDriver(), RealEstateBroker.createSupplierApprovalWorkflowTab);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			//waitForElementPresence(getDriver(), getWebElementFactory().realEstateBroker.createSupplierApprovalWorkflowSubmitForDiligence, 15);
			click(getDriver(), RealEstateBroker.createSupplierApprovalWorkflowSubmitForDiligence);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBroker.createSupplierApprovalWorkflowSubmitToWorkflow);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerContinueOnBoarding);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerProfileDocumentUpdate);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerApprove);
			park(2);
			
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerNoFindings);
			park(2);
			
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerTraxUpdated);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerProcureOneUpdated);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerACHInformationUpdated);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerApproveFinal);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			sendKeys(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerReason, "Test");
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBroker.createSupplierRealEstateBrokerReasonConfirm);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean additionalInfoOfRealEstateBroker(String testCaseName,String testCaseNumber){
		try {
			//Additional info
			click(getDriver(),RealEstateBroker.createSupplierAdditionalInfoTab);
			captureScreenShotOnPass(getDriver(), testCaseName);
			//Address
			sendKeys(getDriver(),RealEstateBroker.createSupplierNameAdditional, REPOSITORY.getCellDataOnTestCase(testCaseNumber, additional, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBroker.createSupplierAddInfoAddressLine1,REPOSITORY.getCellDataOnTestCase(testCaseNumber, addressLine1, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBroker.createSupplierAddInfoCity, REPOSITORY.getCellDataOnTestCase(testCaseNumber, city, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBroker.createSupplierAddInfoZip, REPOSITORY.getCellDataOnTestCase(testCaseNumber, zip, DEFAULT_SHEET_NAME));
			HOMEPAGE_ACTIONS.autoSuggestionHandle(RealEstateBroker.createSupplierAddInfoState,REPOSITORY.getCellDataOnTestCase(testCaseNumber, state, DEFAULT_SHEET_NAME));
			dropDownByTextVisibility(getDriver(),RealEstateBroker.createSupplierAddInfoCountry,REPOSITORY.getCellDataOnTestCase(testCaseNumber, country, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), RealEstateBroker.createSupplierSaveButton);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBroker.createSupplierSaveButton);
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}
	
	private boolean supplierContactManagement(String testCaseName,String email,String pass){
		try {
//			webElementHighlighter(getDriver(), getWebElementFactory().realEstateBroker.createSupplierSaveButton);
//		    park(2);
//			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().realEstateBroker.createSupplierSaveButton);
		park(3);
		waitForPageLoad(getDriver(), 15);
			click(getDriver(), RealEstateBroker.superLoginIcon);
			park(2);
			switchToDefaultContentFrame(getDriver());
			park(2);
			switchToFrame(getDriver(), 1);
			
			sendKeys(getDriver(),RealEstateBroker.superLoginlogin, email);
			sendKeys(getDriver(), RealEstateBroker.superLoginpassword,pass);
			webElementHighlighter(getDriver(), RealEstateBroker.createSupplierContactInfoSaveAndClose);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBroker.createSupplierContactInfoSaveAndClose);
			try {
				acceptAlertIfPresent(getDriver(), 3);
				LOG.info("Alert present");
			} catch (Exception e) {
				LOG.info("Alert is not present");
			}
			park(2);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 0);
			click(getDriver(), RealEstateBroker.regenaratePasswordButton);
			park(2);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 1);
			click(getDriver(), RealEstateBroker.regenaratepassword);
			park(2);
			WebElementOperations.click(getDriver(), RealEstateBroker.saveButtonMarkC);
			click(getDriver(), RealEstateBroker.regenaratePasswordClose);
			park(4);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 0);
			webElementHighlighter(getDriver(), RealEstateBroker.createSupplierContactInfoSaveAndClose);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBroker.createSupplierContactInfoSaveAndClose);
			park(2);
			switchToDefaultContentFrame(getDriver());			
			park(5);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
