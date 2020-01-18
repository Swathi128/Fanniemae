package com.fanniemae.automation.userElements1.model;

import com.fanniemae.automation.userElements1.model.userManagement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class UserElements1 {

	public userManagement userManagement;

	public userManagement getUserManagement() {
		return userManagement;
	}

	public void setUserManagement(userManagement userManagement) {
		this.userManagement = userManagement;
	}

	public void init(WebDriver driver) {
		userManagement = PageFactory.initElements(driver, userManagement.class);
	}
}