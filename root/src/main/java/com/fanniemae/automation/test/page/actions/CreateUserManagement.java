package com.fanniemae.automation.test.page.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.elements.model.Elements;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.userElements1.model.UserElements1;
import com.fanniemae.automation.userElements1.model.userManagement;
import com.fanniemae.automation.util.Assert;
import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByIndex;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;


public class CreateUserManagement
{
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private UserElements1 userType1;
	private WebDriver driver = null;
	
	public CreateUserManagement(UserElements1 userType1, WebDriver driver) {
		super();
		this.userType1 = userType1;
		this.driver = driver;
	}    
	
	
	private int keyWords=FanniemaeConstants.G;
	private int suppliers=FanniemaeConstants.H;
	private int contactType=FanniemaeConstants.I;
	private int defaultOrganization=FanniemaeConstants.Q;
	private int defaultDeliveryPlace=FanniemaeConstants.R;
	private int keyWordsOrgPerimeter=FanniemaeConstants.S;
	private int keyWordsCommodity=FanniemaeConstants.T;
	private int keyWordsCostCenters=FanniemaeConstants.U;
	private int projectsName=FanniemaeConstants.V;
	
	public void UserManagement1(String serialNo,String sheetName)
	{
	 click(driver, userManagement.user);
	 click(driver, userManagement.userManagement);
	 park(2);
	 Assert.assertTrue(userManagement.massEdit.isDisplayed());
	 System.out.println("mass edit is displayed");
	 park(2);
	 sendKeys(driver, userManagement.keyWords, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keyWords, sheetName));
     sendKeys(driver, userManagement.supplier, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, suppliers, sheetName));
	 enterByRobot();
	 click(driver, userManagement.search);
	 click(driver, userManagement.reset);
	 dropDownByTextVisibility(driver, userManagement.contactType, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contactType, sheetName));
	 park(2);
	 click(driver, userManagement.pencilIcon);
	 park(2);
	 Assert.assertTrue(userManagement.save.isDisplayed());
	 System.out.println("save button is displayed");
	 park(2);
	 Assert.assertTrue(userManagement.close.isDisplayed());
	 System.out.println("close button is displayed");
	 park(2);
	 Assert.assertTrue(userManagement.duplicateUser.isDisplayed());
	 System.out.println("duplicateuser button is displayed");
	 park(2);
	 Assert.assertTrue(userManagement.saveAndNew.isDisplayed());
	 System.out.println("save andnew button is displayed");
	 park(2);
	 click(driver, userManagement.perferences);
	 click(driver, userManagement.OrgaPerimeter);
	 park(2);
	 sendKeys(driver, userManagement.keyWordsOrgPerimeter, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keyWordsOrgPerimeter, sheetName));
	 park(2);
	 click(driver, userManagement.commodityPerimeter);
	 park(2);
	sendKeys(driver, userManagement.keyWordsCommodity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keyWordsCommodity, sheetName));
	park(2);
	click(driver, userManagement.costCenters);
	park(2);
	sendKeys(driver, userManagement.keyWordsCostCenters, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keyWordsCostCenters, sheetName));
	park(2);
    click(driver, userManagement.projects);
	park(2);
	sendKeys(driver, userManagement.projectsName, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, projectsName, sheetName));
	}	

}
