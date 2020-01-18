package com.fanniemae.automation.page.elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class WebElementFactory {
	
	//Login	Page elements
	@FindBy(id="body_x_txtLogin_x_x") 
	private WebElement usernameProcureOne;
	
	@FindBy(id="body_x_txtPass_x_x") 
	private WebElement passwordProcureOne;
	
	public WebElement getAddAnExistingContact() {
		return addAnExistingContact;
	}
	
	@FindBy(id = "body_x_tabc_x_contact_x_prxcontact_x_selContact_x_btnselContact_btn2")
	private WebElement addAnExistingContact;
	
	@FindBy(xpath="//input[@name='body:x:btnLogin_btn2']") 
	private WebElement loginProcureOne;
	
	//Create Requisition
	@FindBy(id="link_ivmenu00_menu_4") 
	private WebElement procurement;
	
	@FindBy(xpath="//a[@id='link_ivmenu00_menu_4_sub0_sub0']") 
	private WebElement createRequisition;
	
	@FindBy(name="body:x:tabc:x:identity:x:prxidentity:x:txtLabel:x:x") 
	private WebElement requisitionName;
	
	@FindBy(name="body:x:tabc:x:identity:x:prxidentity:x:selRequester:x:txtselRequester:x:x") 
	private WebElement headerInformationRequester;
	
	@FindBy(name="body:x:tabc:x:identity:x:prxidentity:x:selOrg:x:txtselOrg:x:x") 
	private WebElement headerInformationCostCentre;
	
	@FindBy(name="body:x:tabc:x:identity:x:prxidentity:x:selBasketIdPrWatContactIdPrWat_3ACC567C:x:txtselBasketIdPrWatContactIdPrWat_3ACC567C:x:x") 
	private WebElement headerInformationPRWatchers;
	
	@FindBy(name="body_x_tabc_x_identity_x_prxidentity_x_selBasketIdPrWatContactIdPrWat_3ACC567C_x_btnselBasketIdPrWatContactIdPrWat_3ACC567C_btn2") 
	private WebElement headerInformationPRWatchersButton;
	
	public WebElement getHeaderInformationPRWatchersButton() {
		return headerInformationPRWatchersButton;
	}

	@FindBy(name="body:x:tabc:x:identity:x:prxidentity:x:txtComment:x:x") 
	private WebElement justification;
	
	@FindBy(xpath="//input[@name='body:x:tabc:x:identity:x:prxidentity:x:prxFiles:x:UploadButtonControl_btn2']") 
	private WebElement clickDragToAddFiles;
	
	@FindBy(xpath="//input[@id='proxyActionBar_x__cmdSave_btn2']")
	private WebElement saveButton;
	
	@FindBy(id="proxyActionBar_x_valctr_lifecycle_fm_eleven_2PRE_INI_btn2") 
	private WebElement contractTeamSet;
	
	@FindBy(xpath="//*[@id=\\\"messageBar\\\"]/div/div[2]/button[2]/span[1]") 
	private WebElement closeMarkPostSave;
	
	@FindBy(name="body:x:tabc:x:identity:x:prxidentity:x:proxyItemControl:x:btnNewItem_btn2") 
	private WebElement addItem;
	
	@FindBy(xpath="//h1[@class='maintitle']") 
	private WebElement basketNo;
	
	//Item Frames
	@FindBy(xpath="//input[@name='body:x:txtItemLabel:x:x']") 
	private WebElement itemDescription;
	
	@FindBy(xpath="//input[@name='body:x:txtPrice:x:x']") 
	private WebElement itemPrice;
	
	@FindBy(xpath="//input[@name='body:x:txtQuantity:x:x']") 
	private WebElement itemQuantity;
	
	@FindBy(id="ddlbody_x_selUnit_x") 
	private WebElement unitOfMeasure;
	
	@FindBy(id="body_x_txtRefSupplier_x_x") 
	private WebElement partNumber;
	
	@FindBy(id="body_x_selSupplier_x_txtselSupplier_x_x") 
	private WebElement contractSupplier;
	
	@FindBy(id="body_x_ddlContact_ddlContact") 
	private WebElement supplierContact;
	
	@FindBy(id="body_x_selOitemIdInstallUseridLoginNameInstallUserid_5DF3DABA_x_txtselOitemIdInstallUseridLoginNameInstallUserid_5DF3DABA_x_x") 
	private WebElement personToReceiveItem;
	
	@FindBy(id="body_x_selAdrIdDeliv_x_txtselAdrIdDeliv_x_x") 
	private WebElement endUserDeliveryAddress;
	
	@FindBy(id="body_x_txtDeliveryDate_x_x") 
	private WebElement requestedDeliveryDate;
	
	@FindBy(id="body_x_txtDeliveryDate_x_txtDeliveryDate_img_calendar") 
	private WebElement requestedDeliveryDateBtn;
	
	@FindBy(xpath="//input[@value='T']") 
	private WebElement datePickerTodayBtn;
	
	@FindBy(xpath="//input[@value='+1']") 
	private WebElement datePickerOneDayBtn;
	
	@FindBy(xpath="//input[@value='+7']") 
	private WebElement datePickerSevenDayBtn;
	
	@FindBy(xpath="//input[@value='+14']") 
	private WebElement datePicker14DayBtn;
	
	@FindBy(xpath="//input[@value='+1M']") 
	private WebElement datePicker1MonthBtn;
	
	@FindBy(xpath="//input[@value='+3M']") 
	private WebElement datePicker3MonthBtn;
	
	@FindBy(xpath="(//*[@class='icon_base icon_delete'])[2]") 
	private WebElement datePickerCrossMark;
	
	@FindBy(id="ui-datepicker-div") 
	private WebElement dataPicker;
	
	@FindBy(id="body_x_attachment_x_UploadButtonControl_btn2") 
	private WebElement attachment;
	
	@FindBy(id="body_x_txtComment_x_x") 
	private WebElement commentVisibleToSupplier;
	
	@FindBy(id="body_x_txtOitemInternalComment_x_x")
	private WebElement internalCommentNotVisibleToSupplier;
	
	@FindBy(xpath="//input[@name='body:x:selFamily:x:btnselFamily_btn2']") 
	private WebElement categoryButton;
	
	@FindBy(xpath="//i[@id='body_x_grid_x__ctl4__ctl0']") 
	private WebElement labelIcon;
	
	@FindBy(xpath="//input[@name='proxyActionBar:x:_cmdSave_btn2']") 
	private WebElement labelSaveButton;
	
	@FindBy(xpath="(//*[text()='GL Account']/../following-sibling::tr[2]/td[2]/table//tr/td)[2]") 
	private WebElement glAccountButton;
	

	@FindBy(xpath="//input[@name='body:x:txtQuery:x:x']") 
	private WebElement accountSelectionKeyWords;

	
	@FindBy(xpath="//input[@name='body:x:prxFilterBar:x:cmdSearchBtn_btn2']") 
	private WebElement accountSelectionSearch;
	
	@FindBy(xpath="//*[@id=\"body_x_grdAccount_x__ctl2__ctl0\"]") 
	private WebElement accountSelectionCode;
	
	//Item Frame
	@FindBy(id="body_x_grdAccount_x__ctl2__ctl0") 
	private WebElement accountSelectionLabelIcon;
	
	@FindBy(xpath="(//*[text()='GL Account']/../following-sibling::tr[2]/td[3]/table//tr/td)[1]/input") 
	private WebElement costCenter;
	
	@FindBy(xpath="(//*[text()='GL Account']/../following-sibling::tr[2]/td[4]/table//tr/td)[1]/input") 
	private WebElement peopleSoftProjectID;
	
	@FindBy(xpath="//div[@role='menuitem']/div") 
	private WebElement costCentreList;
	
	@FindBy(xpath="//*[@value='Save & close']") 
	private WebElement saveandCloseButton;
	
	//Home-Page
	@FindBy(xpath="//div//span[contains(text(),'Workflow')]") 
	private WebElement workflow;
	
	@FindBy(xpath="//div//span[contains(text(),'Commodity Manager')]") 
	private WebElement commodityManager;
	
	@FindBy(xpath="//input[@value='Submit for Approval']") 
	private WebElement submitForApproval;
	
	@FindBy(xpath="//div[@id='messageBar']//div/button[2]/span") 
	private WebElement saveButtonMark;
	
	@FindBy(id="aLoginMenu") 
	private WebElement loginMenu;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]") 
	private WebElement logOutButton;
	
	//commodityApprovalforSubmittedRequest
	@FindBy(xpath="//a[contains(text(),'My open workflow tasks')]") 
	private WebElement myOpenWorkflowTasks;
	
	
	//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
	@FindBy(xpath = "//table[@id='body_x_filterWflTaskBrowse']/tbody/tr[1]/td[2]/div/div")
			private WebElement leader;
	//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
	

	@FindBy(xpath="(//img[@src='/buyer/fanniemae/prepmaint27/aysu7/image/spacer.gif'])[13]") 
	private WebElement statusTypeEdit;
	
	@FindBy(xpath="//input[@name='proxyActionBar:x:valPUO_v7CATMANVAL_btn2']") 
	private WebElement approveButton;
	
	@FindBy(xpath="//span[@class='fa fa-times']") 
	private WebElement saveButtonMarkC;
	
	@FindBy(xpath="//input[@name='proxyActionBar:x:refPUO_v7CATMANVAL_btn2']") 
	private WebElement rejectButton;
	
	@FindBy(xpath="//input[@name='proxyActionBar:x:forwardPUO_v7CATMANVAL_btn2']") 
	private WebElement forwardButton;
	
	@FindBy(xpath="//div[@class='header_login_name']") 
	private WebElement loginMenuC;
	
	@FindBy(xpath="//td/h1[contains(text(),'Basket : 2000034802 - MackBook (In progress)')]") 
	private WebElement breadCrumbText;
	
	@FindBy(id="ddlbody_x_ddlAction_x") 
	private WebElement status;
	
	@FindBy(id="body_x_prxFilterBar_x_cmdSearchBtn_btn2") 
	private WebElement statusButton;
	
	@FindBy(xpath="//table[@class='PowerGridClass']/tbody/tr/td[14]/a") 
	private List<WebElement> allLables;
	
	//added for scenario2 and further by Samba
	@FindBy(id = "link_ivmenu00_menu_0")
	private WebElement createSupplierSupplierLink;

	@FindBy(id = "link_ivmenu00_menu_0_sub0_sub0")
	private WebElement createSupplierLink;

	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_ddlType_x")
	private WebElement createSupplierSupplierType;
	

	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_selClasCode_x")
	private WebElement createSupplierSupplierClassification;

	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtName_x_x")
	private WebElement createSupplierLegalName;
	
	//Nmfs-elemets--Sankar
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtCorpName_x_txtCorpNameen")
	private WebElement createSupplierDoingBusinessAs;
	
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtWeb_x_x")
	private WebElement createSupplierWebsite;
	
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_selSupplier_x_txtselSupplier_x_x")
	private WebElement createSupplierParentCompany;
	
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtSupRegisContactPhone_x_x")
	private WebElement createSupplierPhoneNumber;
	
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCompNom_x_x")
	private WebElement createSupplierMainSupplierAddressNameAdditional;
	
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtComplt_x_x")
	private WebElement createSupplierMainSupplierAddressAddressline2;
	
	

	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtVoie_x_x")
	private WebElement createSupplierAddressLine1;

	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCity_x_x")
	private WebElement createSupplierCity;

	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlState_x_txtddlState_x_x")
	private WebElement createSupplierState;

	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtZip_x_x")
	private WebElement createSupplierZip;

	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlPays_x")
	private WebElement createSupplierCountry;
	
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x__sup_fm_trax_id_x_x")
	private WebElement createSupplierTRAXId;
	
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_selCritCode_x")
	private WebElement createSupplierSupplierCriticality;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_ddlIntraGroup_x")
	private WebElement createSupplierIntraGroup;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_imp_id_x_x")
	private WebElement createSupplierImportID;
	
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_selCdataCodeConfData_x")
	private WebElement createSupplierHowDidYouHearAboutUs;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtSupConfComment_x_x")
	private WebElement createSupplierComment;
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_selYesnCodeSupResell_x")
	private WebElement createSupplierDoesSupplierHaveAnyAssociationWithAReseller;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_selSupIdParentSupIdMain_DC025EEF_x_txtselSupIdParentSupIdMain_DC025EEF_x_x")
	private WebElement createSupplierSupplier;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_sup_commodity_comment_x_sup_commodity_commenten")
	private WebElement createSupplierSupplierOverview;
	
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x__sup_fm_chkpvp_x0")
	private WebElement createSupplierPreferredVendorProgram;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x__sup_fm_txtpaytermcomments_x_x")
	private WebElement createSupplierPaymentTermComments;
	
	//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
	public WebElement getLeaderName() {
		return leader;
	}
	//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
	
	
	public WebElement getCreateSupplierMainSupplierAddressNameAdditional() {
		return createSupplierMainSupplierAddressNameAdditional;
	}

	public WebElement getCreateSupplierMainSupplierAddressAddressline2() {
		return createSupplierMainSupplierAddressAddressline2;
	}

	public WebElement getCreateSupplierTRAXId() {
		return createSupplierTRAXId;
	}

	public WebElement getCreateSupplierSupplierCriticality() {
		return createSupplierSupplierCriticality;
	}

	public WebElement getCreateSupplierIntraGroup() {
		return createSupplierIntraGroup;
	}

	public WebElement getCreateSupplierImportID() {
		return createSupplierImportID;
	}

	public WebElement getCreateSupplierHowDidYouHearAboutUs() {
		return createSupplierHowDidYouHearAboutUs;
	}

	public WebElement getCreateSupplierComment() {
		return createSupplierComment;
	}

	public WebElement getCreateSupplierDoesSupplierHaveAnyAssociationWithAReseller() {
		return createSupplierDoesSupplierHaveAnyAssociationWithAReseller;
	}

	public WebElement getCreateSupplierSupplier() {
		return createSupplierSupplier;
	}

	public WebElement getCreateSupplierSupplierOverview() {
		return createSupplierSupplierOverview;
	}

	public WebElement getCreateSupplierPreferredVendorProgram() {
		return createSupplierPreferredVendorProgram;
	}

	public WebElement getCreateSupplierPaymentTermComments() {
		return createSupplierPaymentTermComments;
	}

	public WebElement getCreateSupplierFunction() {
		return createSupplierFunction;
	}

	public WebElement getCreateSupplierRealignmentNumber() {
		return createSupplierRealignmentNumber;
	}

	public WebElement getCreateSupplierBankruptSupplier() {
		return createSupplierBankruptSupplier;
	}

	public WebElement getCreateSupplierHighRiskPerFinancialAssessment() {
		return createSupplierHighRiskPerFinancialAssessment;
	}

	public WebElement getCreateSupplierSupplierInvoicesNotSentToSpend() {
		return createSupplierSupplierInvoicesNotSentToSpend;
	}

	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_selFuncCode_x")
	private WebElement createSupplierFunction;
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_selRnumCode_x")
	private WebElement createSupplierRealignmentNumber;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtSupBkr_x0")
	private WebElement createSupplierBankruptSupplier;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtSupHrpfa_x0")
	private WebElement createSupplierHighRiskPerFinancialAssessment;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtSupPaySupplier_x0")
	private WebElement createSupplierSupplierInvoicesNotSentToSpend;

	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	private WebElement createSupplierSaveButton;

	@FindBy(css = "#body_x_tabc_containerTab_partadmin .tab_label_class > div")
	private WebElement createSupplierAdditionalInfoTab;

	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_selQualCode_x")
	private WebElement createSupplierTINType;

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_txtTva_x_x")
	private WebElement createSupplierFederalTaxID;

	
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_txtDuns_x_x")
	private WebElement createSupplierRegisteredInformationDUNS;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_txtYear_x_x")
	private WebElement createSupplierYearOfIncorporation;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_selSupIdFamLevelFamNode_E3366565_x_txtselSupIdFamLevelFamNode_E3366565_x_x")
	private WebElement createSupplierPrimaryCategory;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_txtSupOneTimeVendor_x0")
	private WebElement createSupplierOneTimeOnlySupplier;
	@FindBy(xpath = "//*[text()='Role']/../following-sibling::tr[2]/td[11]//select")
	private WebElement supplierRole;
	@FindBy(xpath = "//*[text()='Role']/../following-sibling::tr[2]/td[11]//select")
	private WebElement supplierRole2;
	
	@FindBy(xpath = "//span[text()='Main Info']")
	private WebElement mainInfoTab;
	
	@FindBy(xpath = "//td[text()='Supplier ID : ']/following-sibling::td/div")
	private WebElement supplierId;
	
	public WebElement getSupplierId() {
		return supplierId;
	}

	public WebElement getMainInfoTab() {
		return mainInfoTab;
	}

	public WebElement getSupplierRole2() {
		return supplierRole2;
	}

	public WebElement getSupplierRole() {
		return supplierRole;
	}

	public WebElement getCreateSupplierRegisteredInformationDUNS() {
		return createSupplierRegisteredInformationDUNS;
	}

	public WebElement getCreateSupplierYearOfIncorporation() {
		return createSupplierYearOfIncorporation;
	}

	public WebElement getCreateSupplierPrimaryCategory() {
		return createSupplierPrimaryCategory;
	}

	public WebElement getCreateSupplierAddressLine2() {
		return createSupplierAddressLine2;
	}

	public WebElement getCreateSupplierPaymentAddressCounty() {
		return createSupplierPaymentAddressCounty;
	}

	public WebElement getCreateSupplierOneTimeOnlySupplier() {
		return createSupplierOneTimeOnlySupplier;
	}

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtCompNom_x_x")
	private WebElement createSupplierNameAdditional;

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtVoie_x_x")
	private WebElement createSupplierAddInfoAddressLine1;
	
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtComplt_x_x")
	private WebElement createSupplierAddressLine2;
	
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x__adr_fm_county_x_x")
	private WebElement createSupplierPaymentAddressCounty;

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtCity_x_x")
	private WebElement createSupplierAddInfoCity;

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_ddlState_x_txtddlState_x_x")
	private WebElement createSupplierAddInfoState;

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtZip_x_x")
	private WebElement createSupplierAddInfoZip;

	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_ddlPays_x")
	private WebElement createSupplierAddInfoCountry;

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrOrd_x_txtCompNom_x_x")
	private WebElement createSupplierAddInfoOrderNameAdditional;

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrOrd_x_txtVoie_x_x")
	private WebElement createSupplierAddInfoOrderAddressLine1;
	
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrOrd_x_txtComplt_x_x")
	private WebElement createSupplierOrderAddressAddressLine2;

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrOrd_x_txtCity_x_x")
	private WebElement createSupplierAddInfoOrderCity;

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrOrd_x_ddlState_x_txtddlState_x_x")
	private WebElement createSupplierAddInfoOrderState;

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrOrd_x_ddlState_x_btnddlState_btn2")
	private WebElement createSupplierAddInfoOrderStateButton;

	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrOrd_x_txtZip_x_x")
	private WebElement createSupplierAddInfoOrderZip;

	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_proxyAdrOrd_x_ddlPays_x")
	private WebElement createSupplierAddInfoOrderCountry;
	
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrOrd_x__adr_fm_county_x_x")
	private WebElement createSupplierOrderAddressCounty;
	
	
	//1099 optional
	
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_txtSupWithholding_x0")
	private WebElement createSupplier1099INFOWithholdingApplicable;
	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_selWtypeCode_x")
	private WebElement createSupplier1099INFOWithholdingType;
	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_selWcateCode_x")
	private WebElement createSupplier1099INFOSupplierCategory;
	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_selDwclasCode_x")
	private WebElement createSupplier1099INFODefaultWithholdingClass;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdr1099_x_txtCompNom_x_x")
	private WebElement createSupplier1099AddressNameAdditional;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdr1099_x_txtVoie_x_x")
	private WebElement createSupplier1099AddressAddress1;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdr1099_x_txtComplt_x_x")
	private WebElement createSupplier1099AddressAddress2;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdr1099_x_txtCity_x_x")
	private WebElement createSupplier1099AddressCity;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdr1099_x_ddlState_x_txtddlState_x_x")
	private WebElement createSupplier1099AddressState;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdr1099_x_ddlState_x_btnddlState_btn2")
	private WebElement createSupplier1099AddressStateButton;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdr1099_x_txtZip_x_x")
	private WebElement createSupplier1099AddressZipCode;
	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_proxyAdr1099_x_ddlPays_x")
	private WebElement createSupplier1099AddressCountry;

	@FindBy(css = "#body_x_tabc_containerTab_parteproc .iv-tab-label")
	private WebElement createSupplierBankInfoBankTab;

	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBdetaCodeBankDetail_x_btnselBdetaCodeBankDetail_btn2")
	private WebElement createSupplierBankInfoBankButton;

	@FindBy(id = "body_x_txtQuery_x_x")
	private WebElement createSupplierBankInfoSearchBox;

	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	private WebElement createSupplierBankInfoSearchBtn;

	@FindBy(id = "body_x_grid_x__ctl2__ctl0")
	private WebElement createSupplierBankInfoClickOnResult;

	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBaccoCodeBankAccountDetails_x_btnselBaccoCodeBankAccountDetails_btn2")
	private WebElement createSupplierBankInfoBankAccountDetails;

	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBpmethCodePaymentMethod_x_btnselBpmethCodePaymentMethod_btn2")
	private WebElement createSupplierBankInfoPaymentMethod;

	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_btnAddNewBI_btn2")
	private WebElement createSupplierBankInfoAddBankInfoButton;

	@FindBy(id = "body_x_txtOrder_x_x")
	private WebElement createSupplierBankInfoBankName;

	@FindBy(id = "body_x_txtAgency_x_x")
	private WebElement createSupplierBankInfoCity;

	@FindBy(id = "body_x_txtBiBankId_x_x")
	private WebElement createSupplierBankInfoABARoutingNumber;

	@FindBy(id = "body_x_txtBiAccountNumber_x_x")
	private WebElement createSupplierBankInfoAccNumber;

	@FindBy(id = "body_x_chkDefault_x0")
	private WebElement createSupplierBankInfoDefaultCheckBox;
	
	@FindBy(id = "body_x_txtBiBranchId_x_x")
	private WebElement createSupplierBankingInformationBranchID;
	@FindBy(id = "body_x_selPhandCode_1_x_btnselPhandCode_1_btn2")
	private WebElement createSupplierBankingInformationPaymentHAndling;
	
	//bank info optional
	
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtSupPaymentConfirmEmail_x_x")
	private WebElement createSupplierBankingInformationSupplierEmailAddressForACHPaymentConf;
	@FindBy(id = "ddlbody_x_tabc_x_eproc_x_prxeproc_x_grdMsgType_x__ctl2_selMsgType_x")
	private WebElement createSupplierBankingInformationPurchaseOrder;
	@FindBy(id = "ddlbody_x_tabc_x_eproc_x_prxeproc_x_grdMsgType_x__ctl3_selMsgType_x")
	private WebElement createSupplierBankingInformationPOFunctionalAcknowledgement;
	@FindBy(id = "ddlbody_x_tabc_x_eproc_x_prxeproc_x_grdMsgType_x__ctl4_selMsgType_x")
	private WebElement createSupplierBankingInformationAdvanceShippingNotice;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtPartnerQualifierTest_x_x")
	private WebElement createSupplierBankingInformationTestPartnerQualifier;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtPartnerQualifierProd_x_x")
	private WebElement createSupplierBankingInformationProdPartnerQualifier;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtPartnerIdTest_x_x")
	private WebElement createSupplierBankingInformationTestPartnerId;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtPartnerTrpIdTest_x_x")
	private WebElement createSupplierBankingInformationTestAS2ReceiverId;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_prxFileCertificateTest_x_UploadButtonControl_btn2")
	private WebElement createSupplierBankingInformationTestAttachmentButton;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtPartnerUrlTest_x_x")
	private WebElement createSupplierBankingInformationTestURL;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_ddEDISuffixTest_x")
	private WebElement createSupplierBankingInformationTestEdiSegmentSuffix;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_ddAS2RequestMDNTest_x")
	private WebElement createSupplierBankingInformationTestAs2RequestMdn;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlPartnerDomainTest_x_x")
	private WebElement createSupplierBankingInformationTestCXMLPartnerDomain;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlPartnerIdentityTest_x_x")
	private WebElement createSupplierBankingInformationTestCDXMLPartnerIdentity;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlPartnerSharedSecretTest_x_x")
	private WebElement createSupplierBankingInformationTestCDXMLPartnerSharedSecret;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlPartnerUrlTest_x_x")
	private WebElement createSupplierBankingInformationTestCDXMLReceiverUrl;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlFromDomainTest_x_x")
	private WebElement createSupplierBankingInformationTestDomainFromCDXML;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlFromIdentityTest_x_x")
	private WebElement createSupplierBankingInformationTestIdentityFromCDXML;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlToDomainTest_x_x")
	private WebElement createSupplierBankingInformationTestCDXMLToDomain;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlToIdentityTest_x_x")
	private WebElement createSupplierBankingInformationTestCDXMLToIdentity;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlSenderDomainTest_x_x")
	private WebElement createSupplierBankingInformationTestCDXMLSenderDomain;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlSenderIdentityTest_x_x")
	private WebElement createSupplierBankingInformationTestCDXMLSenderIdentity;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlSenderSharedSecretTest_x_x")
	private WebElement createSupplierBankingInformationTestCDXMLSenderSharedSecret;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtPartnerIdProd_x_x")
	private WebElement createSupplierBankingInformationProdPartnerId;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtPartnerTrpIdProd_x_x")
	private WebElement createSupplierBankingInformationProdAS2ReceiverId;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_prxFileCertificateProd_x_UploadButtonControl_btn2")
	private WebElement createSupplierBankingInformationProdAttachmentButton;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtPartnerUrlProd_x_x")
	private WebElement createSupplierBankingInformationProdURL;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_ddEDISuffixProd_x")
	private WebElement createSupplierBankingInformationProdEdiSegmentSuffix;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_ddAS2RequestMDNProd_x")
	private WebElement createSupplierBankingInformationProdAs2RequestMdn;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlPartnerdomainProd_x_x")
	private WebElement createSupplierBankingInformationProdCXMLPartnerDomain;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlPartnerIdentityProd_x_x")
	private WebElement createSupplierBankingInformationProdCDXMLPartnerIdentity;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlPartnerSharedSecretProd_x_x")
	private WebElement createSupplierBankingInformationProdCDXMLPartnerSharedSecret;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlPartnerUrlProd_x_x")
	private WebElement createSupplierBankingInformationProdCDXMLReceiverUrl;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlFromDomainProd_x_x")
	private WebElement createSupplierBankingInformationProdDomainFromCDXML;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlFromIdentityProd_x_x")
	private WebElement createSupplierBankingInformationProdIdentityFromCDXML;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlToDomainProd_x_x")
	private WebElement createSupplierBankingInformationProdCDXMLToDomain;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlToIdentityProd_x_x")
	private WebElement createSupplierBankingInformationProdCDXMLToIdentity;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlSenderDomainProd_x_x")
	private WebElement createSupplierBankingInformationProdCDXMLSenderDomain;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlSenderIdentityProd_x_x")
	private WebElement createSupplierBankingInformationProdCDXMLSenderIdentity;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtCxmlSenderSharedSecretProd_x_x")
	private WebElement createSupplierBankingInformationProdCDXMLSenderSharedSecret;


	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	private WebElement createSupplierBankInfoCloseButton;
	
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	private WebElement createSupplierExitButton;
	//Contact Info Optional

	@FindBy(css = "#body_x_tabc_containerTab_partcontact .tab_label_class > div")
	private WebElement createSupplierContactInfoTab;

	@FindBy(id = "body_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact_x_btnselContact_btn2")
	private WebElement createSupplierContactInfoAddAContact;
	
	@FindBy(id = "ddlbody_x_pxCtc_x_ContactControl_x_selStatusCode_x")
	private WebElement createSupplierSupplierContactManagementStatus;

	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactLastname_x_x")
	private WebElement createSupplierContactInfoLastName;

	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactFirstname_x_x")
	private WebElement createSupplierContactInfoFirstName;

	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactEmail_x_x")
	private WebElement createSupplierContactInfoEmail;
	
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactCell_x_x")
	private WebElement createSupplierSupplierContactManagementCellNumber;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactFax_x_x")
	private WebElement createSupplierSupplierContactManagementFax;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactFunction_x_txtContactFunctionen")
	private WebElement createSupplierSupplierContactManagementFunction;
	@FindBy(id = "ddlbody_x_pxCtc_x_ContactControl_x_ddlDefaultLang_x")
	private WebElement createSupplierSupplierContactManagementDefaultLanguage;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_filePhotoContact_x_UploadButtonControl_btn2")
	private WebElement createSupplierSupplierContactManagementUploadPhotoButton;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactMatricule_x_x")
	private WebElement createSupplierSupplierContactManagementFMEmployeeID;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_ddlPtitleId_PtitleId")
	private WebElement createSupplierSupplierContactManagementPersonTitle;

	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactPhone_x_x")
	private WebElement createSupplierContactInfoPhono;
	
	@FindBy(css = "#body_x_tabc_containerTab_partworkflow .tab_label_class > div")
	private WebElement createSupplierApprovalWorkflowTab;

	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	private WebElement createSupplierContactInfoSaveAndClose;

	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersINI_btn2")
	private WebElement createSupplierApprovalWorkflowSubmitForDiligence;

	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersots_btn2")
	private WebElement createSupplierApprovalWorkflowSubmitToWorkflow;

	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersVAL2_btn2")
	private WebElement createSupplierApprovalWorkflowApprovalFinal;

	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersAPP2_btn2")
	private WebElement createSupplierApprovalWorkflowApproveChanges;

	@FindBy(id = "link_ivmenu00_menu_0_sub0")
	private WebElement createSupplierBrowseSuppliers;

	@FindBy(xpath = "//*[@id='ddlbody_x_ddlStatus_x__label']/../following-sibling::td/table//tbody/tr[2]//tbody/tr/td[1]")
	private WebElement createSupplierStatusCroseMark;

	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	private WebElement searchSupplierSearchButton;

	@FindBy(id = "ddlbody_x_ddlType_x")
	private WebElement searchSupplierSupplierType;

	@FindBy(id = "body_x_txtQuery_x_x")
	private WebElement searchSupplierSearchKeyword;

	@FindBy(xpath = "//table[@id='body_x_grid_x']//tr/td[8]")
	private List<WebElement> searchSupplierResultGridCompanyName;

	@FindBy(xpath = "//table[@id='body_x_grid_x']//tr/td[6]")
	private List<WebElement> searchSupplierResultGridSupplierId;
		
	@FindBy(xpath = "(//button[@title='Close'])[1]")
	private WebElement searchSupplierResultGridFrameClose;

	// Real Estate Broker Supplier Creation
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x__sup_fm_equator_id_x_x")
	private WebElement createSupplierRealEstateBrokerEquatorIdEVID;

	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtSupUseWeb_x0")
	private WebElement createSupplierRealEstateBrokerUsingWeb;

	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtSupPayTrx_x0")
	private WebElement createSupplierRealEstateBrokerIsPayable;

	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersm_trax_chk_btn2")
	private WebElement createSupplierRealEstateBrokerContinueOnBoarding;

	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_update_btn2")
	private WebElement createSupplierRealEstateBrokerProfileDocumentUpdate;

	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_ops_review_btn2")
	private WebElement createSupplierRealEstateBrokerApprove;

	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_due_diligence_btn2")
	private WebElement createSupplierRealEstateBrokerNoFindings;
	
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_op_trax_upd_btn2")
	private WebElement createSupplierRealEstateBrokerTraxUpdated;
	
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_upd_proc_one_btn2")
	private WebElement createSupplierRealEstateBrokerProcureOneUpdated;
	
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_upd_ach_btn2")
	private WebElement createSupplierRealEstateBrokerACHInformationUpdated;
	
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersVAL1_btn2")
	private WebElement createSupplierRealEstateBrokerApproveFinal;
	
	@FindBy(id = "proxyActionBar_x_txtWflRefuseMessage_x_x")
	private WebElement createSupplierRealEstateBrokerReason;
	
	@FindBy(id = "proxyActionBar_x_btnWflRefuseMessage_btn2")
	private WebElement createSupplierRealEstateBrokerReasonConfirm;
		
	public WebElement getCreateSupplierRealEstateBrokerNoFindings() {
		return createSupplierRealEstateBrokerNoFindings;
	}

	public WebElement getCreateSupplierRealEstateBrokerTraxUpdated() {
		return createSupplierRealEstateBrokerTraxUpdated;
	}

	public WebElement getCreateSupplierRealEstateBrokerProcureOneUpdated() {
		return createSupplierRealEstateBrokerProcureOneUpdated;
	}

	public WebElement getCreateSupplierRealEstateBrokerACHInformationUpdated() {
		return createSupplierRealEstateBrokerACHInformationUpdated;
	}

	public WebElement getCreateSupplierRealEstateBrokerApproveFinal() {
		return createSupplierRealEstateBrokerApproveFinal;
	}

	public WebElement getCreateSupplierRealEstateBrokerReason() {
		return createSupplierRealEstateBrokerReason;
	}

	public WebElement getCreateSupplierRealEstateBrokerReasonConfirm() {
		return createSupplierRealEstateBrokerReasonConfirm;
	}

	// Create MasterServicesAgreement
	@FindBy(id = "link_ivmenu00_menu_2")
	private WebElement contracts;

	@FindBy(id = "link_ivmenu00_menu_2_sub0_sub0")
	private WebElement createcontract;

	@FindBy(xpath = "//span[@class='fa fa-times']")
	private WebElement cspviolation;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:txtLibContract:x:txtLibContracten']")
	private WebElement contractTitle;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selTypeContract_x']")
	private WebElement contractType;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:selProcess:x:txtselProcess:x:x']")
	private WebElement sourcingProject;

	@FindBy(id = "body_x_tabc_x_info_x_prxinfo_x_selProcess_x_btnselProcess_btn2")
	private WebElement sourcingProjectButton;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:selSupplier:x:txtselSupplier:x:x']")
	private WebElement supplier;

	@FindBy(id = "body_x_tabc_x_info_x_prxinfo_x_selSupplier_x_btnselSupplier_btn2")
	private WebElement supplierButton;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:orga_level:x:txtorga_level:x:x']")
	private WebElement costcenter;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:selFundingId:x:txtselFundingId:x:x']")
	private WebElement pepolesoftproject;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:prxDoc:x:UploadButtonControl_btn2']")
	private WebElement fileattach;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selTypeContract_x']")
	private WebElement createcontractType;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:selFamily:x:txtselFamily:x:x']")
	private WebElement primaryCategory;

	@FindBy(xpath = "//textarea[@name='body:x:tabc:x:info:x:prxinfo:x:txtCtrFmTxtproductservice:x:x']")
	private WebElement productsServicesDescription;

	@FindBy(xpath = "//textarea[@name='body:x:tabc:x:info:x:prxinfo:x:_ctr_fm_txtoptionalcomments:x:x']")
	private WebElement comments;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selFbdrindiCodeFmDdlriskindicator_2_x']")
	private WebElement contractStatusIndicator;

	@FindBy(xpath = "//textarea[@name='body:x:tabc:x:info:x:prxinfo:x:txtCtrStatUpdNextSteps_1:x:x']")
	private WebElement statusUpdateNextSteps;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selEphasCode_x']")
	private WebElement engagementPhase;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selSmapprCode_x']")
	private WebElement supplyMarketApproach;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selCvariCode_x']")
	private WebElement contractVariance;

	@FindBy(xpath = "//textarea[@name='body:x:tabc:x:info:x:prxinfo:x:txtCtrFmVarianceComments:x:x']")
	private WebElement contractVarianceComments;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x__ctr_fm_aor_edam_x']")
	private WebElement thirdPartyData;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrSme_x']")
	private WebElement transactionLegalSME;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrFsoneCode_x']")
	private WebElement chargedtheloan;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x__ctr_fm_aor_reo_x']")
	private WebElement legal;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrFromPr_x']")
	private WebElement createdfromPR;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:selBasketIdSourcePr:x:txtselBasketIdSourcePr:x:x']")
	private WebElement sourcepr;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrFg_x']")
	private WebElement budgetBUApprovalProvidedinFieldglass;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:txtCtrCodeCrr:x:x']")
	private WebElement crr;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:txtCtrCodeSow:x:x']")
	private WebElement esow;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selBdropCodeCtrBidpub_x']")
	private WebElement wasthiscontractingopportunitypublished;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:selBpmIdPublicRfx:x:txtselBpmIdPublicRfx:x:x']")
	private WebElement publicRFxLinkedProject;

	@FindBy(xpath = "//textarea[@name='body:x:tabc:x:info:x:prxinfo:x:txtCtrBidpubComment:x:x']")
	private WebElement contractingopportunitycomments;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selYesnCodeHeraYesno_x']")
	private WebElement wasadiversesupplierconsideredduringthesourcingprocess;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selHdropCodeConDetails_x']")
	private WebElement considerationdetails;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selBdropCodeCtrBidpub_x']")
	private WebElement nonconsiderationdetails;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selTmastCode_x']")
	private WebElement tpGroup;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selOprovCode_x']")
	private WebElement offshoreProvision;

	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selRirdecCodeRrInitRskDec_x']")
	private WebElement initialRiskReviewDecision;

	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:selBpmIdRiskRev:x:txtselBpmIdRiskRev:x:x']")
	private WebElement riskReviewProject;

	@FindBy(xpath = "//*[@class='icon_base icon_profil']")
	private WebElement superLoginIcon;
	
	@FindBy(name = "body:x:pxCtc:x:txtLoginName:x:x")
	private WebElement superLoginlogin;
	
	@FindBy(name = "body:x:pxCtc:x:txtLoginPass:x:x")
	private WebElement superLoginpassword;
	
	@FindBy(xpath = "//img[@class='icon_base icon_invite']")
	private WebElement regenaratePasswordButton;
	
	@FindBy(name = "proxyActionBar:x:resend_btn2")
	private WebElement regenaratepassword;
	
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	private WebElement regenaratePasswordClose;
	
	public WebElement getRegenaratePasswordClose() {
		return regenaratePasswordClose;
	}

	public WebElement getRegenaratepassword() {
		return regenaratepassword;
	}

	public WebElement getRegenaratePasswordButton() {
		return regenaratePasswordButton;
	}

	public WebElement getCreateSupplierRealEstateBrokerEquatorIdEVID() {
		return createSupplierRealEstateBrokerEquatorIdEVID;
	}

	public void setCreateSupplierRealEstateBrokerEquatorIdEVID(
			WebElement createSupplierRealEstateBrokerEquatorIdEVID) {
		this.createSupplierRealEstateBrokerEquatorIdEVID = createSupplierRealEstateBrokerEquatorIdEVID;
	}

	public WebElement getCreateSupplierRealEstateBrokerUsingWeb() {
		return createSupplierRealEstateBrokerUsingWeb;
	}

	public void setCreateSupplierRealEstateBrokerUsingWeb(
			WebElement createSupplierRealEstateBrokerUsingWeb) {
		this.createSupplierRealEstateBrokerUsingWeb = createSupplierRealEstateBrokerUsingWeb;
	}

	public WebElement getCreateSupplierRealEstateBrokerIsPayable() {
		return createSupplierRealEstateBrokerIsPayable;
	}

	public void setCreateSupplierRealEstateBrokerIsPayable(
			WebElement createSupplierRealEstateBrokerIsPayable) {
		this.createSupplierRealEstateBrokerIsPayable = createSupplierRealEstateBrokerIsPayable;
	}

	public WebElement getCreateSupplierRealEstateBrokerContinueOnBoarding() {
		return createSupplierRealEstateBrokerContinueOnBoarding;
	}

	public void setCreateSupplierRealEstateBrokerContinueOnBoarding(
			WebElement createSupplierRealEstateBrokerContinueOnBoarding) {
		this.createSupplierRealEstateBrokerContinueOnBoarding = createSupplierRealEstateBrokerContinueOnBoarding;
	}

	public WebElement getCreateSupplierRealEstateBrokerProfileDocumentUpdate() {
		return createSupplierRealEstateBrokerProfileDocumentUpdate;
	}

	public void setCreateSupplierRealEstateBrokerProfileDocumentUpdate(
			WebElement createSupplierRealEstateBrokerProfileDocumentUpdate) {
		this.createSupplierRealEstateBrokerProfileDocumentUpdate = createSupplierRealEstateBrokerProfileDocumentUpdate;
	}

	public WebElement getCreateSupplierRealEstateBrokerApprove() {
		return createSupplierRealEstateBrokerApprove;
	}

	public void setCreateSupplierRealEstateBrokerApprove(
			WebElement createSupplierRealEstateBrokerApprove) {
		this.createSupplierRealEstateBrokerApprove = createSupplierRealEstateBrokerApprove;
	}

	public WebElement getUsernameProcureOne() {
		return usernameProcureOne;
	}

	public void setUsernameProcureOne(WebElement usernameProcureOne) {
		this.usernameProcureOne = usernameProcureOne;
	}

	public WebElement getPasswordProcureOne() {
		return passwordProcureOne;
	}

	public void setPasswordProcureOne(WebElement passwordProcureOne) {
		this.passwordProcureOne = passwordProcureOne;
	}

	public WebElement getLoginProcureOne() {
		return loginProcureOne;
	}

	public void setLoginProcureOne(WebElement loginProcureOne) {
		this.loginProcureOne = loginProcureOne;
	}

	public WebElement getProcurement() {
		return procurement;
	}

	public void setProcurement(WebElement procurement) {
		this.procurement = procurement;
	}

	public WebElement getCreateRequisition() {
		return createRequisition;
	}

	public void setCreateRequisition(WebElement createRequisition) {
		this.createRequisition = createRequisition;
	}

	public WebElement getRequisitionName() {
		return requisitionName;
	}

	public void setRequisitionName(WebElement requisitionName) {
		this.requisitionName = requisitionName;
	}

	public WebElement getHeaderInformationRequester() {
		return headerInformationRequester;
	}

	public void setHeaderInformationRequester(WebElement headerInformationRequester) {
		this.headerInformationRequester = headerInformationRequester;
	}

	public WebElement getHeaderInformationCostCentre() {
		return headerInformationCostCentre;
	}

	public void setHeaderInformationCostCentre(WebElement headerInformationCostCentre) {
		this.headerInformationCostCentre = headerInformationCostCentre;
	}

	public WebElement getHeaderInformationPRWatchers() {
		return headerInformationPRWatchers;
	}

	public void setHeaderInformationPRWatchers(WebElement headerInformationPRWatchers) {
		this.headerInformationPRWatchers = headerInformationPRWatchers;
	}

	public WebElement getJustification() {
		return justification;
	}

	public void setJustification(WebElement justification) {
		this.justification = justification;
	}

	public WebElement getClickDragToAddFiles() {
		return clickDragToAddFiles;
	}

	public void setClickDragToAddFiles(WebElement clickDragToAddFiles) {
		this.clickDragToAddFiles = clickDragToAddFiles;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}

	public WebElement getCloseMarkPostSave() {
		return closeMarkPostSave;
	}

	public void setCloseMarkPostSave(WebElement closeMarkPostSave) {
		this.closeMarkPostSave = closeMarkPostSave;
	}

	public WebElement getAddItem() {
		return addItem;
	}

	public void setAddItem(WebElement addItem) {
		this.addItem = addItem;
	}

	public WebElement getBasketNo() {
		return basketNo;
	}

	public void setBasketNo(WebElement basketNo) {
		this.basketNo = basketNo;
	}

	public WebElement getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(WebElement itemDescription) {
		this.itemDescription = itemDescription;
	}

	public WebElement getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(WebElement itemPrice) {
		this.itemPrice = itemPrice;
	}

	public WebElement getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(WebElement itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public WebElement getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(WebElement unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public WebElement getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(WebElement partNumber) {
		this.partNumber = partNumber;
	}

	public WebElement getContractSupplier() {
		return contractSupplier;
	}

	public void setContractSupplier(WebElement contractSupplier) {
		this.contractSupplier = contractSupplier;
	}

	public WebElement getSupplierContact() {
		return supplierContact;
	}

	public void setSupplierContact(WebElement supplierContact) {
		this.supplierContact = supplierContact;
	}

	public WebElement getPersonToReceiveItem() {
		return personToReceiveItem;
	}

	public void setPersonToReceiveItem(WebElement personToReceiveItem) {
		this.personToReceiveItem = personToReceiveItem;
	}

	public WebElement getEndUserDeliveryAddress() {
		return endUserDeliveryAddress;
	}

	public void setEndUserDeliveryAddress(WebElement endUserDeliveryAddress) {
		this.endUserDeliveryAddress = endUserDeliveryAddress;
	}

	public WebElement getRequestedDeliveryDate() {
		return requestedDeliveryDate;
	}

	public void setRequestedDeliveryDate(WebElement requestedDeliveryDate) {
		this.requestedDeliveryDate = requestedDeliveryDate;
	}

	public WebElement getRequestedDeliveryDateBtn() {
		return requestedDeliveryDateBtn;
	}

	public void setRequestedDeliveryDateBtn(WebElement requestedDeliveryDateBtn) {
		this.requestedDeliveryDateBtn = requestedDeliveryDateBtn;
	}

	public WebElement getDatePickerTodayBtn() {
		return datePickerTodayBtn;
	}

	public void setDatePickerTodayBtn(WebElement datePickerTodayBtn) {
		this.datePickerTodayBtn = datePickerTodayBtn;
	}

	public WebElement getDatePickerOneDayBtn() {
		return datePickerOneDayBtn;
	}

	public void setDatePickerOneDayBtn(WebElement datePickerOneDayBtn) {
		this.datePickerOneDayBtn = datePickerOneDayBtn;
	}

	public WebElement getDatePickerSevenDayBtn() {
		return datePickerSevenDayBtn;
	}

	public void setDatePickerSevenDayBtn(WebElement datePickerSevenDayBtn) {
		this.datePickerSevenDayBtn = datePickerSevenDayBtn;
	}

	public WebElement getDatePicker14DayBtn() {
		return datePicker14DayBtn;
	}

	public void setDatePicker14DayBtn(WebElement datePicker14DayBtn) {
		this.datePicker14DayBtn = datePicker14DayBtn;
	}

	public WebElement getDatePicker1MonthBtn() {
		return datePicker1MonthBtn;
	}

	public void setDatePicker1MonthBtn(WebElement datePicker1MonthBtn) {
		this.datePicker1MonthBtn = datePicker1MonthBtn;
	}

	public WebElement getDatePicker3MonthBtn() {
		return datePicker3MonthBtn;
	}

	public void setDatePicker3MonthBtn(WebElement datePicker3MonthBtn) {
		this.datePicker3MonthBtn = datePicker3MonthBtn;
	}

	public WebElement getDatePickerCrossMark() {
		return datePickerCrossMark;
	}

	public void setDatePickerCrossMark(WebElement datePickerCrossMark) {
		this.datePickerCrossMark = datePickerCrossMark;
	}

	public WebElement getDataPicker() {
		return dataPicker;
	}

	public void setDataPicker(WebElement dataPicker) {
		this.dataPicker = dataPicker;
	}

	public WebElement getAttachment() {
		return attachment;
	}

	public void setAttachment(WebElement attachment) {
		this.attachment = attachment;
	}

	public WebElement getCommentVisibleToSupplier() {
		return commentVisibleToSupplier;
	}

	public void setCommentVisibleToSupplier(WebElement commentVisibleToSupplier) {
		this.commentVisibleToSupplier = commentVisibleToSupplier;
	}

	public WebElement getInternalCommentNotVisibleToSupplier() {
		return internalCommentNotVisibleToSupplier;
	}

	public void setInternalCommentNotVisibleToSupplier(WebElement internalCommentNotVisibleToSupplier) {
		this.internalCommentNotVisibleToSupplier = internalCommentNotVisibleToSupplier;
	}

	public WebElement getCategoryButton() {
		return categoryButton;
	}

	public void setCategoryButton(WebElement categoryButton) {
		this.categoryButton = categoryButton;
	}

	public WebElement getLabelIcon() {
		return labelIcon;
	}

	public void setLabelIcon(WebElement labelIcon) {
		this.labelIcon = labelIcon;
	}

	public WebElement getLabelSaveButton() {
		return labelSaveButton;
	}

	public void setLabelSaveButton(WebElement labelSaveButton) {
		this.labelSaveButton = labelSaveButton;
	}

	public WebElement getGlAccountButton() {
		return glAccountButton;
	}

	public void setGlAccountButton(WebElement glAccountButton) {
		this.glAccountButton = glAccountButton;
	}

	public WebElement getAccountSelectionKeyWords() {
		return accountSelectionKeyWords;
	}

	public void setAccountSelectionKeyWords(WebElement accountSelectionKeyWords) {
		this.accountSelectionKeyWords = accountSelectionKeyWords;
	}

	public WebElement getAccountSelectionSearch() {
		return accountSelectionSearch;
	}

	public void setAccountSelectionSearch(WebElement accountSelectionSearch) {
		this.accountSelectionSearch = accountSelectionSearch;
	}

	public WebElement getAccountSelectionCode() {
		return accountSelectionCode;
	}

	public void setAccountSelectionCode(WebElement accountSelectionCode) {
		this.accountSelectionCode = accountSelectionCode;
	}

	public WebElement getAccountSelectionLabelIcon() {
		return accountSelectionLabelIcon;
	}

	public void setAccountSelectionLabelIcon(WebElement accountSelectionLabelIcon) {
		this.accountSelectionLabelIcon = accountSelectionLabelIcon;
	}

	public WebElement getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(WebElement costCenter) {
		this.costCenter = costCenter;
	}

	public WebElement getPeopleSoftProjectID() {
		return peopleSoftProjectID;
	}

	public void setPeopleSoftProjectID(WebElement peopleSoftProjectID) {
		this.peopleSoftProjectID = peopleSoftProjectID;
	}

	public WebElement getCostCentreList() {
		return costCentreList;
	}

	public void setCostCentreList(WebElement costCentreList) {
		this.costCentreList = costCentreList;
	}

	public WebElement getSaveandCloseButton() {
		return saveandCloseButton;
	}

	public void setSaveandCloseButton(WebElement saveandCloseButton) {
		this.saveandCloseButton = saveandCloseButton;
	}

	public WebElement getWorkflow() {
		return workflow;
	}

	public void setWorkflow(WebElement workflow) {
		this.workflow = workflow;
	}

	public WebElement getCommodityManager() {
		return commodityManager;
	}

	public void setCommodityManager(WebElement commodityManager) {
		this.commodityManager = commodityManager;
	}

	public WebElement getSubmitForApproval() {
		return submitForApproval;
	}

	public void setSubmitForApproval(WebElement submitForApproval) {
		this.submitForApproval = submitForApproval;
	}

	public WebElement getSaveButtonMark() {
		return saveButtonMark;
	}

	public void setSaveButtonMark(WebElement saveButtonMark) {
		this.saveButtonMark = saveButtonMark;
	}

	public WebElement getLoginMenu() {
		return loginMenu;
	}

	public void setLoginMenu(WebElement loginMenu) {
		this.loginMenu = loginMenu;
	}

	public WebElement getLogOutButton() {
		return logOutButton;
	}

	public void setLogOutButton(WebElement logOutButton) {
		this.logOutButton = logOutButton;
	}

	public WebElement getMyOpenWorkflowTasks() {
		return myOpenWorkflowTasks;
	}

	public void setMyOpenWorkflowTasks(WebElement myOpenWorkflowTasks) {
		this.myOpenWorkflowTasks = myOpenWorkflowTasks;
	}

	public WebElement getStatusTypeEdit() {
		return statusTypeEdit;
	}

	public void setStatusTypeEdit(WebElement statusTypeEdit) {
		this.statusTypeEdit = statusTypeEdit;
	}

	public WebElement getApproveButton() {
		return approveButton;
	}

	public void setApproveButton(WebElement approveButton) {
		this.approveButton = approveButton;
	}

	public WebElement getSaveButtonMarkC() {
		return saveButtonMarkC;
	}

	public void setSaveButtonMarkC(WebElement saveButtonMarkC) {
		this.saveButtonMarkC = saveButtonMarkC;
	}

	public WebElement getRejectButton() {
		return rejectButton;
	}

	public void setRejectButton(WebElement rejectButton) {
		this.rejectButton = rejectButton;
	}

	public WebElement getForwardButton() {
		return forwardButton;
	}

	public void setForwardButton(WebElement forwardButton) {
		this.forwardButton = forwardButton;
	}

	public WebElement getLoginMenuC() {
		return loginMenuC;
	}

	public void setLoginMenuC(WebElement loginMenuC) {
		this.loginMenuC = loginMenuC;
	}

	public WebElement getBreadCrumbText() {
		return breadCrumbText;
	}

	public void setBreadCrumbText(WebElement breadCrumbText) {
		this.breadCrumbText = breadCrumbText;
	}

	public WebElement getStatus() {
		return status;
	}

	public void setStatus(WebElement status) {
		this.status = status;
	}

	public WebElement getStatusButton() {
		return statusButton;
	}

	public void setStatusButton(WebElement statusButton) {
		this.statusButton = statusButton;
	}

	public List<WebElement> getAllLables() {
		return allLables;
	}

	public void setAllLables(List<WebElement> allLables) {
		this.allLables = allLables;
	}

	public WebElement getCreateSupplierSupplierLink() {
		return createSupplierSupplierLink;
	}

	public void setCreateSupplierSupplierLink(WebElement createSupplierSupplierLink) {
		this.createSupplierSupplierLink = createSupplierSupplierLink;
	}

	public WebElement getCreateSupplierLink() {
		return createSupplierLink;
	}

	public void setCreateSupplierLink(WebElement createSupplierLink) {
		this.createSupplierLink = createSupplierLink;
	}

	public WebElement getCreateSupplierSupplierType() {
		return createSupplierSupplierType;
	}

	public void setCreateSupplierSupplierType(WebElement createSupplierSupplierType) {
		this.createSupplierSupplierType = createSupplierSupplierType;
	}

	public WebElement getCreateSupplierSupplierClassification() {
		return createSupplierSupplierClassification;
	}

	public void setCreateSupplierSupplierClassification(
			WebElement createSupplierSupplierClassification) {
		this.createSupplierSupplierClassification = createSupplierSupplierClassification;
	}

	public WebElement getCreateSupplierLegalName() {
		return createSupplierLegalName;
	}

	public void setCreateSupplierLegalName(WebElement createSupplierLegalName) {
		this.createSupplierLegalName = createSupplierLegalName;
	}

	public WebElement getCreateSupplierAddressLine1() {
		return createSupplierAddressLine1;
	}

	public void setCreateSupplierAddressLine1(WebElement createSupplierAddressLine1) {
		this.createSupplierAddressLine1 = createSupplierAddressLine1;
	}

	public WebElement getCreateSupplierCity() {
		return createSupplierCity;
	}

	public void setCreateSupplierCity(WebElement createSupplierCity) {
		this.createSupplierCity = createSupplierCity;
	}

	public WebElement getCreateSupplierState() {
		return createSupplierState;
	}

	public void setCreateSupplierState(WebElement createSupplierState) {
		this.createSupplierState = createSupplierState;
	}

	public WebElement getCreateSupplierZip() {
		return createSupplierZip;
	}

	public void setCreateSupplierZip(WebElement createSupplierZip) {
		this.createSupplierZip = createSupplierZip;
	}

	public WebElement getCreateSupplierCountry() {
		return createSupplierCountry;
	}

	public void setCreateSupplierCountry(WebElement createSupplierCountry) {
		this.createSupplierCountry = createSupplierCountry;
	}

	public WebElement getCreateSupplierSaveButton() {
		return createSupplierSaveButton;
	}

	public void setCreateSupplierSaveButton(WebElement createSupplierSaveButton) {
		this.createSupplierSaveButton = createSupplierSaveButton;
	}

	public WebElement getCreateSupplierAdditionalInfoTab() {
		return createSupplierAdditionalInfoTab;
	}

	public void setCreateSupplierAdditionalInfoTab(
			WebElement createSupplierAdditionalInfoTab) {
		this.createSupplierAdditionalInfoTab = createSupplierAdditionalInfoTab;
	}

	public WebElement getCreateSupplierTINType() {
		return createSupplierTINType;
	}

	public void setCreateSupplierTINType(WebElement createSupplierTINType) {
		this.createSupplierTINType = createSupplierTINType;
	}

	public WebElement getCreateSupplierFederalTaxID() {
		return createSupplierFederalTaxID;
	}

	public void setCreateSupplierFederalTaxID(WebElement createSupplierFederalTaxID) {
		this.createSupplierFederalTaxID = createSupplierFederalTaxID;
	}

	public WebElement getCreateSupplierNameAdditional() {
		return createSupplierNameAdditional;
	}

	public void setCreateSupplierNameAdditional(
			WebElement createSupplierNameAdditional) {
		this.createSupplierNameAdditional = createSupplierNameAdditional;
	}

	public WebElement getCreateSupplierAddInfoAddressLine1() {
		return createSupplierAddInfoAddressLine1;
	}

	public void setCreateSupplierAddInfoAddressLine1(
			WebElement createSupplierAddInfoAddressLine1) {
		this.createSupplierAddInfoAddressLine1 = createSupplierAddInfoAddressLine1;
	}

	public WebElement getCreateSupplierAddInfoCity() {
		return createSupplierAddInfoCity;
	}

	public void setCreateSupplierAddInfoCity(WebElement createSupplierAddInfoCity) {
		this.createSupplierAddInfoCity = createSupplierAddInfoCity;
	}

	public WebElement getCreateSupplierAddInfoState() {
		return createSupplierAddInfoState;
	}

	public void setCreateSupplierAddInfoState(WebElement createSupplierAddInfoState) {
		this.createSupplierAddInfoState = createSupplierAddInfoState;
	}

	public WebElement getCreateSupplierAddInfoZip() {
		return createSupplierAddInfoZip;
	}

	public void setCreateSupplierAddInfoZip(WebElement createSupplierAddInfoZip) {
		this.createSupplierAddInfoZip = createSupplierAddInfoZip;
	}

	public WebElement getCreateSupplierAddInfoCountry() {
		return createSupplierAddInfoCountry;
	}

	public void setCreateSupplierAddInfoCountry(
			WebElement createSupplierAddInfoCountry) {
		this.createSupplierAddInfoCountry = createSupplierAddInfoCountry;
	}

	public WebElement getCreateSupplierAddInfoOrderNameAdditional() {
		return createSupplierAddInfoOrderNameAdditional;
	}

	public void setCreateSupplierAddInfoOrderNameAdditional(
			WebElement createSupplierAddInfoOrderNameAdditional) {
		this.createSupplierAddInfoOrderNameAdditional = createSupplierAddInfoOrderNameAdditional;
	}

	public WebElement getCreateSupplierAddInfoOrderAddressLine1() {
		return createSupplierAddInfoOrderAddressLine1;
	}

	public void setCreateSupplierAddInfoOrderAddressLine1(
			WebElement createSupplierAddInfoOrderAddressLine1) {
		this.createSupplierAddInfoOrderAddressLine1 = createSupplierAddInfoOrderAddressLine1;
	}

	public WebElement getCreateSupplierAddInfoOrderCity() {
		return createSupplierAddInfoOrderCity;
	}

	public void setCreateSupplierAddInfoOrderCity(
			WebElement createSupplierAddInfoOrderCity) {
		this.createSupplierAddInfoOrderCity = createSupplierAddInfoOrderCity;
	}

	public WebElement getCreateSupplierAddInfoOrderState() {
		return createSupplierAddInfoOrderState;
	}

	public void setCreateSupplierAddInfoOrderState(
			WebElement createSupplierAddInfoOrderState) {
		this.createSupplierAddInfoOrderState = createSupplierAddInfoOrderState;
	}

	public WebElement getCreateSupplierAddInfoOrderStateButton() {
		return createSupplierAddInfoOrderStateButton;
	}

	public void setCreateSupplierAddInfoOrderStateButton(
			WebElement createSupplierAddInfoOrderStateButton) {
		this.createSupplierAddInfoOrderStateButton = createSupplierAddInfoOrderStateButton;
	}

	public WebElement getCreateSupplierAddInfoOrderZip() {
		return createSupplierAddInfoOrderZip;
	}

	public void setCreateSupplierAddInfoOrderZip(
			WebElement createSupplierAddInfoOrderZip) {
		this.createSupplierAddInfoOrderZip = createSupplierAddInfoOrderZip;
	}

	public WebElement getCreateSupplierAddInfoOrderCountry() {
		return createSupplierAddInfoOrderCountry;
	}

	public void setCreateSupplierAddInfoOrderCountry(
			WebElement createSupplierAddInfoOrderCountry) {
		this.createSupplierAddInfoOrderCountry = createSupplierAddInfoOrderCountry;
	}

	public WebElement getCreateSupplierBankInfoBankTab() {
		return createSupplierBankInfoBankTab;
	}

	public void setCreateSupplierBankInfoBankTab(
			WebElement createSupplierBankInfoBankTab) {
		this.createSupplierBankInfoBankTab = createSupplierBankInfoBankTab;
	}

	public WebElement getCreateSupplierBankInfoBankButton() {
		return createSupplierBankInfoBankButton;
	}

	public void setCreateSupplierBankInfoBankButton(
			WebElement createSupplierBankInfoBankButton) {
		this.createSupplierBankInfoBankButton = createSupplierBankInfoBankButton;
	}

	public WebElement getCreateSupplierBankInfoSearchBox() {
		return createSupplierBankInfoSearchBox;
	}

	public void setCreateSupplierBankInfoSearchBox(
			WebElement createSupplierBankInfoSearchBox) {
		this.createSupplierBankInfoSearchBox = createSupplierBankInfoSearchBox;
	}

	public WebElement getCreateSupplierBankInfoSearchBtn() {
		return createSupplierBankInfoSearchBtn;
	}

	public void setCreateSupplierBankInfoSearchBtn(
			WebElement createSupplierBankInfoSearchBtn) {
		this.createSupplierBankInfoSearchBtn = createSupplierBankInfoSearchBtn;
	}

	public WebElement getCreateSupplierBankInfoClickOnResult() {
		return createSupplierBankInfoClickOnResult;
	}

	public void setCreateSupplierBankInfoClickOnResult(
			WebElement createSupplierBankInfoClickOnResult) {
		this.createSupplierBankInfoClickOnResult = createSupplierBankInfoClickOnResult;
	}

	public WebElement getCreateSupplierBankInfoBankAccountDetails() {
		return createSupplierBankInfoBankAccountDetails;
	}

	public void setCreateSupplierBankInfoBankAccountDetails(
			WebElement createSupplierBankInfoBankAccountDetails) {
		this.createSupplierBankInfoBankAccountDetails = createSupplierBankInfoBankAccountDetails;
	}

	public WebElement getCreateSupplierBankInfoPaymentMethod() {
		return createSupplierBankInfoPaymentMethod;
	}

	public void setCreateSupplierBankInfoPaymentMethod(
			WebElement createSupplierBankInfoPaymentMethod) {
		this.createSupplierBankInfoPaymentMethod = createSupplierBankInfoPaymentMethod;
	}

	public WebElement getCreateSupplierBankInfoAddBankInfoButton() {
		return createSupplierBankInfoAddBankInfoButton;
	}

	public void setCreateSupplierBankInfoAddBankInfoButton(
			WebElement createSupplierBankInfoAddBankInfoButton) {
		this.createSupplierBankInfoAddBankInfoButton = createSupplierBankInfoAddBankInfoButton;
	}

	public WebElement getCreateSupplierBankInfoBankName() {
		return createSupplierBankInfoBankName;
	}

	public void setCreateSupplierBankInfoBankName(
			WebElement createSupplierBankInfoBankName) {
		this.createSupplierBankInfoBankName = createSupplierBankInfoBankName;
	}

	public WebElement getCreateSupplierBankInfoCity() {
		return createSupplierBankInfoCity;
	}

	public void setCreateSupplierBankInfoCity(WebElement createSupplierBankInfoCity) {
		this.createSupplierBankInfoCity = createSupplierBankInfoCity;
	}

	public WebElement getCreateSupplierBankInfoABARoutingNumber() {
		return createSupplierBankInfoABARoutingNumber;
	}

	public void setCreateSupplierBankInfoABARoutingNumber(
			WebElement createSupplierBankInfoABARoutingNumber) {
		this.createSupplierBankInfoABARoutingNumber = createSupplierBankInfoABARoutingNumber;
	}

	public WebElement getCreateSupplierBankInfoAccNumber() {
		return createSupplierBankInfoAccNumber;
	}

	public void setCreateSupplierBankInfoAccNumber(
			WebElement createSupplierBankInfoAccNumber) {
		this.createSupplierBankInfoAccNumber = createSupplierBankInfoAccNumber;
	}

	public WebElement getCreateSupplierBankInfoDefaultCheckBox() {
		return createSupplierBankInfoDefaultCheckBox;
	}

	public void setCreateSupplierBankInfoDefaultCheckBox(
			WebElement createSupplierBankInfoDefaultCheckBox) {
		this.createSupplierBankInfoDefaultCheckBox = createSupplierBankInfoDefaultCheckBox;
	}

	public WebElement getCreateSupplierBankInfoCloseButton() {
		return createSupplierBankInfoCloseButton;
	}

	public void setCreateSupplierBankInfoCloseButton(
			WebElement createSupplierBankInfoCloseButton) {
		this.createSupplierBankInfoCloseButton = createSupplierBankInfoCloseButton;
	}

	public WebElement getCreateSupplierContactInfoTab() {
		return createSupplierContactInfoTab;
	}

	public void setCreateSupplierContactInfoTab(
			WebElement createSupplierContactInfoTab) {
		this.createSupplierContactInfoTab = createSupplierContactInfoTab;
	}

	public WebElement getCreateSupplierContactInfoAddAContact() {
		return createSupplierContactInfoAddAContact;
	}

	public void setCreateSupplierContactInfoAddAContact(
			WebElement createSupplierContactInfoAddAContact) {
		this.createSupplierContactInfoAddAContact = createSupplierContactInfoAddAContact;
	}

	public WebElement getCreateSupplierContactInfoLastName() {
		return createSupplierContactInfoLastName;
	}

	public void setCreateSupplierContactInfoLastName(
			WebElement createSupplierContactInfoLastName) {
		this.createSupplierContactInfoLastName = createSupplierContactInfoLastName;
	}

	public WebElement getCreateSupplierContactInfoFirstName() {
		return createSupplierContactInfoFirstName;
	}

	public void setCreateSupplierContactInfoFirstName(
			WebElement createSupplierContactInfoFirstName) {
		this.createSupplierContactInfoFirstName = createSupplierContactInfoFirstName;
	}

	public WebElement getCreateSupplierContactInfoEmail() {
		return createSupplierContactInfoEmail;
	}

	public void setCreateSupplierContactInfoEmail(
			WebElement createSupplierContactInfoEmail) {
		this.createSupplierContactInfoEmail = createSupplierContactInfoEmail;
	}

	public WebElement getCreateSupplierContactInfoPhono() {
		return createSupplierContactInfoPhono;
	}

	public void setCreateSupplierContactInfoPhono(
			WebElement createSupplierContactInfoPhono) {
		this.createSupplierContactInfoPhono = createSupplierContactInfoPhono;
	}

	public WebElement getCreateSupplierApprovalWorkflowTab() {
		return createSupplierApprovalWorkflowTab;
	}

	public void setCreateSupplierApprovalWorkflowTab(
			WebElement createSupplierApprovalWorkflowTab) {
		this.createSupplierApprovalWorkflowTab = createSupplierApprovalWorkflowTab;
	}

	public WebElement getCreateSupplierContactInfoSaveAndClose() {
		return createSupplierContactInfoSaveAndClose;
	}

	public void setCreateSupplierContactInfoSaveAndClose(
			WebElement createSupplierContactInfoSaveAndClose) {
		this.createSupplierContactInfoSaveAndClose = createSupplierContactInfoSaveAndClose;
	}

	public WebElement getCreateSupplierApprovalWorkflowSubmitForDiligence() {
		return createSupplierApprovalWorkflowSubmitForDiligence;
	}

	public void setCreateSupplierApprovalWorkflowSubmitForDiligence(
			WebElement createSupplierApprovalWorkflowSubmitForDiligence) {
		this.createSupplierApprovalWorkflowSubmitForDiligence = createSupplierApprovalWorkflowSubmitForDiligence;
	}

	public WebElement getCreateSupplierApprovalWorkflowSubmitToWorkflow() {
		return createSupplierApprovalWorkflowSubmitToWorkflow;
	}

	public void setCreateSupplierApprovalWorkflowSubmitToWorkflow(
			WebElement createSupplierApprovalWorkflowSubmitToWorkflow) {
		this.createSupplierApprovalWorkflowSubmitToWorkflow = createSupplierApprovalWorkflowSubmitToWorkflow;
	}

	public WebElement getCreateSupplierApprovalWorkflowApprovalFinal() {
		return createSupplierApprovalWorkflowApprovalFinal;
	}

	public void setCreateSupplierApprovalWorkflowApprovalFinal(
			WebElement createSupplierApprovalWorkflowApprovalFinal) {
		this.createSupplierApprovalWorkflowApprovalFinal = createSupplierApprovalWorkflowApprovalFinal;
	}

	public WebElement getCreateSupplierApprovalWorkflowApproveChanges() {
		return createSupplierApprovalWorkflowApproveChanges;
	}

	public void setCreateSupplierApprovalWorkflowApproveChanges(
			WebElement createSupplierApprovalWorkflowApproveChanges) {
		this.createSupplierApprovalWorkflowApproveChanges = createSupplierApprovalWorkflowApproveChanges;
	}

	public WebElement getCreateSupplierBrowseSuppliers() {
		return createSupplierBrowseSuppliers;
	}

	public void setCreateSupplierBrowseSuppliers(
			WebElement createSupplierBrowseSuppliers) {
		this.createSupplierBrowseSuppliers = createSupplierBrowseSuppliers;
	}

	public WebElement getCreateSupplierStatusCroseMark() {
		return createSupplierStatusCroseMark;
	}

	public void setCreateSupplierStatusCroseMark(
			WebElement createSupplierStatusCroseMark) {
		this.createSupplierStatusCroseMark = createSupplierStatusCroseMark;
	}

	public WebElement getSearchSupplierSearchButton() {
		return searchSupplierSearchButton;
	}

	public void setSearchSupplierSearchButton(WebElement searchSupplierSearchButton) {
		this.searchSupplierSearchButton = searchSupplierSearchButton;
	}

	public WebElement getSearchSupplierSupplierType() {
		return searchSupplierSupplierType;
	}

	public void setSearchSupplierSupplierType(WebElement searchSupplierSupplierType) {
		this.searchSupplierSupplierType = searchSupplierSupplierType;
	}

	public WebElement getSearchSupplierSearchKeyword() {
		return searchSupplierSearchKeyword;
	}

	public void setSearchSupplierSearchKeyword(
			WebElement searchSupplierSearchKeyword) {
		this.searchSupplierSearchKeyword = searchSupplierSearchKeyword;
	}

	public List<WebElement> getSearchSupplierResultGridCompanyName() {
		return searchSupplierResultGridCompanyName;
	}

	public void setSearchSupplierResultGridCompanyName(
			List<WebElement> searchSupplierResultGridCompanyName) {
		this.searchSupplierResultGridCompanyName = searchSupplierResultGridCompanyName;
	}

	public WebElement getSearchSupplierResultGridFrameClose() {
		return searchSupplierResultGridFrameClose;
	}

	public void setSearchSupplierResultGridFrameClose(
			WebElement searchSupplierResultGridFrameClose) {
		this.searchSupplierResultGridFrameClose = searchSupplierResultGridFrameClose;
	}
	public WebElement getCreateSupplierDoingBusinessAs() {
		return createSupplierDoingBusinessAs;
	}

	public WebElement getCreateSupplierWebsite() {
		return createSupplierWebsite;
	}

	public WebElement getCreateSupplierParentCompany() {
		return createSupplierParentCompany;
	}

	public WebElement getCreateSupplierPhoneNumber() {
		return createSupplierPhoneNumber;
	}

	public WebElement getCreateSupplierOrderAddressAddressLine2() {
		return createSupplierOrderAddressAddressLine2;
	}

	public WebElement getCreateSupplierOrderAddressCounty() {
		return createSupplierOrderAddressCounty;
	}

	public WebElement getCreateSupplier1099INFOWithholdingApplicable() {
		return createSupplier1099INFOWithholdingApplicable;
	}

	public WebElement getCreateSupplier1099INFOWithholdingType() {
		return createSupplier1099INFOWithholdingType;
	}

	public WebElement getCreateSupplier1099INFOSupplierCategory() {
		return createSupplier1099INFOSupplierCategory;
	}

	public WebElement getCreateSupplier1099INFODefaultWithholdingClass() {
		return createSupplier1099INFODefaultWithholdingClass;
	}

	public WebElement getCreateSupplier1099AddressNameAdditional() {
		return createSupplier1099AddressNameAdditional;
	}

	public WebElement getCreateSupplier1099AddressAddress1() {
		return createSupplier1099AddressAddress1;
	}

	public WebElement getCreateSupplier1099AddressAddress2() {
		return createSupplier1099AddressAddress2;
	}

	public WebElement getCreateSupplier1099AddressCity() {
		return createSupplier1099AddressCity;
	}

	public WebElement getCreateSupplier1099AddressState() {
		return createSupplier1099AddressState;
	}

	public WebElement getCreateSupplier1099AddressZipCode() {
		return createSupplier1099AddressZipCode;
	}

	public WebElement getCreateSupplier1099AddressCountry() {
		return createSupplier1099AddressCountry;
	}

	public WebElement getCreateSupplierBankingInformationBranchID() {
		return createSupplierBankingInformationBranchID;
	}

	public WebElement getCreateSupplierBankingInformationPaymentHAndling() {
		return createSupplierBankingInformationPaymentHAndling;
	}

	public WebElement getCreateSupplierBankingInformationSupplierEmailAddressForACHPaymentConf() {
		return createSupplierBankingInformationSupplierEmailAddressForACHPaymentConf;
	}

	public WebElement getCreateSupplierBankingInformationPurchaseOrder() {
		return createSupplierBankingInformationPurchaseOrder;
	}

	public WebElement getCreateSupplierBankingInformationPOFunctionalAcknowledgement() {
		return createSupplierBankingInformationPOFunctionalAcknowledgement;
	}

	public WebElement getCreateSupplierBankingInformationAdvanceShippingNotice() {
		return createSupplierBankingInformationAdvanceShippingNotice;
	}

	public WebElement getCreateSupplierBankingInformationTestPartnerQualifier() {
		return createSupplierBankingInformationTestPartnerQualifier;
	}

	public WebElement getCreateSupplierBankingInformationProdPartnerQualifier() {
		return createSupplierBankingInformationProdPartnerQualifier;
	}

	public WebElement getCreateSupplierBankingInformationTestPartnerId() {
		return createSupplierBankingInformationTestPartnerId;
	}

	public WebElement getCreateSupplierBankingInformationTestAS2ReceiverId() {
		return createSupplierBankingInformationTestAS2ReceiverId;
	}

	public WebElement getCreateSupplierBankingInformationTestAttachmentButton() {
		return createSupplierBankingInformationTestAttachmentButton;
	}

	public WebElement getCreateSupplierBankingInformationTestURL() {
		return createSupplierBankingInformationTestURL;
	}

	public WebElement getCreateSupplierBankingInformationTestEdiSegmentSuffix() {
		return createSupplierBankingInformationTestEdiSegmentSuffix;
	}

	public WebElement getCreateSupplierBankingInformationTestAs2RequestMdn() {
		return createSupplierBankingInformationTestAs2RequestMdn;
	}

	public WebElement getCreateSupplierBankingInformationTestCXMLPartnerDomain() {
		return createSupplierBankingInformationTestCXMLPartnerDomain;
	}

	public WebElement getCreateSupplierBankingInformationTestCDXMLPartnerIdentity() {
		return createSupplierBankingInformationTestCDXMLPartnerIdentity;
	}

	public WebElement getCreateSupplierBankingInformationTestCDXMLPartnerSharedSecret() {
		return createSupplierBankingInformationTestCDXMLPartnerSharedSecret;
	}

	public WebElement getCreateSupplierBankingInformationTestCDXMLReceiverUrl() {
		return createSupplierBankingInformationTestCDXMLReceiverUrl;
	}

	public WebElement getCreateSupplierBankingInformationTestDomainFromCDXML() {
		return createSupplierBankingInformationTestDomainFromCDXML;
	}

	public WebElement getCreateSupplierBankingInformationTestIdentityFromCDXML() {
		return createSupplierBankingInformationTestIdentityFromCDXML;
	}

	public WebElement getCreateSupplierBankingInformationTestCDXMLToDomain() {
		return createSupplierBankingInformationTestCDXMLToDomain;
	}

	public WebElement getCreateSupplierBankingInformationTestCDXMLToIdentity() {
		return createSupplierBankingInformationTestCDXMLToIdentity;
	}

	public WebElement getCreateSupplierBankingInformationTestCDXMLSenderDomain() {
		return createSupplierBankingInformationTestCDXMLSenderDomain;
	}

	public WebElement getCreateSupplierBankingInformationTestCDXMLSenderIdentity() {
		return createSupplierBankingInformationTestCDXMLSenderIdentity;
	}

	public WebElement getCreateSupplierBankingInformationTestCDXMLSenderSharedSecret() {
		return createSupplierBankingInformationTestCDXMLSenderSharedSecret;
	}

	public WebElement getCreateSupplierBankingInformationProdPartnerId() {
		return createSupplierBankingInformationProdPartnerId;
	}

	public WebElement getCreateSupplierBankingInformationProdAS2ReceiverId() {
		return createSupplierBankingInformationProdAS2ReceiverId;
	}

	public WebElement getCreateSupplierBankingInformationProdAttachmentButton() {
		return createSupplierBankingInformationProdAttachmentButton;
	}

	public WebElement getCreateSupplierBankingInformationProdURL() {
		return createSupplierBankingInformationProdURL;
	}

	public WebElement getCreateSupplierBankingInformationProdEdiSegmentSuffix() {
		return createSupplierBankingInformationProdEdiSegmentSuffix;
	}

	public WebElement getCreateSupplierBankingInformationProdAs2RequestMdn() {
		return createSupplierBankingInformationProdAs2RequestMdn;
	}

	public WebElement getCreateSupplierBankingInformationProdCXMLPartnerDomain() {
		return createSupplierBankingInformationProdCXMLPartnerDomain;
	}

	public WebElement getCreateSupplierBankingInformationProdCDXMLPartnerIdentity() {
		return createSupplierBankingInformationProdCDXMLPartnerIdentity;
	}

	public WebElement getCreateSupplierBankingInformationProdCDXMLPartnerSharedSecret() {
		return createSupplierBankingInformationProdCDXMLPartnerSharedSecret;
	}

	public WebElement getCreateSupplierBankingInformationProdCDXMLReceiverUrl() {
		return createSupplierBankingInformationProdCDXMLReceiverUrl;
	}

	public WebElement getCreateSupplierBankingInformationProdDomainFromCDXML() {
		return createSupplierBankingInformationProdDomainFromCDXML;
	}

	public WebElement getCreateSupplierBankingInformationProdIdentityFromCDXML() {
		return createSupplierBankingInformationProdIdentityFromCDXML;
	}

	public WebElement getCreateSupplierBankingInformationProdCDXMLToDomain() {
		return createSupplierBankingInformationProdCDXMLToDomain;
	}

	public WebElement getCreateSupplierBankingInformationProdCDXMLToIdentity() {
		return createSupplierBankingInformationProdCDXMLToIdentity;
	}

	public WebElement getCreateSupplierBankingInformationProdCDXMLSenderDomain() {
		return createSupplierBankingInformationProdCDXMLSenderDomain;
	}

	public WebElement getCreateSupplierBankingInformationProdCDXMLSenderIdentity() {
		return createSupplierBankingInformationProdCDXMLSenderIdentity;
	}

	public WebElement getCreateSupplierBankingInformationProdCDXMLSenderSharedSecret() {
		return createSupplierBankingInformationProdCDXMLSenderSharedSecret;
	}

	public WebElement getCreateSupplierSupplierContactManagementStatus() {
		return createSupplierSupplierContactManagementStatus;
	}

	public WebElement getCreateSupplierSupplierContactManagementCellNumber() {
		return createSupplierSupplierContactManagementCellNumber;
	}

	public WebElement getCreateSupplierSupplierContactManagementFax() {
		return createSupplierSupplierContactManagementFax;
	}

	public WebElement getCreateSupplierSupplierContactManagementFunction() {
		return createSupplierSupplierContactManagementFunction;
	}

	public WebElement getCreateSupplierSupplierContactManagementDefaultLanguage() {
		return createSupplierSupplierContactManagementDefaultLanguage;
	}

	public WebElement getCreateSupplierSupplierContactManagementUploadPhotoButton() {
		return createSupplierSupplierContactManagementUploadPhotoButton;
	}

	public WebElement getCreateSupplierSupplierContactManagementFMEmployeeID() {
		return createSupplierSupplierContactManagementFMEmployeeID;
	}

	public WebElement getCreateSupplierSupplierContactManagementPersonTitle() {
		return createSupplierSupplierContactManagementPersonTitle;
	}
	public WebElement getCreateSupplier1099AddressStateButton() {
		return createSupplier1099AddressStateButton;
	}

	public WebElement getContracts() {
		return contracts;
	}

	public WebElement getCreatecontract() {
		return createcontract;
	}

	public WebElement getCspviolation() {
		return cspviolation;
	}

	public WebElement getContractTitle() {
		return contractTitle;
	}

	public WebElement getContractType() {
		return contractType;
	}

	public WebElement getSourcingProject() {
		return sourcingProject;
	}

	public WebElement getSourcingProjectButton() {
		return sourcingProjectButton;
	}

	public WebElement getSupplier() {
		return supplier;
	}

	public WebElement getSupplierButton() {
		return supplierButton;
	}

	public WebElement getCostcenter() {
		return costcenter;
	}

	public WebElement getPepolesoftproject() {
		return pepolesoftproject;
	}

	public WebElement getFileattach() {
		return fileattach;
	}

	public WebElement getCreatecontractType() {
		return createcontractType;
	}

	public WebElement getPrimaryCategory() {
		return primaryCategory;
	}

	public WebElement getProductsServicesDescription() {
		return productsServicesDescription;
	}

	public WebElement getComments() {
		return comments;
	}

	public WebElement getContractStatusIndicator() {
		return contractStatusIndicator;
	}

	public WebElement getStatusUpdateNextSteps() {
		return statusUpdateNextSteps;
	}

	public WebElement getEngagementPhase() {
		return engagementPhase;
	}

	public WebElement getSupplyMarketApproach() {
		return supplyMarketApproach;
	}

	public WebElement getContractVariance() {
		return contractVariance;
	}

	public WebElement getContractVarianceComments() {
		return contractVarianceComments;
	}

	public WebElement getThirdPartyData() {
		return thirdPartyData;
	}

	public WebElement getTransactionLegalSME() {
		return transactionLegalSME;
	}

	public WebElement getChargedtheloan() {
		return chargedtheloan;
	}

	public WebElement getLegal() {
		return legal;
	}

	public WebElement getCreatedfromPR() {
		return createdfromPR;
	}

	public WebElement getSourcepr() {
		return sourcepr;
	}

	public WebElement getBudgetBUApprovalProvidedinFieldglass() {
		return budgetBUApprovalProvidedinFieldglass;
	}

	public WebElement getCrr() {
		return crr;
	}

	public WebElement getEsow() {
		return esow;
	}

	public WebElement getWasthiscontractingopportunitypublished() {
		return wasthiscontractingopportunitypublished;
	}

	public WebElement getPublicRFxLinkedProject() {
		return publicRFxLinkedProject;
	}

	public WebElement getContractingopportunitycomments() {
		return contractingopportunitycomments;
	}

	public WebElement getWasadiversesupplierconsideredduringthesourcingprocess() {
		return wasadiversesupplierconsideredduringthesourcingprocess;
	}

	public WebElement getConsiderationdetails() {
		return considerationdetails;
	}

	public WebElement getNonconsiderationdetails() {
		return nonconsiderationdetails;
	}

	public WebElement getTpGroup() {
		return tpGroup;
	}

	public WebElement getOffshoreProvision() {
		return offshoreProvision;
	}

	public WebElement getInitialRiskReviewDecision() {
		return initialRiskReviewDecision;
	}

	public WebElement getRiskReviewProject() {
		return riskReviewProject;
	}
	
	public WebElement getSuperLoginIcon() {
		return superLoginIcon;
	}
	
	public WebElement getSuperLoginlogin() {
		return superLoginlogin;
	}

	public WebElement getSuperLoginpassword() {
		return superLoginpassword;
	}

	public List<WebElement> getSearchSupplierResultGridSupplierId() {
		return searchSupplierResultGridSupplierId;
	}

	public WebElement getCreateSupplierExitButton() {
		return createSupplierExitButton;
	}
	public WebElement getContractTeamSet() {
		return contractTeamSet;
	}
	
	
	
	////Neel xpaths for supplier
	@FindBy(id = "ddlbody_x_selSearchStatus_x")
	private WebElement supplierregstatus;
	
	@FindBy(id = "body_x_selFamily_x_txtselFamily_x_x")
	private WebElement supplierregcommodity;
	
	@FindBy(id = "link_ivmenu00_menu_0_sub1")
	private WebElement supplierreg;
	
	@FindBy(id = "body_x_selAnomalies_x_txtselAnomalies_x_x")
	private WebElement supplierregalerts;
	
	@FindBy(id = "body_x_txtQuery_x_x")
	private WebElement supplierregkeywords;
	
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	private WebElement supplierregsearch;
	
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	private WebElement supplierregreset;
	
	@FindBy(id = "link_ivmenu00_menu_0_sub2")
	private WebElement configQuestions;
	
	@FindBy(id = "ddlbody_x_selQuestType_x")
	private WebElement configQuestionsType;
	
	@FindBy(id = "body_x_selOrga_x_txtselOrga_x_x")
	private WebElement configQuestionsOrganisation;
	
	@FindBy(id = "ddlbody_x_selStatus_x")
	private WebElement configQuestionsStatus;
	
	@FindBy(id = "body_x_selLoginResp_x_txtselLoginResp_x_x")
	private WebElement configQuestionsManager;
	
	@FindBy(id = "proxyActionBar_x__cmdNew_btn2")
	private WebElement configQuestionsCreateTemplate;
	
	@FindBy(id = "body_x_chkTemplate_x0")
	private WebElement configQuestionsTemplateRadiobtn;
	
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_txtLabel_x_txtLabelen")
	private WebElement tempLabel;
	
	@FindBy(xpath  = "//table[@id='body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_txtDesc_x_ptxtDescen']/tbody/tr/td[1]/div/div")
	private WebElement tempDescription;
	
	@FindBy(id = "ddlbody_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_selType_x")
	private WebElement tempType;
	
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_selOrga_x_txtselOrga_x_x")
	private WebElement tempOrganisation;
	
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_selFamily_x_txtselFamily_x_x")
	private WebElement tempCommodity;
	
	@FindBy(id = "ddlbody_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_prxAnomalies_x_selErrors_x")
	private WebElement tempAlert;
	
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_chkTemplateForChoices_x0")
	private WebElement tempChoiceListRadiobtn;
	
	@FindBy(id = "link_ivmenu00_menu_0_sub5")
	private WebElement evaluation;
	
	@FindBy(id = "body_x_selQstEvalPeriod_x_txtselQstEvalPeriod_x_x")
	private WebElement evaluationPeriod;
	
	@FindBy(id = "body_x_selContact_x_txtselContact_x_x")
	private WebElement evaluationEvaluator;
	
	@FindBy(id = "body_x_selEvalObjects_x_txtselEvalObjects_x_x")
	private WebElement evaluationSupplier;
	
	@FindBy(id = "body_x_selQuestGuid_x_txtselQuestGuid_x_x")
	private WebElement evaluationQuestionnaire;
	
	@FindBy(id = "body_x_selContract_x_txtselContract_x_x")
	private WebElement evaluationContract;
	
	@FindBy(id = "ddlbody_x_selQuesttypeCode_7F7A9319_x")
	private WebElement evaluationType;
	///////////////////////////////
	@FindBy(id = "body_x_selEvalObjects_x_btnselEvalObjects_btn2")
	private WebElement evaluationCreateSupplierDots;
	
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	private WebElement evaluationCreateSupplierClose;
	
	@FindBy(id = "body_x_txtQuery_x_x")
	private WebElement evaluationCreateSupplierKeywords;
	
	@FindBy(id = "body_x__supplier_state__x_txt_supplier_state__x_x")
	private WebElement evaluationCreateSupplierState;
	
	@FindBy(id = "body_x_txtSupCommodityComment_x_x")
	private WebElement evaluationCreateSupplierOverview;
	
	@FindBy(id = "ddlbody_x_ddlType_x")
	private WebElement evaluationCreateSupplierType;
	
	@FindBy(xpath = "//table[@id='body_x_placeholder_supplier_130121155538']/tbody/tr[1]/td/table/tbody/tr/td[2]/span/span/h4")
	private WebElement evaluationCreateSupplieridentity;
	
	@FindBy(id = "ddlbody_x_ddlLevel_x")
	private WebElement evaluationCreateSupplierHierarchy;
	
	@FindBy(id = "body_x_selOrg_x_txtselOrg_x_x")
	private WebElement evaluationCreateSupplierOrganisation;
	
	@FindBy(id = "body_x_chkLimitFam_x0")
	private WebElement evaluationCreateSupplierLimitComodity;
	
	@FindBy(id = "body_x_selArea_x_txtselArea_x_x")
	private WebElement evaluationCreateSupplierRegionsServed;
	
	@FindBy(id = "body_x_sup_code_x_x")
	private WebElement evaluationCreateSupplierPSID;
	
	@FindBy(id = "body_x__supplier_bookmark_x_txt_supplier_bookmark_x_x")
	private WebElement evaluationCreateSupplierUserBookmarkSupplier;
	
	@FindBy(id = "ddlbody_x_ddlStatus_x")
	private WebElement evaluationCreateSupplierStatus;
	
	@FindBy(id = "ddlbody_x_selYesnCodeActiveSup_1_x")
	private WebElement evaluationCreateSupplierActiveSupplier;
	
	@FindBy(id = "ddlbody_x_selCritCode_x")
	private WebElement evaluationCreateSupplierCritically;
	
	@FindBy(id = "body_x_chkLimitOrga_x0")
	private WebElement evaluationCreateSupplierLimitOrganisation;
	
	@FindBy(id = "body_x_chkSupBook_x0")
	private WebElement evaluationCreateSupplierFavourite;
	
	@FindBy(id = "body_x_selAnomalies_x_txtselAnomalies_x_x")
	private WebElement evaluationCreateSupplierAlerts;
	
	@FindBy(id = "body_x_sup_tva_ic_x_x")
	private WebElement evaluationCreateSupplierTaxNumber;
	
	@FindBy(id = "body_x_cbChangeRequestLocked_x0")
	private WebElement evaluationCreateSupplierLockedSupplier;
	
	@FindBy(id = "body_x_txtCity_x_x")
	private WebElement evaluationCreateSupplierCity;
	
	@FindBy(id = "body_x_txtZipCode_x_x")
	private WebElement evaluationCreateSupplierZipCode;
	
	@FindBy(id = "body_x_selState_x_txtselState_x_x")
	private WebElement evaluationCreateSupplierAddressState;
	
	@FindBy(id = "ddlbody_x_selDocType_x")
	private WebElement evaluationCreateSupplierFolder;
	
	@FindBy(id = "ddlbody_x_chkFollow_x")
	private WebElement evaluationCreateSupplierFollow;
	
	@FindBy(id = "ddlbody_x_chkMissingDoc_x")
	private WebElement evaluationCreateSupplierDocsMissing;
	
	@FindBy(id = "ddlbody_x_selDocStatus_x")
	private WebElement evaluationCreateSupplierConfirmity;
	
	@FindBy(id = "body_x_ddlValidity_x")
	private WebElement evaluationCreateSupplierValidity;
	
	@FindBy(xpath = "//table[@id='body_x_ddlStatus_x_vddlStatus_x']/tbody/tr/td[2]")
	private WebElement evaluationCreateSuppliercheck;
	
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	private WebElement evaluationCreateSupplierclose;
	
	@FindBy(id = "body_x_selContract_x_btnselContract_btn2")
	private WebElement evaluationContractDots;
	
	@FindBy(id = "body_x_txtQuery_x_x")
	private WebElement evaluationContractKeywords;
	
	@FindBy(id = "ddlbody_x_ddlProgress_x")
	private WebElement evaluationContractStatus;
	
	@FindBy(id = "ddlbody_x_selTypeContract_x")
	private WebElement evaluationContractContractType;
	
	@FindBy(id = "body_x_orga_node_x_txtorga_node_x_x")
	private WebElement evaluationContractCostCenter;
	
	@FindBy(id = "body_x_selSupplier_x_txtselSupplier_x_x")
	private WebElement evaluationContractSupplier;
	
	@FindBy(id = "body_x_txtDate_x_x")
	private WebElement evaluationContractDateFrom;
	
	@FindBy(id = "body_x_txtDate_x_rtxtDate_x_x")
	private WebElement evaluationContractDateTo;
	
	@FindBy(id = "body_x_selFamily_x_txtselFamily_x_x")
	private WebElement evaluationContractPrimaryCategory;
	
	@FindBy(id = "body_x_selEntity_x_txtselEntity_x_x")
	private WebElement evaluationContractManagementEntity;
	
	@FindBy(id = "body_x_selContact_x_txtselContact_x_x")
	private WebElement evaluationContractContact;
	
	@FindBy(id = "body_x_project_id_x_txtproject_id_x_x")
	private WebElement evaluationContractProjectCode;
	
	@FindBy(id = "body_x_selFundingId_x_txtselFundingId_x_x")
	private WebElement evaluationContractPeopleSoftProject;
	
	@FindBy(id = "ddlbody_x_renewaltype_code_x")
	private WebElement evaluationContractRenewalTypes;
	
	@FindBy(id = "body_x_selAnomalies_x_txtselAnomalies_x_x")
	private WebElement evaluationContractAlerts;
	
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	private WebElement evaluationContractClose;
	
	public WebElement getEvaluationContractDots() {
		return evaluationContractDots;
	}


	public WebElement getEvaluationContractKeywords() {
		return evaluationContractKeywords;
	}


	public WebElement getEvaluationContractStatus() {
		return evaluationContractStatus;
	}


	public WebElement getEvaluationContractContractType() {
		return evaluationContractContractType;
	}


	public WebElement getEvaluationContractCostCenter() {
		return evaluationContractCostCenter;
	}


	public WebElement getEvaluationContractSupplier() {
		return evaluationContractSupplier;
	}


	public WebElement getEvaluationContractDateFrom() {
		return evaluationContractDateFrom;
	}


	public WebElement getEvaluationContractDateTo() {
		return evaluationContractDateTo;
	}


	public WebElement getEvaluationContractPrimaryCategory() {
		return evaluationContractPrimaryCategory;
	}


	public WebElement getEvaluationContractManagementEntity() {
		return evaluationContractManagementEntity;
	}


	public WebElement getEvaluationContractContact() {
		return evaluationContractContact;
	}


	public WebElement getEvaluationContractProjectCode() {
		return evaluationContractProjectCode;
	}


	public WebElement getEvaluationContractPeopleSoftProject() {
		return evaluationContractPeopleSoftProject;
	}


	public WebElement getEvaluationContractRenewalTypes() {
		return evaluationContractRenewalTypes;
	}


	public WebElement getEvaluationContractAlerts() {
		return evaluationContractAlerts;
	}


	public WebElement getEvaluationContractClose() {
		return evaluationContractClose;
	}
	
	
	

	public WebElement getEvaluationCreateSuppliercheck() {
		return evaluationCreateSuppliercheck;
	}


	public WebElement getEvaluationCreateSupplierClose() {
		return evaluationCreateSupplierClose;
	}

	public WebElement getEvaluationCreateSupplierDots() {
		return evaluationCreateSupplierDots;
	}


	public WebElement getEvaluationCreateSupplierKeywords() {
		return evaluationCreateSupplierKeywords;
	}


	public WebElement getEvaluationCreateSupplierState() {
		return evaluationCreateSupplierState;
	}


	public WebElement getEvaluationCreateSupplierOverview() {
		return evaluationCreateSupplierOverview;
	}


	public WebElement getEvaluationCreateSupplierType() {
		return evaluationCreateSupplierType;
	}


	public WebElement getEvaluationCreateSupplieridentity() {
		return evaluationCreateSupplieridentity;
	}


	public WebElement getEvaluationCreateSupplierHierarchy() {
		return evaluationCreateSupplierHierarchy;
	}


	public WebElement getEvaluationCreateSupplierOrganisation() {
		return evaluationCreateSupplierOrganisation;
	}


	public WebElement getEvaluationCreateSupplierLimitComodity() {
		return evaluationCreateSupplierLimitComodity;
	}


	public WebElement getEvaluationCreateSupplierRegionsServed() {
		return evaluationCreateSupplierRegionsServed;
	}


	public WebElement getEvaluationCreateSupplierPSID() {
		return evaluationCreateSupplierPSID;
	}


	public WebElement getEvaluationCreateSupplierUserBookmarkSupplier() {
		return evaluationCreateSupplierUserBookmarkSupplier;
	}


	public WebElement getEvaluationCreateSupplierStatus() {
		return evaluationCreateSupplierStatus;
	}


	public WebElement getEvaluationCreateSupplierActiveSupplier() {
		return evaluationCreateSupplierActiveSupplier;
	}


	public WebElement getEvaluationCreateSupplierCritically() {
		return evaluationCreateSupplierCritically;
	}


	public WebElement getEvaluationCreateSupplierLimitOrganisation() {
		return evaluationCreateSupplierLimitOrganisation;
	}


	public WebElement getEvaluationCreateSupplierFavourite() {
		return evaluationCreateSupplierFavourite;
	}


	public WebElement getEvaluationCreateSupplierAlerts() {
		return evaluationCreateSupplierAlerts;
	}


	public WebElement getEvaluationCreateSupplierTaxNumber() {
		return evaluationCreateSupplierTaxNumber;
	}


	public WebElement getEvaluationCreateSupplierLockedSupplier() {
		return evaluationCreateSupplierLockedSupplier;
	}


	public WebElement getEvaluationCreateSupplierCity() {
		return evaluationCreateSupplierCity;
	}


	public WebElement getEvaluationCreateSupplierZipCode() {
		return evaluationCreateSupplierZipCode;
	}


	public WebElement getEvaluationCreateSupplierAddressState() {
		return evaluationCreateSupplierAddressState;
	}


	public WebElement getEvaluationCreateSupplierFolder() {
		return evaluationCreateSupplierFolder;
	}


	public WebElement getEvaluationCreateSupplierFollow() {
		return evaluationCreateSupplierFollow;
	}


	public WebElement getEvaluationCreateSupplierDocsMissing() {
		return evaluationCreateSupplierDocsMissing;
	}


	public WebElement getEvaluationCreateSupplierConfirmity() {
		return evaluationCreateSupplierConfirmity;
	}


	public WebElement getEvaluationCreateSupplierValidity() {
		return evaluationCreateSupplierValidity;
	}

	
	public WebElement getSupplierregstatus() {
		return supplierregstatus;
	}
	
	public WebElement getSupplierregcommodity() {
		return supplierregcommodity;
	}
	
	public WebElement getSupplierreg() {
		return supplierreg;
	}
	
	public WebElement getSupplierregalerts() {
		return supplierregalerts;
	}
	
	public WebElement getSupplierregkeywords() {
		return supplierregkeywords;
	}
	
	public WebElement getSupplierregsearch() {
		return supplierregsearch;
	}
	
	public WebElement getSupplierregreset() {
		return supplierregreset;
	}
	
	public WebElement getConfigQuestions() {
		return configQuestions;
	}
	
	public WebElement getConfigQuestionsType() {
		return configQuestionsType;
	}
	
	public WebElement getConfigQuestionsOrganisation() {
		return configQuestionsOrganisation;
	}
	
	public WebElement getConfigQuestionsStatus() {
		return configQuestionsStatus;
	}
	
	public WebElement getConfigQuestionsManager() {
		return configQuestionsManager;
	}
	
	public WebElement getConfigQuestionsTemplateRadiobtn() {
		return configQuestionsTemplateRadiobtn;
	}
	
	public WebElement getConfigQuestionsCreateTemplate() {
		return configQuestionsCreateTemplate;
	}
	
	public WebElement getTempLabel() {
		return tempLabel;
	}
	
	public WebElement getTempDescription() {
		return tempDescription;
	}
	
	public WebElement getTempType() {
		return tempType;
	}
	
	public WebElement getTempOrganisation() {
		return tempOrganisation;
	}
	
	public WebElement getTempCommodity() {
		return tempCommodity;
	}
	
	public WebElement getTempAlert() {
		return tempAlert;
	}
	
	public WebElement getTempChoiceListRadiobtn() {
		return tempChoiceListRadiobtn;
	}
	
	public WebElement getEvaluation() {
		return evaluation;
	}
	
	public WebElement getEvaluationPeriod() {
		return evaluationPeriod;
	}
	
	public WebElement getEvaluationEvaluator() {
		return evaluationEvaluator;
	}
	
	public WebElement getEvaluationSupplier() {
		return evaluationSupplier;
	}
	
	public WebElement getEvaluationQuestionnaire() {
		return evaluationQuestionnaire;
	}
	
	public WebElement getEvaluationContracts() {
		return evaluationContract;
	}
	
	public WebElement getEvaluationType() {
		return evaluationType;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	////ends here
}
