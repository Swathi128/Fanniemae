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
import org.openqa.selenium.WebElement;

import com.fanniemae.automation.Elementsfactory.model.Elementsfactory;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;



public class RealEstateBroker 
{
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private Elementsfactory elementFactory;
	private WebDriver driver = null;
	
	public RealEstateBroker(Elementsfactory elementfactory, WebDriver driver) {
		super();
		this.elementFactory = elementfactory;
		this.driver = driver;
	}
	public void autoSuggestionHandle(WebElement inputBox, String inputText ){
		try {
			sendKeys(driver, inputBox,inputText);
			park(2);
			click(driver, elementFactory.supplier.costCentreList);
		} catch (Exception e) {
			LOG.error("Failed to select a value from AutoFill suggestion");
		}
	}
}
