package com.fanniemae.automation.Elementsfactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateSupplierBankingInfo {

	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtSupPaymentConfirmEmail_x_x")
	public static WebElement createSupplierBankingInformationSupplierEmailAddressForACHPaymentConf;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement createSupplierSaveButton;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement createSupplierContactInfoSaveAndClose;
	@FindBy(xpath = "//span[text()='Main Info']")
	public static WebElement mainInfoTab;
	@FindBy(xpath = "//td[text()='Supplier ID : ']/following-sibling::td/div")
	public static WebElement supplierId;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement createSupplierBankInfoSearchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement createSupplierBankInfoSearchBtn;
	@FindBy(id = "body_x_grid_x__ctl2__ctl0")
	public static WebElement createSupplierBankInfoClickOnResult;
}