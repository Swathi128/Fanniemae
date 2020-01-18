package com.techouts.fanniemae.testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import org.testng.annotations.Test;

import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.CreateUserManagement;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.test.page.actions.UserNotificationsAndMail;
import com.fanniemae.automation.userElements1.model.UserElements1;
import com.fanniemae.automation.userElements1.model.userManagement;
import com.fanniemae.automation.userElements2.model.NotificationsAndEmail;
import com.fanniemae.automation.userElements2.model.UserElements2;
import com.fanniemae.automation.util.Assert;

import com.techouts.fanniemae.webelement.ops.WebElementOperations;


public class NotificationsAndMail extends AbstractTest
{
	private static final Logger LOG=Logger.getLogger(NotificationsAndMail.class.getName());
	private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.E;
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
	
	static  UserNotificationsAndMail  USERNOTIFICATION ; 
	
	static
	{
		Elementsfactory elementfactory=new Elementsfactory();
		elementfactory.init(DRIVER);
		UserElements2 userType2=new UserElements2();
		userType2.init(DRIVER);
		HOMEPAGE_ACTIONS=new HomePageActions(elementfactory, DRIVER);
		USERNOTIFICATION = new UserNotificationsAndMail();
	}
	@Test
	public void createNotificationsAndEmails()
	{
		String testCaseName = "CreateNotificationsAndEmails";
		String serialNo ="3";
		try {
		getFannieMaePage(); 
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo,landingPageTitle, DEFAULT_SHEET_NAME))); 
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME),REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, FanniemaeConstants.L, DEFAULT_SHEET_NAME)); 
		USERNOTIFICATION.createNotification(serialNo,DEFAULT_SHEET_NAME);
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		  WebElementOperations.park(2);
	HOMEPAGE_ACTIONS.logout(testCaseName);
		}
	catch(Exception e) {
		 performPostExceptionProcess( testCaseName,  serialNo, "createNotificationsAndEmails has failed" ,  e, DEFAULT_SHEET_NAME);
	}
		 }
	
}
		


