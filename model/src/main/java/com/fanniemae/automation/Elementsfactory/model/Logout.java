package com.fanniemae.automation.Elementsfactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {

	@FindBy(id = "aLoginMenu")
	public static WebElement loginMenu;
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	public static WebElement logOutButton;
}