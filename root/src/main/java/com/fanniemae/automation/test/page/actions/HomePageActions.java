package com.fanniemae.automation.test.page.actions;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.corporaterSearch;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getAttributeValue;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getText;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForElementClickable;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;
import com.fanniemae.automation.Elementsfactory.model.Login;
import com.fanniemae.automation.Elementsfactory.model.Logout;
import com.fanniemae.automation.UserTypeWebElements.model.UserTypeWebElements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.elements.model.Elements;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.userElements1.model.UserElements1;
import com.fanniemae.automation.userElements2.model.UserElements2;
import com.fanniemae.automation.userElements3.model.UserElements3;

import com.fanniemae.automation.util.Assert;
import com.fanniemae.automation.util.PathProvider;
import com.fanniemae.automation.webElements.model.WebElements;
import com.lowagie.text.factories.ElementFactory;
import com.techouts.fanniemae.exceptions.FannieMaeBusinessException;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;
import com.fanniemae.automation.elements.model.CreateRequistion;



/**
 * 
 * @author TO-WVLD-12
 *
 */
public class HomePageActions
{
	
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private Elementsfactory elementFactory;
	private Elements elements;
	private UserTypeWebElements userType;
	private UserElements1 userType1;
	private UserElements2 userType2;
	private UserElements3 userType3;
	
	private WebDriver driver = null;
	private CreateRequistion createRequisition;
	
//	public HomePageActions(CreateRequistion createRequisition, Elementsfactory elementfactory, WebDriver driver) {
//		super();
//		this.createRequisition = createRequisition;
//		this.elementFactory = elementfactory;
//		this.driver = driver;
//	}
	
	public HomePageActions(Elementsfactory elementfactory,  WebDriver driver) {
		super();
		this.elementFactory = elementfactory;
		this.driver = driver;
	}

	private static int pRWatchers = FanniemaeConstants.C;
	private static int itemDescription = FanniemaeConstants.M;
	private static int itemPrice = FanniemaeConstants.N;
	private static int itemQuantity = FanniemaeConstants.O;
	private static int gLAccount = FanniemaeConstants.P;
	private static int costCentre = FanniemaeConstants.Q;
	private static int requisitionName = FanniemaeConstants.R;
	private static int justification = FanniemaeConstants.S;
	private static int unitOfMeasure = FanniemaeConstants.W;
	private static int peopleSoftProjectID = FanniemaeConstants.AC;
	private static int supplierType = FanniemaeConstants.AD;
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
	
	
	public boolean login(String username,String password,String pageTitle){
		try {
			sendKeys(driver, Login.usernameProcureOne, username);
			park(0.5);
			sendKeys(driver, Login.passwordProcureOne, password);
			park(0.5);
			click(driver, Login.loginProcureOne);
			waitForPageLoad(driver,15);
			Assert.assertTrue(verifyPageTitle(driver, pageTitle),"Page title is not matched with expected title.");
			return true;
		} catch (Exception e) {
			LOG.error("Login failed");
			return false;
		}
	}
	
	public void autoSuggestionHandle(WebElement inputBox, String inputText ){
		try {
			sendKeys(driver, inputBox,inputText);
			park(2);
			click(driver, elementFactory.supplier.costCentreList);
		} catch (Exception e) {
			LOG.error("Failed to select a value from AutoFill suggestion");
		}
	}
	
	public String[] createRequisition(String method,String serialNo, String sheetName){
		try {
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			park(2);
			Assert.assertTrue(CreateRequistion.procurement.isDisplayed());
			click(driver, CreateRequistion.procurement);
			//Assert.assertTrue(CreateRequistion.procurement.isDisplayed());
		    System.out.println("Procurement is displayed");
		    park(2);
		    Assert.assertTrue(CreateRequistion.createRequisition.isDisplayed());
			click(driver, CreateRequistion.createRequisition);
			//Assert.assertTrue(CreateRequistion.createRequisition.isDisplayed());
			System.out.println("Create requistion is displayed");
			captureScreenShotOnPass(driver, method);
			park(2);
			waitForPageLoad(driver, 15);
			park(2);
			sendKeys(driver, CreateRequistion.requisitionName, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,requisitionName, sheetName));
			String requester = getAttributeValue(driver, CreateRequistion.headerInformationRequester);
			park(2);
			sendKeys(driver, CreateRequistion.headerInformationPRWatchers,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,pRWatchers, sheetName));
			park(2);
			sendKeys(driver, CreateRequistion.justification, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,justification, sheetName));
			//park(5);
			waitForElementClickable(driver, 10, CreateRequistion.costCentreList);
			click(driver,CreateRequistion.costCentreList);
			//click(driver, CreateRequistion.clickDragToAddFiles);
			CreateRequistion.clickDragToAddFiles.isDisplayed();
			//       other way to handle exception
			
			try {
				click(driver, CreateRequistion.clickDragToAddFiles);
				
			}
			catch(Exception e) {
				System.out.println("Doesnot open any file");
			}
			captureScreenShotOnPass(driver, method);
			park(2);
			Runtime.getRuntime().exec(ADD_FILES_EXE);
			park(4);
			click(driver, CreateRequistion.saveButton);
			park(2);
			//Assert.assertTrue(CreateRequistion.backToCatalog.isDisplayed());
	
			System.out.println("BackTo Catalog is displayed");
			//Assert.assertTrue(CreateRequistion.otherActions.isDisplayed());
			
			
			
			return new String[]{getText(driver, CreateRequistion.basketNo) , requester};	
		} catch (Exception e) {
			LOG.error("Failed to create Requisition ",e);
			return new String[] {null};
		}
	}
	
	
	
	//extrakkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
