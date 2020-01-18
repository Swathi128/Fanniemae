package com.fanniemae.automation.Elementsfactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contacts {

	@FindBy(css = "#body_x_tabc_containerTab_partcontact .tab_label_class > div")
	public static WebElement createSupplierContactInfoTab;
	@FindBy(id = "body_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact_x_btnselContact_btn2")
	public static WebElement createSupplierContactInfoAddAContact;
	@FindBy(id = "ddlbody_x_pxCtc_x_ContactControl_x_selStatusCode_x")
	public static WebElement createSupplierSupplierContactManagementStatus;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactLastname_x_x")
	public static WebElement createSupplierContactInfoLastName;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactFirstname_x_x")
	public static WebElement createSupplierContactInfoFirstName;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactEmail_x_x")
	public static WebElement createSupplierContactInfoEmail;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactPhone_x_x")
	public static WebElement createSupplierContactInfoPhono;
}