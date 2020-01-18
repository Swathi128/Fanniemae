package com.fanniemae.automation.elements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateRequistion {

	@FindBy(name = "body:x:tabc:x:identity:x:prxidentity:x:proxyItemControl:x:btnNewItem_btn2")
	public static WebElement addItem;
	@FindBy(xpath = "//input[@name='body:x:txtItemLabel:x:x']")
	public static WebElement itemDescription;
	@FindBy(xpath = "//input[@name='body:x:txtPrice:x:x']")
	public static WebElement itemPrice;
	@FindBy(xpath = "//input[@name='body:x:txtQuantity:x:x']")
	public static WebElement itemQuantity;
	@FindBy(id = "ddlbody_x_selUnit_x")
	public static WebElement unitOfMeasure;
	@FindBy(xpath = "//input[@name='body:x:selFamily:x:btnselFamily_btn2']")
	public static WebElement categoryButton;
	@FindBy(xpath = "//i[@id='body_x_grid_x__ctl4__ctl0']")
	public static WebElement labelIcon;
	@FindBy(xpath = "//input[@name='proxyActionBar:x:_cmdSave_btn2']")
	public static WebElement labelSaveButton;
	@FindBy(xpath = "(//*[text()='GL Account']/../following-sibling::tr[2]/td[2]/table//tr/td)[2]")
	public static WebElement glAccountButton;
	@FindBy(xpath = "//input[@name='body:x:txtQuery:x:x']")
	public static WebElement accountSelectionKeyWords;
	@FindBy(xpath = "//input[@name='body:x:prxFilterBar:x:cmdSearchBtn_btn2']")
	public static WebElement accountSelectionSearch;
	@FindBy(id = "body_x_grdAccount_x__ctl2__ctl0")
	public static WebElement accountSelectionLabelIcon;
	@FindBy(xpath = "(//*[text()='GL Account']/../following-sibling::tr[2]/td[3]/table//tr/td)[1]/input")
	public static WebElement costCenter;
	@FindBy(xpath = "//div[@role='menuitem']/div")
	public static WebElement costCentreList;
	@FindBy(xpath = "(//*[text()='GL Account']/../following-sibling::tr[2]/td[4]/table//tr/td)[1]/input")
	public static WebElement peopleSoftProjectID;
	@FindBy(xpath = "//*[@value='Save & close']")
	public static WebElement saveandCloseButton;
	@FindBy(xpath = "//input[@value='Submit for Approval']")
	public static WebElement submitForApproval;
	@FindBy(xpath = "//div[@id='messageBar']//div/button[2]/span")
	public static WebElement saveButtonMark;
	@FindBy(id = "aLoginMenu")
	public static WebElement loginMenu;
	@FindBy(xpath = "//a[contains(text(),'My open workflow tasks')]")
	public static WebElement myOpenWorkflowTasks;
	@FindBy(id = "ddlbody_x_ddlAction_x")
	public static WebElement status;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement statusButton;
	@FindBy(xpath = "//table[@class='PowerGridClass']/tbody/tr/td[14]/a")
	public static WebElement allLables;
	@FindBy(xpath = "//div//span[contains(text(),'Workflow')]")
	public static WebElement workflow;
	@FindBy(xpath = "//input[@name='proxyActionBar:x:valPUO_v7CATMANVAL_btn2']")
	public static WebElement approveButton;
	@FindBy(xpath = "//span[@class='fa fa-times']")
	public static WebElement saveButtonMarkC;
	@FindBy(id = "link_ivmenu00_menu_4")
	public static WebElement procurement;
	@FindBy(xpath = "//a[@id='link_ivmenu00_menu_4_sub0_sub0']")
	public static WebElement createRequisition;
	@FindBy(name = "body:x:tabc:x:identity:x:prxidentity:x:txtLabel:x:x")
	public static WebElement requisitionName;
	@FindBy(name = "body:x:tabc:x:identity:x:prxidentity:x:selRequester:x:txtselRequester:x:x")
	public static WebElement headerInformationRequester;
	@FindBy(name = "body:x:tabc:x:identity:x:prxidentity:x:txtComment:x:x")
	public static WebElement justification;
	@FindBy(xpath = "//input[@name='body:x:tabc:x:identity:x:prxidentity:x:prxFiles:x:UploadButtonControl_btn2']")
	public static WebElement clickDragToAddFiles;
	@FindBy(xpath = "//input[@id='proxyActionBar_x__cmdSave_btn2']")
	public static WebElement saveButton;
	@FindBy(xpath = "//h1[@class='maintitle']")
	public static WebElement basketNo;
	@FindBy(name = "body:x:tabc:x:identity:x:prxidentity:x:selBasketIdPrWatContactIdPrWat_3ACC567C:x:txtselBasketIdPrWatContactIdPrWat_3ACC567C:x:x")
	public static WebElement headerInformationPRWatchers;
}