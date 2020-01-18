package com.fanniemae.automation.test.page.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.userElements2.model.UserElements2;
import com.fanniemae.automation.userElements3.model.BroadMessage;
import com.fanniemae.automation.userElements3.model.UserElements3;

import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByIndex;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;


public class CreateBroadCastMessage 
{
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private UserElements3 elements;
	private WebDriver driver = null;
	
	public CreateBroadCastMessage(UserElements3 elements, WebDriver driver) {
		super();
		this.elements = elements;
		this.driver = driver;
	}   
	
	private int keyWords = FanniemaeConstants.E;
	private int beginDate = FanniemaeConstants.AM;
	private int endDate = FanniemaeConstants.AN;
	private int code = FanniemaeConstants.AO;
	private int user = FanniemaeConstants.AP;
	private int organization = FanniemaeConstants.AQ;
	private int contact = FanniemaeConstants.AR;
	private int name = FanniemaeConstants.AS;
	private int officeNumber = FanniemaeConstants.AT;
	private int floor = FanniemaeConstants.AU;
	private int number = FanniemaeConstants.AV;
	private int address1 = FanniemaeConstants.AW;
	private int zip = FanniemaeConstants.AX;
	private int city = FanniemaeConstants.AY;
	
	public void createNotification(String serialNo,String sheetName)
	{
		click(driver, BroadMessage.user);
		click(driver,BroadMessage.broadCastMessage );
	    park(2);
	    sendKeys(driver, BroadMessage.keyWords,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keyWords, sheetName));
	    dropDownByIndex(driver, BroadMessage.type, 2);
	     park(2);
	    sendKeys(driver, BroadMessage.beginDate,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, beginDate, sheetName));
		park(2);
	    sendKeys(driver, BroadMessage.endDate,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, endDate, sheetName));
		park(2);
		click(driver, BroadMessage.AddMessage);
		park(2);
		sendKeys(driver, BroadMessage.code,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, code, sheetName));
		park(2);
		click(driver, BroadMessage.user);
		park(2);
		click(driver, BroadMessage.manageAddress);
		park(2);
		sendKeys(driver, BroadMessage.keyWords,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keyWords, sheetName));
	   park(2);
		dropDownByIndex(driver, BroadMessage.legalCompany, 1);
		park(2);
		sendKeys(driver, BroadMessage.organization,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, organization, sheetName)); 
		 enterByRobot();
		park(2);
		dropDownByIndex(driver, BroadMessage.country, 1);
		park(2);
		dropDownByIndex(driver, BroadMessage.addressType, 1); 
		park(2);
		click(driver, BroadMessage.addNewType);
		park(2);
		switchToFrame(driver, 0);
		park(2); 
		sendKeys(driver, BroadMessage.contact, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contact, sheetName));
		enterByRobot();
		park(2);
		sendKeys(driver, BroadMessage.organization,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, organization, sheetName));
		enterByRobot();
		park(2);
	   sendKeys(driver, BroadMessage.name,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, name, sheetName));
		park(2);
		sendKeys(driver, BroadMessage.officeNumber,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, officeNumber, sheetName));
		park(2);
		sendKeys(driver, BroadMessage.floor,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, floor, sheetName));
		park(2);
//		WebElementOperations.sendKeys(driver, BroadMessage.number,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, number, sheetName));
		park(2);
		sendKeys(driver, BroadMessage.address1,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, address1, sheetName));
		park(2);
		sendKeys(driver, BroadMessage.zip,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, zip, sheetName));
		park(2);
		sendKeys(driver, BroadMessage.city,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, city, sheetName));
		park(2);
		click(driver, BroadMessage.save);
		
		park(2);
		switchToDefaultContentFrame(driver);
		park(2);
	}
}
