package com.fanniemae.automation.userElements3.model;

import com.fanniemae.automation.userElements3.model.BroadMessage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class UserElements3 {

	public BroadMessage broadMessage;

	public BroadMessage getBroadMessage() {
		return broadMessage;
	}

	public void setBroadMessage(BroadMessage broadMessage) {
		this.broadMessage = broadMessage;
	}

	public void init(WebDriver driver) {
		broadMessage = PageFactory.initElements(driver, BroadMessage.class);
	}
}