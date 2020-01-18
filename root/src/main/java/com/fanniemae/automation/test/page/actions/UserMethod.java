package com.fanniemae.automation.test.page.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.UserTypeWebElements.model.UserTypeWebElements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.UserTypeWebElements.model.UserType;
import com.fanniemae.automation.util.Assert;
import com.fanniemae.automation.util.PathProvider;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByIndex;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;


public class UserMethod 
{
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private UserTypeWebElements elements;
	private WebDriver driver = null;
	
	public UserMethod(UserTypeWebElements elements, WebDriver driver) {
		super();
		this.elements = elements;
		this.driver = driver;
	}    
	
	private int keyWords=FanniemaeConstants.G;
	private int suppliers=FanniemaeConstants.H;
	private int contactType=FanniemaeConstants.I;
	private int organization=FanniemaeConstants.J;
	private int auth=FanniemaeConstants.M;
	private int profile=FanniemaeConstants.N;
	private int descrption=FanniemaeConstants.O;
	private int authorizationCode=FanniemaeConstants.P;
	
	public void createUser(String serialNo,String sheetName)
	{
		 park(2);
		 click(driver,com.fanniemae.automation.UserTypeWebElements.model.UserType.user);
		 click(driver, UserType.browseContacts);
		 park(2);
		sendKeys(driver, UserType.keyWords, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keyWords, sheetName));
		sendKeys(driver, UserType.organization,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, organization, sheetName));
		sendKeys(driver, UserType.supplier,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, suppliers, sheetName));
		 enterByRobot();
		click(driver, UserType.search);
		Assert.assertTrue(UserType.reset.isDisplayed());
		System.out.println("reset button is displayed");
		 //click(driver, UserType.reset);
		 park(2);
		 dropDownByTextVisibility(driver, UserType.contactType,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contactType, sheetName));
		 park(2);
		// WebElementOperations.sendKeys(driver, UserType.organization,  AbstractTest.getExcelAbstractTest.getExcelRepository()().getCellDataOnTestCase(serialNo, organization, sheetName));
		click(driver, UserType.pencilIcon);
		park(2);	
		   click(driver, UserType.user);
			click(driver, UserType.authorizations);
			dropDownByIndex(driver, UserType.moduleForAuthorization, 1);
			dropDownByIndex(driver, UserType.moduleForProfile, 1);
		park(2);
			sendKeys(driver, UserType.auth, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, auth, sheetName));
		sendKeys(driver, UserType.profile, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, profile, sheetName));
		park(2);
	   click(driver, UserType.createAuthorization);
	   park(2);
	 switchToFrame(driver, 0);
	  park(2);
		sendKeys(driver, UserType.authorizationCode, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, authorizationCode, sheetName));
		park(2);
	  dropDownByIndex(driver, UserType.moduleAvailableInTheApplication, 2);
		sendKeys(driver, UserType.descrption,AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, descrption, sheetName));
			dropDownByIndex(driver, UserType.forContent, 1);
			switchToDefaultContentFrame(driver);
			  }
	
	
	public void createUser1(String serialNo,String sheetName)
	{
		click(driver, UserType.user);
	   click(driver, UserType.authorizations);
	   Assert.assertTrue(UserType.save.isDisplayed());
	   System.out.println("save button is displayed");
	   
	   Assert.assertTrue(UserType.ExtraAuthorization.isEnabled());
	   System.out.println("ExtraAuthorization is displayed");
	   
	   Assert.assertTrue(UserType.Export.isEnabled());
	   System.out.println("export is displayed");
		dropDownByIndex(driver, UserType.moduleForAuthorization, 1);
		dropDownByIndex(driver, UserType.moduleForProfile, 1);
		park(2);
	    sendKeys(driver, UserType.auth, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, auth, sheetName));
	   sendKeys(driver, UserType.profile, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, profile, sheetName));
	    park(2);
		click(driver, UserType.createAuthorization);
		park(2);
     	switchToFrame(driver, 0);
		park(2);
     	sendKeys(driver, UserType.authorizationCode, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, authorizationCode, sheetName));
		park(2);
	   dropDownByIndex(driver, UserType.moduleAvailableInTheApplication, 2);
	   park(2);
		sendKeys(driver, UserType.descrption, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, descrption, sheetName));
	 park(2);
	 dropDownByIndex(driver, UserType.forContent, 1);
	 park(2);
	 Assert.assertTrue(UserType.save.isDisplayed());
	 System.out.println("save button is displayed");
	 park(2);
	 Assert.assertTrue(UserType.saveAndCLose.isDisplayed());
	 System.out.println("Saveandclose button is displayed");
	 park(2);
	 Assert.assertTrue(UserType.saveAndNew.isDisplayed());
	 System.out.println("saveand new button is displayed");
	 park(2);
	 Assert.assertTrue(UserType.close.isDisplayed());
	 System.out.println("close button is displayed");
	 park(2);
		switchToDefaultContentFrame(driver);
		}
}


