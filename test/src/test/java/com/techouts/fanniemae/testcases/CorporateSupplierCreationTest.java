package com.techouts.fanniemae.testcases;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.acceptAlertIfPresent;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.executeJS;
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
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.fanniemae.automation.Elementsfactory.model.ApprovalWorkFlow;
import com.fanniemae.automation.Elementsfactory.model.Contacts;
import com.fanniemae.automation.Elementsfactory.model.CreateSupplierBankingInfo;
import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;
import com.fanniemae.automation.Elementsfactory.model.RealEstateBroker;
import com.fanniemae.automation.Elementsfactory.model.Supplier;
import com.fanniemae.automation.consts.FanniemaeConstants;

import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;

import com.techouts.fanniemae.exceptions.FannieMaeBusinessException;

public class CorporateSupplierCreationTest extends AbstractTest {
	private static final Logger LOG = Logger.getLogger(CorporateSupplierCreationTest.class.getName());
	
	private static int userName = FanniemaeConstants.G;
	private static int password = FanniemaeConstants.H;
	private static int landingPageTitle = FanniemaeConstants.K;
	private static int homePageTitle = FanniemaeConstants.L;
	private static int legalName= FanniemaeConstants.AF;
	private static int supplierType = FanniemaeConstants.AD;
	private static int supplierClassification = FanniemaeConstants.AE;
	private static int addressLine1 = FanniemaeConstants.AG;
	private static int city = FanniemaeConstants.AH;
	private static int zip = FanniemaeConstants.AI;
	private static int state = FanniemaeConstants.AJ;
	private static int country = FanniemaeConstants.AK;
	private static int tinType = FanniemaeConstants.AL;
	private static int federalTaxID = FanniemaeConstants.AM;
	private static int searchText = FanniemaeConstants.AP;
	private static int bankName = FanniemaeConstants.AQ;
	private static int bankCity = FanniemaeConstants.AR;
	private static int abaRoutingNumber = FanniemaeConstants.AS;
	private static int accNumber = FanniemaeConstants.AT;
	private static int lastName = FanniemaeConstants.AU;
	private static int firstName = FanniemaeConstants.AV;
	private static int email = FanniemaeConstants.AW;
	private static int phone = FanniemaeConstants.AX;

	
	static {
		Elementsfactory elementFactory=new Elementsfactory();
		elementFactory.init(DRIVER);
		
		
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory,DRIVER);
	}
	@Test(priority = 3)
	public void createCorporateSupplier() {
		String testCaseNumber = "3";
		String testCaseName = "CreateCorporateSupplier";
		try {
			getFannieMaePage();
			String legalNameUpdate = REPOSITORY.getCellDataOnTestCase(testCaseNumber, legalName, DEFAULT_SHEET_NAME);
			Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME)),"Login to the application failed");
			captureScreenShotOnPass(getDriver(), testCaseName);
		Assert.assertTrue(mainInfoDeatilsOfCorporateSupplier(testCaseName,testCaseNumber, legalNameUpdate),"Fail during add supplier main/basic information");
		Assert.assertTrue(additionalInfoOfCorporateSupplier(testCaseName,testCaseNumber),"Fails during add additional information");
	    bankInfoForCreateSupplier(testCaseName,testCaseNumber);
			webElementHighlighter(getDriver(),Supplier.createSupplierSaveButton);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,Supplier.createSupplierSaveButton);
			try {
				acceptAlertIfPresent(getDriver(), 5);
			LOG.info("First alert is visible");
			} catch (Exception e) {
				LOG.info("First alert is not visible");
			}
			park(4);
			try {
				acceptAlertIfPresent(getDriver(), 5);
				LOG.info("second alert is visible");
			} catch (Exception e) {
				LOG.info("second alert is not visible");
		}
			park(2);
		waitForPageLoad(getDriver(),15);
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			park(2);
			click(getDriver(),Supplier.createSupplierBankInfoCloseButton);
			park(2);
			waitForPageLoad(getDriver(),15);
			park(2);
			switchToDefaultContentFrame(getDriver());
			park(3);
			waitForPageLoad(getDriver(),15);
			park(2);
			sendKeys(getDriver(),CreateSupplierBankingInfo.createSupplierBankingInformationSupplierEmailAddressForACHPaymentConf, "automation@test.com");
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), CreateSupplierBankingInfo.createSupplierSaveButton);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, CreateSupplierBankingInfo.createSupplierSaveButton);
			waitForPageLoad(getDriver(),15);
			contactInfoForCreateSupplier(testCaseName,testCaseNumber);
			click(getDriver(),CreateSupplierBankingInfo.createSupplierContactInfoSaveAndClose);
			switchToDefaultContentFrame(getDriver());
			park(2);
			approvalWorkflowForCorporateSupplier(testCaseName);
			park(2);
			click(getDriver(), CreateSupplierBankingInfo.mainInfoTab);
			park(1);
			waitForPageLoad(getDriver(), 15);
			park(2);
			webElementHighlighter(getDriver(), CreateSupplierBankingInfo.supplierId);
			String supplierId=CreateSupplierBankingInfo.supplierId.getText();
			park(2);
			LOG.info("Supplier ID is "+supplierId);
			park(1);
			Assert.assertTrue(HOMEPAGE_ACTIONS.searchAndVerifyCreatedOne(testCaseName,testCaseNumber, supplierId, DEFAULT_SHEET_NAME),"After create supplier search and find supplier fails");
			HOMEPAGE_ACTIONS.logout(testCaseName);
			addPassedTestCaseResult(testCaseName);
		} catch (Exception e) {
			performPostExceptionProcess(testCaseName, testCaseNumber, "createCorporateSupplier has failed", e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	
	private boolean approvalWorkflowForCorporateSupplier(String testCaseName){
		try {
			click(getDriver(), ApprovalWorkFlow.createSupplierApprovalWorkflowTab);
			captureScreenShotOnPass(getDriver(), testCaseName);
			park(2);
			waitForPageLoad(getDriver(), 15);
			park(2);
			waitForElementPresence(getDriver(), ApprovalWorkFlow.createSupplierApprovalWorkflowSubmitForDiligence, 15);
			park(2);
			click(getDriver(), ApprovalWorkFlow.createSupplierApprovalWorkflowSubmitForDiligence);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(),ApprovalWorkFlow.createSupplierApprovalWorkflowSubmitToWorkflow);
			park(2);
			waitForPageLoad(getDriver(), 15);
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkFlow.createSupplierApprovalWorkflowApprovalFinal);
			park(2);
			waitForPageLoad(getDriver(), 15);
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkFlow.createSupplierApprovalWorkflowApproveChanges);
			park(2);
			waitForPageLoad(getDriver(), 15);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean contactInfoForCreateSupplier(String testCaseName,String testCaseNumber){
		try {
			click(getDriver(), Contacts.createSupplierContactInfoTab);
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			waitForPageLoad(getDriver(), 15);
			click(getDriver(), Contacts.createSupplierContactInfoAddAContact);
			park(2);
			waitForPageLoad(getDriver(), 15);
			park(2);
			switchToFrame(getDriver(), 0);
			dropDownByTextVisibility(getDriver(), Contacts.createSupplierSupplierContactManagementStatus, "Validated");
			park(2);
			sendKeys(getDriver(), Contacts.createSupplierContactInfoLastName,REPOSITORY.getCellDataOnTestCase(testCaseNumber, lastName, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(), Contacts.createSupplierContactInfoFirstName,REPOSITORY.getCellDataOnTestCase(testCaseNumber, firstName, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(), Contacts.createSupplierContactInfoEmail,REPOSITORY.getCellDataOnTestCase(testCaseNumber, email, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(), Contacts.createSupplierContactInfoPhono,	REPOSITORY.getCellDataOnTestCase(testCaseNumber, phone, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			park(1);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	private boolean mainInfoDeatilsOfCorporateSupplier(String testCaseName,String serialNo,String legalNameUpdate){
		try {
			click(getDriver(),Supplier.createSupplierSupplierLink);
			click(getDriver(), Supplier.createSupplierLink);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			dropDownByTextVisibility(getDriver(), Supplier.createSupplierSupplierType, REPOSITORY.getCellDataOnTestCase(serialNo, supplierType, DEFAULT_SHEET_NAME));
			park(4);
			waitForPageLoad(getDriver(), 15);
			sendKeys(getDriver(),Supplier.createSupplierLegalName,legalNameUpdate);
			sendKeys(getDriver(),Supplier.createSupplierDoingBusinessAs,"Yes");		
			sendKeys(getDriver(),Supplier.createSupplierPhoneNumber,"1234567890");
			//create Corporate
			sendKeys(getDriver(),Supplier.createSupplierMainSupplierAddressNameAdditional,"Test Address");
			sendKeys(getDriver(),Supplier.createSupplierAddressLine1,REPOSITORY.getCellDataOnTestCase(serialNo, addressLine1, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),Supplier.createSupplierCity,REPOSITORY.getCellDataOnTestCase(serialNo, city, DEFAULT_SHEET_NAME));
			park(4);
			HOMEPAGE_ACTIONS.autoSuggestionHandle(Supplier.createSupplierState, REPOSITORY.getCellDataOnTestCase(serialNo, state, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),Supplier.createSupplierZip,REPOSITORY.getCellDataOnTestCase(serialNo, zip, DEFAULT_SHEET_NAME));
			dropDownByTextVisibility(getDriver(),Supplier.createSupplierCountry, REPOSITORY.getCellDataOnTestCase(serialNo, country, DEFAULT_SHEET_NAME));
			waitForPageLoad(getDriver(), 15);
			park(2);
			dropDownByTextVisibility(getDriver(),Supplier.createSupplierSupplierClassification,REPOSITORY.getCellDataOnTestCase(serialNo, supplierClassification, DEFAULT_SHEET_NAME));
			park(1);
			webElementHighlighter(getDriver(), Supplier.createSupplierSaveButton);
			//executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, Supplier.createSupplierSaveButton);
			waitForPageLoad(getDriver(), 15);
			return true;
		} catch (Exception e) {
			throw new FannieMaeBusinessException(e.getMessage(),e);
		}
	}
	
	public boolean additionalInfoOfCorporateSupplier(String testCaseName,String testCaseNumber){
		try {
			//Additional info
			click(getDriver(),Supplier.createSupplierAdditionalInfoTab);
			captureScreenShotOnPass(getDriver(), testCaseName);
			dropDownByTextVisibility(getDriver(),Supplier.createSupplierTINType, REPOSITORY.getCellDataOnTestCase(testCaseNumber, tinType, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),Supplier.createSupplierFederalTaxID,REPOSITORY.getCellDataOnTestCase(testCaseNumber, federalTaxID, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(),Supplier.createSupplierSaveButton);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,Supplier.createSupplierSaveButton);
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}
	
	public boolean bankInfoForCreateSupplier(String testCaseName,String testCaseNumber){
		try {
			//Banking Information
			click(getDriver(), Supplier.createSupplierBankInfoBankTab);
			captureScreenShotOnPass(getDriver(), testCaseName);
			clickOnThreeDotsAndSelectData(testCaseName,Supplier.createSupplierBankInfoBankButton, REPOSITORY.getCellDataOnTestCase(testCaseNumber,searchText, DEFAULT_SHEET_NAME));
			waitForPageLoad(getDriver(), 15);
			park(2);
			clickAndGetbankInfoDataFromFrame(Supplier.createSupplierBankInfoBankAccountDetails);
			park(2);
			clickAndGetbankInfoDataFromFrame(Supplier.createSupplierBankInfoPaymentMethod);
			park(2);
			click(getDriver(),Supplier.createSupplierBankInfoAddBankInfoButton);
			park(2);
			switchToFrame(getDriver(), 0);
			park(2);
			sendKeys(getDriver(),Supplier.createSupplierBankInfoBankName,	REPOSITORY.getCellDataOnTestCase(testCaseNumber, bankName, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),Supplier.createSupplierBankInfoCity,REPOSITORY.getCellDataOnTestCase(testCaseNumber, bankCity, DEFAULT_SHEET_NAME));
			park(2);
			sendKeys(getDriver(),Supplier.createSupplierBankInfoABARoutingNumber,REPOSITORY.getCellDataOnTestCase(testCaseNumber,abaRoutingNumber, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),Supplier.createSupplierBankInfoAccNumber,REPOSITORY.getCellDataOnTestCase(testCaseNumber,accNumber, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/* public boolean paymentConfirmation(String testCaseName,String testCaseNumber){
		try {
			
			park(4);
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationSupplierEmailAddressForACHPaymentConf(), "automation@test.com");
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierBankingInformationPurchaseOrder(), "Purchase order cXML");
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierBankingInformationPOFunctionalAcknowledgement(), "PO Ack. EDI 855");
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierBankingInformationAdvanceShippingNotice(), "ASN EDI 856");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestPartnerQualifier(), "22");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestPartnerId(), "Test123");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestAS2ReceiverId(), "Test123");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestURL(), "https://www.fanniemae.com/portal/index.html");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCXMLPartnerDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLPartnerIdentity(), "Test215");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLPartnerSharedSecret(), "No");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLReceiverUrl(), "https://www.fanniemae.com/portal/index.html ");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestDomainFromCDXML(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestIdentityFromCDXML(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLToDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLToIdentity(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLSenderDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLSenderIdentity(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLSenderSharedSecret(), "No");
			
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdPartnerQualifier(), "22");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdPartnerId(), "Test123");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdAS2ReceiverId(), "Test123");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdURL(), "https://www.fanniemae.com/portal/index.html");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCXMLPartnerDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLPartnerIdentity(), "Test215");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLPartnerSharedSecret(), "No");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLReceiverUrl(), "https://www.fanniemae.com/portal/index.html");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdDomainFromCDXML(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdIdentityFromCDXML(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLToDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLToIdentity(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLSenderDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLSenderIdentity(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLSenderSharedSecret(), "No");
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierSaveButton());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierSaveButton());
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}*/
	public boolean clickAndGetbankInfoDataFromFrame(WebElement button){
		try {
			click(getDriver(), button);
			park(2);
			switchToFrame(getDriver(), 0);
			park(2);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, CreateSupplierBankingInfo.createSupplierBankInfoClickOnResult);
			park(2);
			switchToDefaultContentFrame(getDriver());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean afterClickOnSaveHandleAlerts(WebElement saveButton){
		try {
			webElementHighlighter(getDriver(), saveButton);
			executeJS(getDriver(), FanniemaeConstants.JS_CLICK_SCRIPT, saveButton);
			acceptAlertIfPresent(getDriver(), 5);
			park(4);
			acceptAlertIfPresent(getDriver(), 5);
			return true;
		} catch (Exception e) {
			LOG.info("Two alerts not presents");
			return false;
		}
	}
	
	public boolean clickOnThreeDotsAndSelectData(String testCaseName,WebElement button,String searchText){
		try {
			click(getDriver(),button);
			park(2);
			switchToFrame(getDriver(), 0);
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			sendKeys(getDriver(),CreateSupplierBankingInfo.createSupplierBankInfoSearchBox,searchText);
			park(2);
			click(getDriver(),CreateSupplierBankingInfo.createSupplierBankInfoSearchBtn);
			park(2);
			click(getDriver(),CreateSupplierBankingInfo.createSupplierBankInfoClickOnResult);
			switchToDefaultContentFrame(getDriver());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean contactInfoForCreateSupplier2(String testCaseName,String testCaseNumber,String name,String lastname,String email){
		try {
			click(getDriver(),Contacts.createSupplierContactInfoTab);
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			waitForPageLoad(getDriver(), 15);
			park(2);
			click(getDriver(), Contacts.createSupplierContactInfoAddAContact);
			park(2);
			waitForPageLoad(getDriver(), 15);
			switchToFrame(getDriver(), 0);
			park(2);
			dropDownByTextVisibility(getDriver(), Contacts.createSupplierSupplierContactManagementStatus, "Validated");
			sendKeys(getDriver(), Contacts.createSupplierContactInfoLastName,name);
			sendKeys(getDriver(), Contacts.createSupplierContactInfoFirstName,lastname);
			sendKeys(getDriver(), Contacts.createSupplierContactInfoEmail,email);
			sendKeys(getDriver(), Contacts.createSupplierContactInfoPhono,	REPOSITORY.getCellDataOnTestCase(testCaseNumber, phone, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			park(1);
			webElementHighlighter(getDriver(), RealEstateBroker.createSupplierSaveButton);
		    park(2);
			//executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBroker.createSupplierSaveButton);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}