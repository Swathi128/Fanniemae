package com.fanniemae.automation.userElements2.model;

import com.fanniemae.automation.userElements2.model.NotificationsAndEmail;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class UserElements2 {

	public NotificationsAndEmail notificationsAndEmail;

	public NotificationsAndEmail getNotificationsAndEmail() {
		return notificationsAndEmail;
	}

	public void setNotificationsAndEmail(NotificationsAndEmail notificationsAndEmail) {
		this.notificationsAndEmail = notificationsAndEmail;
	}

	public void init(WebDriver driver) {
		notificationsAndEmail = PageFactory.initElements(driver, NotificationsAndEmail.class);
	}
}