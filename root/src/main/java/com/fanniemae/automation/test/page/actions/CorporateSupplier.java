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

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;

public class CorporateSupplier 
{
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private Elementsfactory elementFactory;
	private WebDriver driver = null;
	
	public CorporateSupplier(Elementsfactory elementfactory, WebDriver driver) {
		super();
		this.elementFactory = elementfactory;
		this.driver = driver;
	}
	private static int supplierType = FanniemaeConstants.AD;
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


}


