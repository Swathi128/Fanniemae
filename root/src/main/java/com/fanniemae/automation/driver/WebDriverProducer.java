package com.fanniemae.automation.driver;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import com.fanniemae.automation.enums.Browser;
import com.fanniemae.automation.registry.Registry;
import com.fanniemae.automation.util.PathProvider;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class WebDriverProducer {
	
	private WebDriverProducer() {}
	
	private static Map<Browser, WebDriver> drivers = new EnumMap<>(Browser.class);
	private static final Logger LOG = Logger.getLogger(WebDriverProducer.class.getName());

	static{
		System.setProperty("webdriver.chrome.driver", PathProvider.getForDriver(Browser.CHROME).toString());
		System.setProperty("webdriver.gecko.driver", PathProvider.getForDriver(Browser.FIREFOX).toString());
		System.setProperty("webdriver.ie.driver", PathProvider.getForDriver(Browser.IE).toString());
	}
	
	public static WebDriver getWebDriver(Browser browser, Capabilities capabilities) {
		WebDriver webdriver = null;
		if(Objects.nonNull(browser)) {
				if(drivers.containsKey(browser)) {
					LOG.info("Returning already available WebDriver["+drivers.get(browser)+"] from WebDriverRegistry.");
					webdriver = drivers.get(browser);
				}
				else {
					webdriver = initBrowser(browser, capabilities);
					LOG.info("No WebDriver found in the WebDriverRegistry for ["+browser.toString()+"], Creating a new WebDriver");
					drivers.put(browser, webdriver);
					registryUpdationOnAbsence(browser, webdriver);
				}
		}
		return webdriver;	
	}
	
	private static void registryUpdationOnAbsence(Browser browser, WebDriver driver){
		if(Objects.isNull(Registry.getAttribute(browser.toString()))){
			LOG.debug("No WebDriver found in the Registry with Browser["+browser.toString()+"], inserting new.");
			Registry.setAttribute(browser.toString(), driver);
		}
	}
	
	private static WebDriver initBrowser(Browser browser, Capabilities capabilities) {
		if(Objects.nonNull(browser)) {
			switch (browser) {
			case IE: return getIEDriver(capabilities);
			//case FIREFOX: return getFireFoxDriver(capabilities);
			case CHROME: return getChromeDriver(capabilities);
			default: throw new UnsupportedOperationException(browser+" is not configured for the execution.");	
			}
		}
		else {
			LOG.warn("Browser input type received null, returning the same.");
			return null;
		}
	}
	
	private static InternetExplorerDriver getIEDriver(Capabilities capabilities) {
		if(Objects.nonNull(capabilities) && capabilities instanceof InternetExplorerOptions) {
			LOG.info("instantiating InternetExplorerDriver with supplied InternetExplorerOptions["+((InternetExplorerOptions) capabilities)+"]");
			return new InternetExplorerDriver((InternetExplorerOptions) capabilities);
		}else {
			LOG.info("instantiating InternetExplorerDriver without InternetExplorerOptions[null]");
			return new InternetExplorerDriver();
		}
	}
	
	/*private static FirefoxDriver getFireFoxDriver(Capabilities capabilities) {
		if(Objects.nonNull(capabilities) && capabilities instanceof FirefoxOptions) {
			LOG.info("instantiating FirefoxDriver with supplied FirefoxOptions["+((FirefoxOptions) capabilities)+"]");
			return new FirefoxDriver((FirefoxOptions) capabilities);
		}else {
			LOG.info("instantiating FirefoxDriver without FirefoxOptions[null]");
			return new FirefoxDriver();
		}
	}*/
	
	private static ChromeDriver getChromeDriver(Capabilities capabilities) {
		if(Objects.nonNull(capabilities) && capabilities instanceof ChromeOptions) {
			LOG.info("instantiating ChromeDriver with supplied ChromeOptions["+((ChromeOptions) capabilities)+"]");
			return new ChromeDriver((ChromeOptions) capabilities);
		}else {
			LOG.info("instantiating ChromeDriver without ChromeOptions[null]");
			return new ChromeDriver();
		}
	}
	
	public static boolean closeDriver(Browser browser) {
		if(isDriversNotNull() && Objects.nonNull(browser) && drivers.containsKey(browser)) { 
			drivers.remove(browser).close();
			return true;
		}
		else
			return false;
		}
	
	public static void closeAll() {
		if(isDriversNotNull()) {
			drivers.keySet().forEach(a -> {
				if(Objects.nonNull(a))
					drivers.remove(a).quit();});
			LOG.info("All WebDriver instances are closed.");
		}
	}
	
	private static boolean isDriversNotNull() {
		return (Objects.nonNull(drivers) && !drivers.isEmpty()) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue();
	}
}