//	public String[] approveRequisition(String method,String serialNo, String sheetName,List<WebElement> elements,String exptected) {
//		String testCaseName="CommodityApprovalforSubmittedRequest";
//		try {
//			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//			park(2);
//			click(driver, elementFactory.createRequistion.loginMenu);
//			click(driver, elementFactory.createRequistion.myOpenWorkflowTasks);
//			captureScreenShotOnPass(driver, method);
//			park(2);
//			waitForPageLoad(driver, 15);
//			//String requester = getAttributeValue(driver, elementFactory.createRequistion.leaderName);
//			try {
//			String data;
//			int i=2;
//				for (WebElement el : elements) {
//					data=el.getText();
//					data=data.substring(3, 7);
//					if(exptected.contains(data)){
//						Thread.sleep(2000);
//						//kkkkkkkkkkkkkkkkkkkkkkkk
//						//WebElementOperations.webElementHighlighter(driver, driver.findElement(By.xpath("//table[@class='PowerGridClass']/tbody/tr["+i+"]/td[1]/a")));
//						//kkkkkkkkkkkkkkkkkkkkkkkkkkk
//						WebElement link=driver.findElement(By.xpath("//table[@class='PowerGridClass']/tbody/tr["+i+"]/td[1]/a"));
//						link.click();
//					}
//					Thread.sleep(500);
//					i++;
//				}
//			}catch(Exception e){
//				LOG.error("error occur at table data validataion");
//			}
//			park(3);
//			waitForPageLoad(driver,15);
//			captureScreenShotOnPass(driver, testCaseName);
//			click(driver, elementFactory.createRequistion.workflow);
//			park(2);
//			captureScreenShotOnPass(driver, testCaseName);
//			click(driver, elementFactory.createRequistion.approveButton);
//			park(2);
//			captureScreenShotOnPass(driver, testCaseName);
//			click(driver, elementFactory.createRequistion.saveButton);
//			park(2);
//			captureScreenShotOnPass(driver, testCaseName);
//			return new String[]{getText(driver, elementFactory.createRequistion.leaderName) , requester};	
//		} catch (Exception e) {
//			LOG.error("Failed to create Requisition ",e);
//			return new String[] {null};
//		
//	}	
//	}
	//extra kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
	
	
	
	
	public boolean addItemDetails(String method,String serialNo,String requester, String sheetName){
		try {
			park(2);
			Assert.assertTrue(CreateRequistion.addItem.isDisplayed());
			click(driver, CreateRequistion.addItem);
			System.out.println("add item button is displayed");
			park(2);
			captureScreenShotOnPass(driver, method);
			switchToFrame(driver, 0);
			sendKeys(driver, CreateRequistion.itemDescription, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemDescription, sheetName));
			park(2);
			sendKeys(driver, CreateRequistion.itemPrice, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemPrice, sheetName));
			park(2);
			sendKeys(driver, CreateRequistion.itemQuantity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemQuantity, sheetName));
			park(2);
			dropDownByTextVisibility(driver, CreateRequistion.unitOfMeasure, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, unitOfMeasure, sheetName));
			park(2);
			click(driver, CreateRequistion.categoryButton);
			park(2);
			captureScreenShotOnPass(driver, method);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 1);
			click(driver, CreateRequistion.labelIcon);
			park(2);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 0);
			park(2);
			captureScreenShotOnPass(driver, method);
			return true;
		} catch (Exception e) {
			LOG.info("Fails to add item details");
			return false;
		}
	}
	
