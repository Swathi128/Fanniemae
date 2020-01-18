package com.fanniemae.automation.UserTypeWebElements.model;

import com.fanniemae.automation.UserTypeWebElements.model.UserType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class UserTypeWebElements {

	public UserType userType;

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public void init(WebDriver driver) {
		userType = PageFactory.initElements(driver, UserType.class);
	}
}