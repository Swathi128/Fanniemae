package com.fanniemae.automation.userElements3.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BroadMessage {

	@FindBy(id = "link_ivmenu00_menu_7")
	public static WebElement user;
	@FindBy(id = "link_ivmenu00_menu_7_sub2_sub0_sub2")
	public static WebElement broadCastMessage;
	@FindBy(name = "body:x:txtQuery:x:x")
	public static WebElement keyWords;
	@FindBy(name = "body:x:ddlType:x")
	public static WebElement type;
	@FindBy(name = "body:x:txtBeginDate:x:x")
	public static WebElement beginDate;
	@FindBy(name = "body:x:txtBeginDate:x:selTT:x:txtselTT:x:x")
	public static WebElement hoursMinSecBegin;
	@FindBy(name = "body:x:txtEndDate:x:x")
	public static WebElement endDate;
	@FindBy(name = "body:x:txtEndDate:x:selTT:x:txtselTT:x:x")
	public static WebElement hoursMinSecEnd;
	@FindBy(name = "proxyActionBar:x:add_broadcast_btn2")
	public static WebElement AddMessage;
	@FindBy(name = "body:x:txtCode:x:x")
	public static WebElement code;
	@FindBy(id = "link_ivmenu00_menu_7_sub2_sub2")
	public static WebElement manageAddress;
	@FindBy(name = "body:x:ddlLegalCompany:x")
	public static WebElement legalCompany;
	@FindBy(name = "body:x:selOrga:x:txtselOrga:x:x")
	public static WebElement organization;
	@FindBy(id = "ddlbody_x_ddlCountry_x")
	public static WebElement country;
	@FindBy(name = "body:x:ddlAddressType:x")
	public static WebElement addressType;
	@FindBy(name = "proxyActionBar:x:_cmdNew_btn2")
	public static WebElement addNewType;
	@FindBy(name = "body:x:selContact:x:txtselContact:x:x")
	public static WebElement contact;
	@FindBy(name = "body:x:prxAddress:x:txtCompNom:x:x")
	public static WebElement name;
	@FindBy(name = "body:x:prxAddress:x:txtAdrOfficeNumber:x:x")
	public static WebElement officeNumber;
	@FindBy(name = "body:x:prxAddress:x:txtAdrFloor:x:x")
	public static WebElement floor;
	@FindBy(name = "body:x:prxAddress:x:txtNum:x:x")
	public static WebElement number;
	@FindBy(name = "body:x:prxAddress:x:txtVoie:x:x")
	public static WebElement address1;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement save;
	@FindBy(name = "body:x:prxAddress:x:txtZip:x:x")
	public static WebElement zip;
	@FindBy(name = "body:x:prxAddress:x:txtCity:x:x")
	public static WebElement city;
}