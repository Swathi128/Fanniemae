package com.fanniemae.automation.test.page.actions;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.userElements2.model.NotificationsAndEmail;
import com.fanniemae.automation.userElements2.model.UserElements2;

import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;

import java.util.Iterator;
import java.util.Set;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByIndex;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;


public class UserNotificationsAndMail 
{
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private UserElements2 elements;
	private WebDriver driver = null;
	
	private int keyWords = FanniemaeConstants.E;
	private int notificationPoint = FanniemaeConstants.W;
	private int sent = FanniemaeConstants.X;
	private int to = FanniemaeConstants.Y;
	private int status = FanniemaeConstants.Z;
	private int receiver = FanniemaeConstants.AA;
	private int module = FanniemaeConstants.AB;
	private int objectType = FanniemaeConstants.AC;
	private int category = FanniemaeConstants.AD;
	private int code = FanniemaeConstants.AE;
	private int notificationLabel = FanniemaeConstants.AF;
	private int defaultSender = FanniemaeConstants.AG;
	private int defaultToMail = FanniemaeConstants.AH;
	private int defaultReplyMail = FanniemaeConstants.AI;
	private int defaultAcknowledgementMail = FanniemaeConstants.AJ;
	private int objectForMergeFields = FanniemaeConstants.AK;
	private int mailSubject = FanniemaeConstants.AL;
	
	public void createNotification(String serialNo,String sheetName)
	{
		 click(driver, NotificationsAndEmail.user);
		 click(driver,NotificationsAndEmail.notifications );
		 park(2);
		 sendKeys(driver, NotificationsAndEmail.keyWords, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keyWords, sheetName));
		 park(2);
		 sendKeys(driver, NotificationsAndEmail.notificationPoint, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, notificationPoint, sheetName));
		 enterByRobot();
		 park(2);
		 sendKeys(driver, NotificationsAndEmail.sent,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, sent, sheetName));
		 sendKeys(driver, NotificationsAndEmail.to,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, to, sheetName));
		 park(2);
	    dropDownByIndex(driver, NotificationsAndEmail.status, 2);
	    park(2);
        dropDownByIndex(driver, NotificationsAndEmail.module, 2);
	     park(2);
	    sendKeys(driver, NotificationsAndEmail.receiver,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, receiver, sheetName));
	    park(2);
	    enterByRobot();
	    park(3);
	    WebElementOperations.webElementHighlighter(driver, NotificationsAndEmail.content);
//	    click(driver, NotificationsAndEmail.content);
//	    park(5);
	 
	 //Window Handling
	 //Set<String>allwindows=driver.getWindowHandles();
	 //int windowscount=allwindows.size();
	
     //System.out.println("CountWindows:=="+windowscount);
	
	//By Using Iterator
	//Iterator<String>itr=allwindows.iterator();
	
	// String mainwindow=itr.next();
	// String nextwindow=itr.next();
	 
	 //switch window
//	 driver.switchTo().window(nextwindow);
//	 driver.close();
//	 driver.switchTo().window(mainwindow);
//	 park(2);
//	 
	 
	click(driver, NotificationsAndEmail.user);
	click(driver, NotificationsAndEmail.ManageTypesOfNotifications);
	park(2);
    sendKeys(driver, NotificationsAndEmail.keyWords,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keyWords, sheetName));
	dropDownByIndex(driver, NotificationsAndEmail.module, 2);
	park(2);
	dropDownByIndex(driver, NotificationsAndEmail.activated, 2);
	sendKeys(driver, NotificationsAndEmail.objectType,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, objectType, sheetName));
	park(2);
	sendKeys(driver, NotificationsAndEmail.category,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, category, sheetName));
	park(2);
	click(driver,NotificationsAndEmail.createNewTypeOfNotification);
	park(2);
	sendKeys(driver, NotificationsAndEmail.code,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, code, sheetName));
	park(2);
    sendKeys(driver, NotificationsAndEmail.notificationLabel,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, code, sheetName));
	park(2);
	sendKeys(driver, NotificationsAndEmail.defaultSender,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, defaultSender, sheetName));
	park(2);
    sendKeys(driver, NotificationsAndEmail.defaultToMail,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, defaultToMail, sheetName));
    park(2);
	sendKeys(driver, NotificationsAndEmail.defaultReplyMail,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, defaultReplyMail, sheetName));
	park(2);
	sendKeys(driver, NotificationsAndEmail.defaultAcknowledgementMail,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, defaultAcknowledgementMail, sheetName));
	park(2);
	sendKeys(driver, NotificationsAndEmail.objectForMergeFields,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, objectForMergeFields, sheetName));
	park(2);
	click(driver, NotificationsAndEmail.user);
	park(2);
	click(driver, NotificationsAndEmail.emailLogs);
	park(2);
	sendKeys(driver, NotificationsAndEmail.defaultSender,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, defaultSender, sheetName));
	park(2);
	sendKeys(driver, NotificationsAndEmail.defaultToMail,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, defaultToMail, sheetName));
	park(2);
	sendKeys(driver, NotificationsAndEmail.keyWords,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keyWords, sheetName));
	park(2);
}
}
