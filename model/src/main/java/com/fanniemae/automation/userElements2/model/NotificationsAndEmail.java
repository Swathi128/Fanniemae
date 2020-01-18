package com.fanniemae.automation.userElements2.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationsAndEmail {

	@FindBy(id = "link_ivmenu00_menu_7")
	public static WebElement user;
	@FindBy(id = "link_ivmenu00_menu_7_sub2_sub0")
	public static WebElement notifications;
	@FindBy(name = "body:x:txtQuery:x:x")
	public static WebElement keyWords;
	@FindBy(name = "body:x:selNotifPoint:x:txtselNotifPoint:x:x")
	public static WebElement notificationPoint;
	@FindBy(id = "ddlbody_x_selModule_x")
	public static WebElement module;
	@FindBy(name = "body:x:txtDate:x:x")
	public static WebElement sent;
	@FindBy(name = "body:x:txtDate:x:rtxtDate:x:x")
	public static WebElement to;
	@FindBy(id = "ddlbody_x_selStatus_x")
	public static WebElement status;
	@FindBy(name = "body:x:selContactTo:x:txtselContactTo:x:x")
	public static WebElement receiver;
	@FindBy(xpath = "(//*[contains(@id,'colSubject')])[1]")
	public static WebElement content;
	@FindBy(name = "chk[64f2d9da-12d3-4e3a-a882-1bca564d169f]")
	public static WebElement checkBox;
	@FindBy(id = "link_ivmenu00_menu_7_sub2_sub0_sub0")
	public static WebElement ManageTypesOfNotifications;
	@FindBy(id = "ddlbody_x_chkActivated_x")
	public static WebElement activated;
	@FindBy(name = "body:x:selOtypeCode:x:txtselOtypeCode:x:x")
	public static WebElement objectType;
	@FindBy(name = "body:x:selNcatCode:x:txtselNcatCode:x:x")
	public static WebElement category;
	@FindBy(name = "proxyActionBar:x:add_new_notification_point_btn2")
	public static WebElement createNewTypeOfNotification;
	@FindBy(name = "body:x:txtCode:x:x")
	public static WebElement code;
	@FindBy(name = "body:x:txtLabel:x:txtLabelen")
	public static WebElement notificationLabel;
	@FindBy(name = "body:x:txtFrom:x:x")
	public static WebElement defaultSender;
	@FindBy(name = "body:x:txtTo:x:x")
	public static WebElement defaultToMail;
	@FindBy(name = "body:x:txtReply:x:x")
	public static WebElement defaultReplyMail;
	@FindBy(name = "body:x:txtAcknowledge:x:x")
	public static WebElement defaultAcknowledgementMail;
	@FindBy(name = "body:x:selObject:x:txtselObject:x:x")
	public static WebElement objectForMergeFields;
	@FindBy(id = "link_ivmenu00_menu_7_sub2_sub0_sub1")
	public static WebElement emailLogs;
}