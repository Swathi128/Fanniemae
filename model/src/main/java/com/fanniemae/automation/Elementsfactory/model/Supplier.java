package com.fanniemae.automation.Elementsfactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Supplier {

	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement createSupplierSaveButton;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement createSupplierBankInfoCloseButton;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtSupPaymentConfirmEmail_x_x")
	public static WebElement createSupplierBankingInformationSupplierEmailAddressForACHPaymentConf;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement createSupplierContactInfoSaveAndClose;
	@FindBy(xpath = "//span[text()='Main Info']")
	public static WebElement mainInfoTab;
	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement createSupplierSupplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub0_sub0")
	public static WebElement createSupplierLink;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_ddlType_x")
	public static WebElement createSupplierSupplierType;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtName_x_x")
	public static WebElement createSupplierLegalName;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtCorpName_x_txtCorpNameen")
	public static WebElement createSupplierDoingBusinessAs;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtSupRegisContactPhone_x_x")
	public static WebElement createSupplierPhoneNumber;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCompNom_x_x")
	public static WebElement createSupplierMainSupplierAddressNameAdditional;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtVoie_x_x")
	public static WebElement createSupplierAddressLine1;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCity_x_x")
	public static WebElement createSupplierCity;
	@FindBy(xpath = "//div[@role='menuitem']/div")
	public static WebElement costCentreList;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlState_x_txtddlState_x_x")
	public static WebElement createSupplierState;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtZip_x_x")
	public static WebElement createSupplierZip;
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlPays_x")
	public static WebElement createSupplierCountry;
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_selClasCode_x")
	public static WebElement createSupplierSupplierClassification;
	@FindBy(css = "#body_x_tabc_containerTab_partadmin .tab_label_class > div")
	public static WebElement createSupplierAdditionalInfoTab;
	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_selQualCode_x")
	public static WebElement createSupplierTINType;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_txtTva_x_x")
	public static WebElement createSupplierFederalTaxID;
	@FindBy(css = "#body_x_tabc_containerTab_parteproc .iv-tab-label")
	public static WebElement createSupplierBankInfoBankTab;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBdetaCodeBankDetail_x_btnselBdetaCodeBankDetail_btn2")
	public static WebElement createSupplierBankInfoBankButton;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBaccoCodeBankAccountDetails_x_btnselBaccoCodeBankAccountDetails_btn2")
	public static WebElement createSupplierBankInfoBankAccountDetails;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBpmethCodePaymentMethod_x_btnselBpmethCodePaymentMethod_btn2")
	public static WebElement createSupplierBankInfoPaymentMethod;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_btnAddNewBI_btn2")
	public static WebElement createSupplierBankInfoAddBankInfoButton;
	@FindBy(id = "body_x_txtOrder_x_x")
	public static WebElement createSupplierBankInfoBankName;
	@FindBy(id = "body_x_txtAgency_x_x")
	public static WebElement createSupplierBankInfoCity;
	@FindBy(id = "body_x_txtBiBankId_x_x")
	public static WebElement createSupplierBankInfoABARoutingNumber;
	@FindBy(id = "body_x_txtBiAccountNumber_x_x")
	public static WebElement createSupplierBankInfoAccNumber;
}