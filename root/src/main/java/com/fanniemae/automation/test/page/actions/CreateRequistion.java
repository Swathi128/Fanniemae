package com.fanniemae.automation.test.page.actions;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
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
import com.fanniemae.automation.elements.model.Elements;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;

public class CreateRequistion 
{
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private Elements elementFactory;
	private WebDriver driver = null;
	
	public CreateRequistion(Elements elementfactory, WebDriver driver) {
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
	
	public String[] createRequisition(String method,String serialNo, String sheetName){
		try {
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			park(2);
			click(driver,elementFactory.createRequistion.procurement);
			click(driver, elementFactory.createRequistion.createRequisition);
			captureScreenShotOnPass(driver, method);
			park(2);
			waitForPageLoad(driver, 15);
			sendKeys(driver, elementFactory.createRequistion.requisitionName, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,requisitionName, sheetName));
			String requester = getAttributeValue(driver, elementFactory.createRequistion.headerInformationRequester);
			park(2);
			sendKeys(driver, elementFactory.createRequistion.headerInformationPRWatchers,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,pRWatchers, sheetName));
			park(2);
			sendKeys(driver, elementFactory.createRequistion.justification, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,justification, sheetName));
			//park(5);
			waitForElementClickable(driver, 10, elementFactory.createRequistion.costCentreList);
			click(driver,elementFactory.createRequistion.costCentreList);
			click(driver, elementFactory.createRequistion.clickDragToAddFiles);
			captureScreenShotOnPass(driver, method);
			park(2);
			Runtime.getRuntime().exec(ADD_FILES_EXE);
			park(4);
			click(driver, elementFactory.createRequistion.saveButton);
			park(2);
			return new String[]{getText(driver, elementFactory.createRequistion.basketNo) , requester};	
		} catch (Exception e) {
			LOG.error("Failed to create Requisition ",e);
			return new String[] {null};
		}
	}
	
	public boolean addItemDetails(String method,String serialNo,String requester, String sheetName){
		try {
			park(2);
			click(driver, elementFactory.createRequistion.addItem);
			park(2);
			captureScreenShotOnPass(driver, method);
			switchToFrame(driver, 0);
			sendKeys(driver, elementFactory.createRequistion.itemDescription, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemDescription, sheetName));
			park(2);
			sendKeys(driver, elementFactory.createRequistion.itemPrice, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemPrice, sheetName));
			park(2);
			sendKeys(driver, elementFactory.createRequistion.itemQuantity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemQuantity, sheetName));
			park(2);
			dropDownByTextVisibility(driver, elementFactory.createRequistion.unitOfMeasure, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, unitOfMeasure, sheetName));
			park(2);
			click(driver, elementFactory.createRequistion.categoryButton);
			park(2);
			captureScreenShotOnPass(driver, method);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 1);
			click(driver, elementFactory.createRequistion.labelIcon);
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
			click(driver, elementFactory.createRequistion.labelSaveButton);
			park(3);
			waitForPageLoad(driver,10);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 0);
			captureScreenShotOnPass(driver, method);
			click(driver, elementFactory.createRequistion.glAccountButton);
			park(2);
			switchToDefaultContentFrame(driver);
			park(2);
			switchToFrame(driver, 1);
			park(2);
			captureScreenShotOnPass(driver, method);
			park(2);
			sendKeys(driver, elementFactory.createRequistion.accountSelectionKeyWords, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, gLAccount, sheetName));
			park(2);
		click(driver, elementFactory.createRequistion.accountSelectionSearch);
			captureScreenShotOnPass(driver, method);
			park(4);
			click(driver, elementFactory.createRequistion.accountSelectionLabelIcon);
			park(4);
			switchToDefaultContentFrame(driver);
			park(2);
			switchToFrame(driver, 0);
			park(2);
			sendKeys(driver, elementFactory.createRequistion.costCenter, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, costCentre, sheetName));
			//park(4);
			waitForElementClickable(driver, 15, elementFactory.createRequistion.costCentreList);
			park(2);
			click(driver, elementFactory.createRequistion.costCentreList);
			waitForPageLoad(driver,10);
			park(4);
			sendKeys(driver, elementFactory.createRequistion.peopleSoftProjectID, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, peopleSoftProjectID, sheetName));
			//park(4);
			waitForElementClickable(driver, 15, elementFactory.createRequistion.costCentreList);
			park(2);
			click(driver, elementFactory.createRequistion.costCentreList);
			waitForPageLoad(driver,10);
			park(2);
			captureScreenShotOnPass(driver, method);
			park(4);
			click(driver, elementFactory.createRequistion.saveandCloseButton);
			park(4);
			waitForPageLoad(driver,10);
			captureScreenShotOnPass(driver, method);
			park(2);
			switchToDefaultContentFrame(driver);
			return true;
		} catch (Exception e) {
			LOG.error("Fails to add comment or Cost Allocation");
			return false;
		}
	}

}