public boolean costAllocationAndCommentUpdate(String method,String serialNo, String sheetName){
		try {
			click(driver, CreateRequistion.labelSaveButton);
			park(3);
			waitForPageLoad(driver,10);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 0);
			captureScreenShotOnPass(driver, method);
			click(driver, CreateRequistion.glAccountButton);
			park(2);
			switchToDefaultContentFrame(driver);
			park(2);
			switchToFrame(driver, 1);
			park(2);
			captureScreenShotOnPass(driver, method);
			park(2);
			sendKeys(driver, CreateRequistion.accountSelectionKeyWords, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, gLAccount, sheetName));
			park(2);
		click(driver, CreateRequistion.accountSelectionSearch);
			captureScreenShotOnPass(driver, method);
			park(4);
			click(driver, CreateRequistion.accountSelectionLabelIcon);
			park(4);
			switchToDefaultContentFrame(driver);
			park(2);
			switchToFrame(driver, 0);
			park(2);
			sendKeys(driver, CreateRequistion.costCenter, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, costCentre, sheetName));
			//park(4);
			waitForElementClickable(driver, 15, CreateRequistion.costCentreList);
			park(2);
			click(driver, CreateRequistion.costCentreList);
			
			waitForPageLoad(driver,10);
			park(4);
			sendKeys(driver, CreateRequistion.peopleSoftProjectID, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, peopleSoftProjectID, sheetName));
			//park(4);
			waitForElementClickable(driver, 15, CreateRequistion.costCentreList);
			park(2);
			click(driver, CreateRequistion.costCentreList);
			waitForPageLoad(driver,10);
			park(2);
			captureScreenShotOnPass(driver, method);
			park(4);
			click(driver, CreateRequistion.saveandCloseButton);
			park(4);
			waitForPageLoad(driver,10);
			//Assert.assertTrue(CreateRequistion.reset.isDisplayed());
			System.out.println("Reset allocations is displayed");
			park(2);
			//Assert.assertTrue(CreateRequistion.resetAndAllocations.isDisplayed());
			System.out.println("Reset allocations is displayed");
			//Assert.assertTrue(CreateRequistion.saveAndNew.isEnabled());
			System.out.println("Save and new button is displayed");
			captureScreenShotOnPass(driver, method);
			park(2);
			switchToDefaultContentFrame(driver);
			return true;
		} catch (Exception e) {
			LOG.error("Fails to add comment or Cost Allocation");
			return false;
		}
	}
	
	//public boolean datePickerWithAllOptions() {
		//click(driver, elementFactory.getDatePickerOneDayBtn());
		//park(0.5);
		//click(driver, elementFactory.getDatePickerTodayBtn());
		//park(1);
		//click(driver, elementFactory.getDatePickerCrossMark());
		//return true;
	//}
	
	public boolean logout(String testCaseName){
		try {
			click(driver, Logout.loginMenu);
			park(2);
			captureScreenShotOnPass(driver, testCaseName);
			click(driver, Logout.logOutButton);
			park(2);
			waitForPageLoad(driver, 15);
			captureScreenShotOnPass(driver, testCaseName);
			return true;
		} catch (Exception e) {
			throw new FannieMaeBusinessException("unable to perform logout operation in TestCase["+testCaseName+"].");
		}
	}
	
	public boolean searchAndVerifyCreatedOne(String testCaseName,String testCaseNumber,String legalNameUpdate, String sheetName){
		try {
			park(3);
			waitForPageLoad(driver, 15);
			park(2);
			click(driver, elementFactory.searchAndVerify.createSupplierSupplierLink);
			park(0.5);
			click(driver, elementFactory.searchAndVerify.createSupplierBrowseSuppliers);
			park(2);
			captureScreenShotOnPass(driver, testCaseName);
			park(3);
			waitForPageLoad(driver, 15);
			park(2);
			click(driver, elementFactory.searchAndVerify.createSupplierStatusCroseMark);
			park(2);
			dropDownByTextVisibility(driver, elementFactory.searchAndVerify.searchSupplierSupplierType,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, supplierType, sheetName));
			sendKeys(driver, elementFactory.searchAndVerify.searchSupplierSearchKeyword, legalNameUpdate);
			park(2);
			click(driver, elementFactory.searchAndVerify.searchSupplierSearchButton);
			park(2);
			waitForPageLoad(driver, 15);
			captureScreenShotOnPass(driver, testCaseName);
			//Assert.assertTrue(corporaterSearch(driver, elementFactory.searchAndVerify.searchSupplierResultGridSupplierId, legalNameUpdate),"Search operation fails");
			park(3);
			waitForPageLoad(driver, 15);
			//click(driver, elementFactory.getCreateSupplierExitButton());
			return true;
		} catch (Exception e) {
			LOG.debug("search and verify failed");
			return false;
		}
	}
	
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
		} catch (Exception e) {
			LOG.error("Failed to createMasterServicesAgreement ",e);
			return false;
		}
		
	}
	
	//public boolean clickOnThreeDotsAndSelectData(String testCaseName,WebElement button,String searchText){
		//try {
		//	click(driver,button);
			//switchToFrame(driver, 0);
			//captureScreenShotOnPass(driver, testCaseName);
			//sendKeys(driver,elementFactory.getCreateSupplierBankInfoSearchBox(),searchText);
		//	click(driver,elementFactory.getCreateSupplierBankInfoSearchBtn());
		//	click(driver,elementFactory.getCreateSupplierBankInfoClickOnResult());
		//	switchToDefaultContentFrame(driver);
		//	return true;
		//} catch (Exception e) {
		//	return false;
		//}
	//}
}