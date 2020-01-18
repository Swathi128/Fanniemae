package com.fanniemae.automation.elements.model;

import com.fanniemae.automation.elements.model.CreateRequistion;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class Elements {

	public CreateRequistion createRequistion;

	public CreateRequistion getCreateRequistion() {
		return createRequistion;
	}

	public void setCreateRequistion(CreateRequistion createRequistion) {
		this.createRequistion = createRequistion;
	}

	public void init(WebDriver driver) {
		createRequistion = PageFactory.initElements(driver, CreateRequistion.class);
	}
}