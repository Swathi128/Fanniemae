package com.fanniemae.automation.userElements1.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class userManagement {

	@FindBy(id = "link_ivmenu00_menu_7_sub2")
	public static WebElement userManagement;
	@FindBy(id = "link_ivmenu00_menu_7")
	public static WebElement user;
	@FindBy(id = "proxyActionBar_x_add_new_user_btn2")
	public static WebElement createNewUser;
	@FindBy(name = "body:x:txtQuery:x:x")
	public static WebElement keyWords;
	@FindBy(name = "body:x:selSupplier:x:txtselSupplier:x:x")
	public static WebElement supplier;
	@FindBy(id = "body_x_ddlContactType_x")
	public static WebElement contactType;
	@FindBy(id = "body_x_grid_x__ctl2___colManagegrid")
	public static WebElement pencilIcon;
	@FindBy(name = "body:x:prxFilterBar:x:cmdSearchBtn_btn2")
	public static WebElement search;
	@FindBy(name = "body:x:prxFilterBar:x:cmdRazBtn_btn2")
	public static WebElement reset;
	@FindBy(xpath = "/html/body/form[1]/div/div[2]/table/tbody/tr/td/div/div[1]/div/div[2]/div/div/div/span")
	public static WebElement perferences;
	@FindBy(name = "body:x:tab:x:extra_tab_0:x:prxextra_tab_0:x:extens_1:x:selOrga:x:txtselOrga:x:x")
	public static WebElement defaultOrganization;
	@FindBy(name = "body:x:tab:x:extra_tab_0:x:prxextra_tab_0:x:extens_1:x:selOrgaDeliv:x:txtselOrgaDeliv:x:x")
	public static WebElement defaultDeliveryPlace;
	@FindBy(xpath = "/html/body/form[1]/div/div[2]/table/tbody/tr/td/div/div[1]/div/div[3]/div/div/div/span")
	public static WebElement OrgaPerimeter;
	@FindBy(id = "body_x_tab_x_extra_tab_1_x_prxextra_tab_1_x_txtQuery_x_x")
	public static WebElement keyWordsOrgPerimeter;
	@FindBy(xpath = "/html/body/form[1]/div/div[2]/table/tbody/tr/td/div/div[4]/strong/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/ul/li[1]/ul/li/a/i[1]")
	public static WebElement CheckAll;
	@FindBy(xpath = "/html/body/form[1]/div/div[2]/table/tbody/tr/td/div/div[1]/div/div[4]/div/div/div/span")
	public static WebElement commodityPerimeter;
	@FindBy(xpath = "/html/body/form[1]/div/div[2]/table/tbody/tr/td/div/div[1]/div/div[5]/div/div/div/span")
	public static WebElement costCenters;
	@FindBy(name = "body:x:tab:x:extra_tab_2:x:prxextra_tab_2:x:ProxyFamily:x:tvFam:txtQuery:x:x")
	public static WebElement keyWordsCommodity;
	@FindBy(name = "body:x:tab:x:extra_tab_3:x:prxextra_tab_3:x:txtQuery:x:x")
	public static WebElement keyWordsCostCenters;
	@FindBy(xpath = "/html/body/form[1]/div/div[2]/table/tbody/tr/td/div/div[1]/div/div[6]/div/div/div/span")
	public static WebElement projects;
	@FindBy(name = "body:x:tab:x:extra_tab_4:x:prxextra_tab_4:x:selProject:x:txtselProject:x:x")
	public static WebElement projectsName;
	@FindBy(id = "proxyActionBar_x_mass_eddit_btn2")
	public static WebElement massEdit;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement save;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement close;
	@FindBy(id = "proxyActionBar_x__cmdEdit_btn2")
	public static WebElement duplicateUser;
	@FindBy(id = "proxyActionBar_x__cmdNew_btn2")
	public static WebElement saveAndNew;
}