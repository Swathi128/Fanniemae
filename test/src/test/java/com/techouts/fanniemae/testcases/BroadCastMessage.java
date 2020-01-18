package com.techouts.fanniemae.testcases;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.CreateBroadCastMessage;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.userElements2.model.NotificationsAndEmail;
import com.fanniemae.automation.userElements2.model.UserElements2;
import com.fanniemae.automation.userElements3.model.BroadMessage;
import com.fanniemae.automation.userElements3.model.UserElements3;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class BroadCastMessage extends AbstractTest{
	
		private static final Logger LOG=Logger.getLogger(BroadCastMessage.class.getName());
		private int userName = FanniemaeConstants.C;
		private int password = FanniemaeConstants.D;
		private int landingPageTitle = FanniemaeConstants.E;
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
		
		static CreateBroadCastMessage CREATEBROADCASTMESSAGE1;
		static
		{
			Elementsfactory elementfactory=new Elementsfactory();
			elementfactory.init(DRIVER);
			UserElements3 userType3=new UserElements3();
			userType3.init(DRIVER);
			HOMEPAGE_ACTIONS=new HomePageActions(elementfactory, DRIVER);
			CREATEBROADCASTMESSAGE1=new CreateBroadCastMessage(userType3,DRIVER);
		}
			@Test
			public void createBroadCastMessage()
			{
				String testCaseName = "CreateBroadCastMessage";
				String serialNo ="4";
				getFannieMaePage(); 
				try {
				Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo,landingPageTitle, DEFAULT_SHEET_NAME))); 
				  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
				HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME),REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, FanniemaeConstants.L, DEFAULT_SHEET_NAME));
				CREATEBROADCASTMESSAGE1.createNotification(serialNo, DEFAULT_SHEET_NAME);
		WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		WebElementOperations.park(2);
		 HOMEPAGE_ACTIONS.logout(testCaseName);
				}
				catch(Exception e) {
					 performPostExceptionProcess( testCaseName,  serialNo, "CreateBroadCastMessage has failed" ,  e, DEFAULT_SHEET_NAME);
				}
		
		}
}
