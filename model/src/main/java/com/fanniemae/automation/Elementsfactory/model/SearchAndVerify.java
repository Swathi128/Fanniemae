package com.fanniemae.automation.Elementsfactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAndVerify {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement createSupplierSupplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub0")
	public static WebElement createSupplierBrowseSuppliers;
	@FindBy(xpath = "//*[@id='ddlbody_x_ddlStatus_x__label']/../following-sibling::td/table//tbody/tr[2]//tbody/tr/td[1]")
	public static WebElement createSupplierStatusCroseMark;
	@FindBy(id = "ddlbody_x_ddlType_x")
	public static WebElement searchSupplierSupplierType;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement searchSupplierSearchKeyword;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchSupplierSearchButton;
	@FindBy(xpath = "//table[@id='body_x_grid_x']//tr/td[6]")
	public static WebElement searchSupplierResultGridSupplierId;
}