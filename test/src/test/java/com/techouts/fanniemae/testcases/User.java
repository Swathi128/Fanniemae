package com.techouts.fanniemae.testcases;
import java.util.logging.Logger;
import org.testng.annotations.Test;
import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;
import com.fanniemae.automation.UserTypeWebElements.model.UserTypeWebElements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.test.page.actions.UserMethod;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class User extends AbstractTest
{
	private static final Logger LOG = Logger.getLogger(User.class.getName());
	private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.E;
	//private int homePageTitle=FanniemaeConstants.L;
	private int keyWords=FanniemaeConstants.G;
	private int suppliers=FanniemaeConstants.H;
	private int contactType=FanniemaeConstants.I;
	private int organization=FanniemaeConstants.J;
	private int auth=FanniemaeConstants.M;
	private int profile=FanniemaeConstants.N;
	private int descrption=FanniemaeConstants.O;
	private int authorizationCode=FanniemaeConstants.P;
	static UserMethod USERMETHOD;
	static
	{
		Elementsfactory elementfactory=new Elementsfactory();
		elementfactory.init(DRIVER);
		UserTypeWebElements userType=new UserTypeWebElements();
		userType.init(DRIVER);
		USERMETHOD = new UserMethod(userType,DRIVER);
		HOMEPAGE_ACTIONS=new HomePageActions(elementfactory, DRIVER);
	}
	String testCaseName = "CreateUser";
	String serialNo ="1";
	
@Test
public void createUser()
	{
	getFannieMaePage();
		try {
    Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo,landingPageTitle, DEFAULT_SHEET_NAME))); 
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		
		 HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME),REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, FanniemaeConstants.L, DEFAULT_SHEET_NAME));
		 USERMETHOD.createUser(serialNo, DEFAULT_SHEET_NAME);
		 USERMETHOD.createUser1(serialNo, DEFAULT_SHEET_NAME);
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
	     WebElementOperations.park(2);
		 HOMEPAGE_ACTIONS.logout(testCaseName);
		}
		catch(Exception e) {
			 performPostExceptionProcess( testCaseName,  serialNo, "CreateUser has failed" ,  e, DEFAULT_SHEET_NAME);
		}
	
	}
}
		
	


