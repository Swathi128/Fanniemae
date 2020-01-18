package com.techouts.fanniemae.testcases;
import java.util.logging.Logger;

import org.testng.annotations.Test;

import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.CreateUserManagement;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.test.page.actions.UserMethod;
import com.fanniemae.automation.userElements1.model.UserElements1;
import com.fanniemae.automation.userElements1.model.userManagement;


import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class UserManagement extends AbstractTest
{
	private static final Logger LOG=Logger.getLogger(UserManagement.class.getName());
	private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.E;
	private int keyWords=FanniemaeConstants.G;
	private int suppliers=FanniemaeConstants.H;
	private int contactType=FanniemaeConstants.I;
	private int defaultOrganization=FanniemaeConstants.Q;
	private int defaultDeliveryPlace=FanniemaeConstants.R;
	private int keyWordsOrgPerimeter=FanniemaeConstants.S;
	private int keyWordsCommodity=FanniemaeConstants.T;
	private int keyWordsCostCenters=FanniemaeConstants.U;
	private int projectsName=FanniemaeConstants.V;
	
	static  CreateUserManagement CREATEUSERMANAGEMENT;
	static
	{
		Elementsfactory elementfactory=new Elementsfactory();
		elementfactory.init(DRIVER);
		UserElements1 userType1=new UserElements1();
		userType1.init(DRIVER);
		HOMEPAGE_ACTIONS=new HomePageActions(elementfactory, DRIVER);
		
		CREATEUSERMANAGEMENT = new CreateUserManagement(userType1,DRIVER);
	}
	@Test
	public void createManagement()
	{
		String testCaseName = "CreateManagement";
		String serialNo ="2";
		try
		{
		getFannieMaePage(); 
		Assert.assertTrue(WebElementOperations.verifyPageTitle(DRIVER, REPOSITORY.getCellDataOnTestCase(serialNo,landingPageTitle, DEFAULT_SHEET_NAME))); 
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME),REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, FanniemaeConstants.L, DEFAULT_SHEET_NAME)); 
		CREATEUSERMANAGEMENT.UserManagement1(serialNo,DEFAULT_SHEET_NAME);
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
    	  WebElementOperations.park(2);
		  HOMEPAGE_ACTIONS.logout(testCaseName);
		}
		catch(Exception e) {
			 performPostExceptionProcess( testCaseName,  serialNo, "CreateManagement has failed" ,  e, DEFAULT_SHEET_NAME);
		}
			  
		  }
}
		  
		  
		  
		
	
	


