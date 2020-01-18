package com.fanniemae.automation.Elementsfactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class approval {

	@FindBy(xpath = "//input[@name='proxyActionBar:x:_cmdSave_btn2']")
	public static WebElement saveButton;
	@FindBy(id = "proxyActionBar_x_valctr_lifecycle_fm_eleven_2PRE_INI_btn2")
	public static WebElement contractTeamSet;
	@FindBy(xpath = "//span[@class='fa fa-times']")
	public static WebElement saveButtonMarkC;
	@FindBy(xpath = "//input[@name='proxyActionBar:x:valPUO_v7CATMANVAL_btn2']")
	public static WebElement approveButton;
}