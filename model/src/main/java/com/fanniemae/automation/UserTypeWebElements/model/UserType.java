package com.fanniemae.automation.UserTypeWebElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserType {

	@FindBy(id = "link_ivmenu00_menu_7")
	public static WebElement user;
	@FindBy(id = "link_ivmenu00_menu_7_sub0")
	public static WebElement browseContacts;
	@FindBy(name = "body:x:txtQuery:x:x")
	public static WebElement keyWords;
	@FindBy(name = "body:x:selSupplier:x:txtselSupplier:x:x")
	public static WebElement supplier;
	@FindBy(id = "ddlbody_x_ddlContactType_x")
	public static WebElement contactType;
	@FindBy(name = "body:x:tvOrga:x:txttvOrga:x:x")
	public static WebElement organization;
	@FindBy(id = "body_x_ContactGrid_x__ctl2___colManageContactGrid")
	public static WebElement pencilIcon;
	@FindBy(name = "body:x:prxFilterBar:x:cmdSearchBtn_btn2")
	public static WebElement search;
	@FindBy(name = "body:x:prxFilterBar:x:cmdRazBtn_btn2")
	public static WebElement reset;
	@FindBy(name = "body:x:ContactControl:x:ddlPtitleId:PtitleId")
	public static WebElement personTitle;
	@FindBy(name = "body:x:ContactControl:x:txtContactLastname:x:x")
	public static WebElement lastName;
	@FindBy(name = "body:x:ContactControl:x:txtContactFirstname:x:x")
	public static WebElement firstName;
	@FindBy(id = "link_ivmenu00_menu_7_sub1")
	public static WebElement authorizations;
	@FindBy(name = "body:x:ddlModuleAuth:x")
	public static WebElement moduleForAuthorization;
	@FindBy(name = "body:x:ddlModuleProfile:x")
	public static WebElement moduleForProfile;
	@FindBy(name = "body:x:txtSearchAuth:x:x")
	public static WebElement auth;
	@FindBy(name = "body:x:txtSearchProfile:x:x")
	public static WebElement profile;
	@FindBy(name = "proxyActionBar:x:btnAddAuth_btn2")
	public static WebElement createAuthorization;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement save;
	@FindBy(id = "proxyActionBar_x_btnExtractAuth_btn2")
	public static WebElement ExtraAuthorization;
	@FindBy(id = "proxyActionBar_x_btnExporExel_btn2")
	public static WebElement Export;
	@FindBy(name = "body:x:c_auth_code:x:x")
	public static WebElement authorizationCode;
	@FindBy(id = "ddlbody_x_c_mdesc_name_x")
	public static WebElement moduleAvailableInTheApplication;
	@FindBy(name = "body:x:c_auth_desc_:x:c_auth_desc_en")
	public static WebElement descrption;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement saveAndCLose;
	@FindBy(id = "proxyActionBar_x__cmdNew_btn2")
	public static WebElement saveAndNew;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement close;
	@FindBy(name = "body:x:c_auth_ctn:x0")
	public static WebElement forContent;
}