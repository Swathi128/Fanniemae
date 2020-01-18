package com.techouts.fanniemae.webelement.ops;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.registry.Registry;
import com.fanniemae.automation.registry.RegistryKey;
import com.fanniemae.automation.util.Assert;
import com.fanniemae.automation.util.PathProvider;
import com.fanniemae.automation.util.exceptions.FannieMaeBusinessException;
import com.fanniemae.automation.util.exceptions.WebElementOperationException;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public final class WebElementOperations {

	private WebElementOperations() {}
	
	private static final String SCREENSHOT_TIME_FORMAT = "ddMMYYYYHHmmssSSS"; 
	
	private static final Logger LOG = Logger.getLogger(WebElementOperations.class.getName());
	
	
	public static  void sendKeys(WebDriver driver, WebElement element, String token) {
		try {
			webElementHighlighter(driver, element);
			park(0.3);
			element.clear();
			element.sendKeys(token);
		} catch (Exception e) {
			throwWebElementOperationException("Unable to sendKeys["+token+"] on WebElement["+element+"].", e);
		}
	}
	
	public static boolean waitForAlertPresent(WebDriver driver, int seconds) {
		try {
			LOG.info("Waiting for "+seconds+" seconds, to get alert to be present.");
			new WebDriverWait(driver, seconds).until(ExpectedConditions.alertIsPresent());
			return true;
		} catch (Exception e) {
			throwWebElementOperationException("Couldn't find alert on the page, post "+seconds+" seconds WebDriverWait ", e);
		}
		return false;
	}
	
	public static boolean acceptAlertIfPresent(WebDriver driver, int seconds){
		try {
			waitForAlertPresent(driver, seconds);
			acceptAlert(driver);
			return true;
		} catch (Exception e) {
			throwWebElementOperationException(e.getMessage(), e);
		}
		return false;
	}
	
	public static  void scrollToBottom(WebDriver driver, int xAxis, int yAxis) {
		executeJS(driver, new StringBuilder("\"window.scrollBy(").append(xAxis).append(',').append(yAxis).append(")").toString());
	}
	
	public static  boolean verifyPageTitle(WebDriver driver, String expectedTitle){
		String pageTitle = null;
		try {
			pageTitle = driver.getTitle().trim();
			Assert.assertEquals(pageTitle, expectedTitle, "Page title is not as expected.");
			return true;
		}catch (Exception e) {
			throwWebElementOperationException("Error occurred while comparing the ActualPageTitle["+pageTitle+"] with ExpectedPageTitle["+expectedTitle+"].", e);
		}
		return false;
	}
	
	public  static String getTimeStamp(String dateFormat) {
		return new SimpleDateFormat(dateFormat).format(new Date());
	}
	
	public static void waitForPageLoad(WebDriver driver, int seconds) {
		try{
			new WebDriverWait(driver, seconds).until(WebElementOperations::getExpectedCondition);
		}catch(Exception e){
			throwWebElementOperationException("Waited for page to load for "+seconds+" seconds.", e);
		}
	}
	public static void waitForElementVisible(WebDriver driver, int seconds, WebElement el) {
		try{
			new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOf(el));
		}catch(Exception e){
			throwWebElementOperationException("Waited for page to load for "+seconds+" seconds.", e);
		}
	}
	
	public static void waitForElementClickable(WebDriver driver, int seconds, WebElement el) {
		try{
			new WebDriverWait(driver, seconds).until(ExpectedConditions.elementToBeClickable(el));
		}catch(Exception e){
			throwWebElementOperationException("Waited for page to load for "+seconds+" seconds.", e);
		}
	}
	public static void waitforelement(WebDriver driver) {
		try{
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
		}catch(Exception e) {
			throw new FannieMaeBusinessException(e);
		}
	}
	
	private static Boolean getExpectedCondition(WebDriver driver) {
		return ((JavascriptExecutor) driver).executeScript(FanniemaeConstants.JS_EXPECTED_CONDITION_RESULT_SCRIPT).equals(FanniemaeConstants.COMPLETE);
	}
	
	
	public static  void dropDownByIndex(WebDriver driver, WebElement element, int index) {
		try {
			webElementHighlighter(driver, element);
			click(driver, element);
			Select rob = new Select(element);
			rob.selectByIndex(index);
		} catch (Exception e) {
			throwWebElementOperationException("Error occurred while performing drop down by Index["+index+"] on WebElement:"+element,e);
		}
	}
	
	public static  void dropDownByTextVisibility(WebDriver driver, WebElement element, String visibleTxt) {
		try {
			webElementHighlighter(driver, element);
			//click(driver, element);
			new Select(element).selectByVisibleText(visibleTxt);
			LOG.info(" Element selects "+visibleTxt);
		} catch (Exception e) {
			throwWebElementOperationException("Error occurred while performing drop down by TextVisibility["+visibleTxt+"] on WebElement:"+element,e);
		}
	}
	
	public static  void switchToDefaultContentFrame(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();
		}catch(Exception e) {
			throwWebElementOperationException("Error occurred while switching to DefaultContentFrame.",e);
		}
	}
	
	public static  void switchToFrame(WebDriver driver, int index) {
		try {
			driver.switchTo().frame(index);
		}catch(Exception e) {
			throwWebElementOperationException("Error occurred while switching to frame with index["+index+"].",e);
		}
	}
	
	
	public static  void click(WebDriver driver, WebElement element) {
		try {
			webElementHighlighter(driver, element);
			park(0.3);
			element.click();
		} catch (Exception e) {
			throwWebElementOperationException("Unable to perform click operation on WebElemet:"+element, e);
		}
	}
	
	public static  void webElementHighlighter(WebDriver driver, WebElement element) {
		executeJS(driver, FanniemaeConstants.HIGHLIGHTER_TOKEN, element);
	}
	
	
	public static  void executeJS(WebDriver driver, String script) {
		executeJS(driver, script, null);
	}
	
	public static void executeJS(WebDriver driver, String script, WebElement element) {
		try {
			if ( Objects.nonNull(driver) && (driver instanceof JavascriptExecutor) && StringUtils.isNotBlank(script)) {
				if(Objects.nonNull(element))
					((JavascriptExecutor) driver).executeScript(script, element);
				else
					((JavascriptExecutor) driver).executeScript(script);
			}
		}catch(Exception e) {
			throwWebElementOperationException("Unknown error occurred while executing Javascript["+script+"] on WebElement["+element+"]", e);
		}
	}
	
	private static  void throwWebElementOperationException(String msg, Throwable throwable){
		if(StringUtils.isNotBlank(msg))
			throw new WebElementOperationException(msg, throwable);
		else
			throw new WebElementOperationException(throwable);
	}

	public static  Path captureScreenShot(WebDriver driver, String testCaseName, String snapshotType, String snapshotMessage) {
		Path path = null;
		try {
			if (snapshotType.equals(FanniemaeConstants.PASS)) {
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				path = prepareScreenshotPath(testCaseName, snapshotMessage);
				FileUtils.copyFile(scrFile, path.toFile());
			} else if (snapshotType.equals(FanniemaeConstants.FAIL)) {
				path = prepareFailedScreenshotPath(testCaseName, snapshotMessage);
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, path.toFile());
			}
		} catch (Exception e) {
			throwWebElementOperationException("Error occurred while taking screenshot at Path["+path+"] for TestCaseName:"+testCaseName,e);
		}
		return path;
	}
	
	public static  Path captureScreenShotOnPass(WebDriver driver, String testCaseName) {
		return captureScreenShot(driver, testCaseName, FanniemaeConstants.PASS, FanniemaeConstants.PASSED);
	}
	
	public static  Path captureScreenShotOnFail(WebDriver driver, String testCaseName) {
		return captureScreenShot(driver, testCaseName, FanniemaeConstants.FAIL, FanniemaeConstants.FAILED);
	}
	
	
	public static Path prepareScreenshotPath(String... tokens){
		StringJoiner joiner = new StringJoiner("_");
		for(String token : tokens) {
			joiner.add(token);
		}
		String timestamp = (String)Registry.getAttribute(RegistryKey.DIR_TIMESTAMP_SUFFIX);
		return Paths.get(PathProvider.getCurExecScreenshotRootDir(timestamp).toString(), FanniemaeConstants.PASSED, joiner.add(getTimeStamp(SCREENSHOT_TIME_FORMAT)).add(FanniemaeConstants.DOT_JPG).toString());
	}
	
	public static Path prepareFailedScreenshotPath(String... tokens){
		StringJoiner joiner = new StringJoiner("_");
		for(String token : tokens) {
			joiner.add(token);
		}
		String timestamp = (String)Registry.getAttribute(RegistryKey.DIR_TIMESTAMP_SUFFIX);
		return Paths.get(PathProvider.getCurExecScreenshotRootDir(timestamp).toString(), FanniemaeConstants.FAILED, joiner.add(getTimeStamp(SCREENSHOT_TIME_FORMAT)).add(FanniemaeConstants.DOT_JPG).toString());
	}
	
	public static void acceptAlert(WebDriver driver){
		try{
			driver.switchTo().alert().accept();
		}catch(Exception e){
			throwWebElementOperationException("Error occurred while handling alert.", e);
		}
	}
	
	public static  void waitForElementPresence(WebDriver driver, WebElement element, int seconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOf(element));
			webElementHighlighter(driver, element);
		} catch (Exception e) {
			throwWebElementOperationException("Error occurred while waiting for the WebElement["+element+"] to load.", e);
		}
	}
	
	public static  String getText(WebDriver driver, WebElement element) {
		try {
			waitForElementPresence(driver, element, 30);
			webElementHighlighter(driver, element);
			return element.getText();
		} catch (Exception ex) {
			LOG.error("Error occurred while parsing the text from WebElement["+element+"]");
			return null;
		}
	}
	
	public static  boolean verifyTextOfGetAttributeEmptyOrNot(WebDriver driver, WebElement element) {
		float val = Float.parseFloat(element.getAttribute("value"));
		webElementHighlighter(driver, element);
		return (val > 0) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue();
	}
	
	public static  boolean containsEmptyAttributeValue(WebDriver driver, WebElement element) {
		String val = getAttributeValue(driver, element);
		return (StringUtils.isBlank(val)) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue();
	}
	
	public static  String getAttributeValue(WebDriver driver, WebElement element) {
		webElementHighlighter(driver, element);
		return element.getAttribute("value");
	}
	
	public static String covertMillis(Long millis){
		long hours = TimeUnit.MILLISECONDS.toHours(millis);
        millis -= TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        millis -= TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
        return String.format("%02d:%02d:%02d",hours, minutes,seconds);
	}
	
	public static void park(double seconds) {
		try{
			Thread.sleep((int)(seconds * 1000));
		}catch(Exception e) {
			throw new FannieMaeBusinessException(e);
		}
	}
	
	
	
	public static void validateGivenDataFromTable(WebDriver driver,List<WebElement> elements,String exptected) {
		String data;
		int i=2;
		try {
			for (WebElement el : elements) {
				data=el.getText();
				data=data.substring(3, 7);
				if(exptected.contains(data)){
					Thread.sleep(2000);
					//kkkkkkkkkkkkkkkkkkkkkkkk
					webElementHighlighter(driver, driver.findElement(By.xpath("//table[@class='PowerGridClass']/tbody/tr["+i+"]/td[1]/a")));
					//kkkkkkkkkkkkkkkkkkkkkkkkkkk
					WebElement link=driver.findElement(By.xpath("//table[@class='PowerGridClass']/tbody/tr["+i+"]/td[1]/a"));
					link.click();
				}
				Thread.sleep(500);
				i++;
			}				
		} catch (Exception e) {
			LOG.error("error occur at table data validataion");
		}
	}
	
	public static String suffixIncrementBy1(String name){
		try {
			int number=Integer.parseInt(name.replaceAll("[^0-9]", ""));
			number++;
			String chars=name.replaceAll("[^A-Za-z]", "");
			name=chars+Integer.toString(number);
			LOG.info("Update input data is "+name);
			return name;
		} catch (Exception e) {
			return null;
	
		}
	}
	
	public static boolean corporaterSearch(WebDriver driver, List<WebElement> elements,String exptected) {
		boolean status = false;
		try {
			for (WebElement element : elements) {
				webElementHighlighter(driver, element);
				String data = element.getText();
				if(data.contains(exptected)){
					Thread.sleep(2000);
					LOG.info("Find seach data:"+data);
					element.click();
					status = true;
					break;
				}
				Thread.sleep(500);
			}				
		} catch (Exception e) {
			throwWebElementOperationException("Search result not find with given input data ", e);
			status = false;
		}
		return status;
	}

	public static boolean enterByRobot() {
		Robot robot;
		try {
			robot = new Robot();
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			return true;
		} catch (Exception e) {
			LOG.error("Unable to enter robot enter");
			return false;
		}

	}
	public static boolean getTextFromAlert(WebDriver driver, String exptectedTest, int seconds){
		try {
			waitForAlertPresent(driver, seconds);
			String res=driver.switchTo().alert().getText();
			if(!res.contains(exptectedTest)) {
				LOG.info("Data have filled and submited");
				park(4);
				acceptAlert(driver);
				return true;
			}
			else {
				LOG.debug("Data have NOT filled and submited");
				return false;
			}
		} catch (Exception e) {
			throwWebElementOperationException(e.getMessage(), e);
		}
		return false;
	}
}
