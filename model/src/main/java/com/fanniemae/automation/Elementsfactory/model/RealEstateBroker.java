package com.fanniemae.automation.Elementsfactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RealEstateBroker {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement createSupplierSupplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub0_sub0")
	public static WebElement createSupplierLink;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_ddlType_x")
	public static WebElement createSupplierSupplierType;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtName_x_x")
	public static WebElement createSupplierLegalName;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCompNom_x_x")
	public static WebElement createSupplierMainSupplierAddressNameAdditional;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtVoie_x_x")
	public static WebElement createSupplierAddressLine1;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCity_x_x")
	public static WebElement createSupplierCity;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlState_x_txtddlState_x_x")
	public static WebElement createSupplierState;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtZip_x_x")
	public static WebElement createSupplierZip;
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlPays_x")
	public static WebElement createSupplierCountry;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x__sup_fm_equator_id_x_x")
	public static WebElement createSupplierRealEstateBrokerEquatorIdEVID;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtSupUseWeb_x0")
	public static WebElement createSupplierRealEstateBrokerUsingWeb;
	@FindBy(xpath = "//table[@id='body_x_grid_x']//tr/td[8]")
	public static WebElement searchSupplierResultGridCompanyName;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement createSupplierSaveButton;
	@FindBy(css = "#body_x_tabc_containerTab_partadmin .tab_label_class > div")
	public static WebElement createSupplierAdditionalInfoTab;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtCompNom_x_x")
	public static WebElement createSupplierNameAdditional;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtVoie_x_x")
	public static WebElement createSupplierAddInfoAddressLine1;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtCity_x_x")
	public static WebElement createSupplierAddInfoCity;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtZip_x_x")
	public static WebElement createSupplierAddInfoZip;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_ddlState_x_txtddlState_x_x")
	public static WebElement createSupplierAddInfoState;
	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_ddlPays_x")
	public static WebElement createSupplierAddInfoCountry;
	@FindBy(xpath = "//*[@class='icon_base icon_profil']")
	public static WebElement superLoginIcon;
	@FindBy(name = "body:x:pxCtc:x:txtLoginName:x:x")
	public static WebElement superLoginlogin;
	@FindBy(name = "body:x:pxCtc:x:txtLoginPass:x:x")
	public static WebElement superLoginpassword;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement createSupplierContactInfoSaveAndClose;
	@FindBy(xpath = "//img[@class='icon_base icon_invite']")
	public static WebElement regenaratePasswordButton;
	@FindBy(name = "proxyActionBar:x:resend_btn2")
	public static WebElement regenaratepassword;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement regenaratePasswordClose;
	@FindBy(xpath = "//span[@class='fa fa-times']")
	public static WebElement saveButtonMarkC;
	@FindBy(xpath = "//*[text()='Role']/../following-sibling::tr[2]/td[11]//select")
	public static WebElement supplierRole;
	@FindBy(xpath = "//*[text()='Role']/../following-sibling::tr[2]/td[11]//select")
	public static WebElement supplierRole2;
	@FindBy(css = "#body_x_tabc_containerTab_partworkflow .tab_label_class > div")
	public static WebElement createSupplierApprovalWorkflowTab;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersINI_btn2")
	public static WebElement createSupplierApprovalWorkflowSubmitForDiligence;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersots_btn2")
	public static WebElement createSupplierApprovalWorkflowSubmitToWorkflow;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersm_trax_chk_btn2")
	public static WebElement createSupplierRealEstateBrokerContinueOnBoarding;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_update_btn2")
	public static WebElement createSupplierRealEstateBrokerProfileDocumentUpdate;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_ops_review_btn2")
	public static WebElement createSupplierRealEstateBrokerApprove;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_due_diligence_btn2")
	public static WebElement createSupplierRealEstateBrokerNoFindings;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_op_trax_upd_btn2")
	public static WebElement createSupplierRealEstateBrokerTraxUpdated;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_upd_proc_one_btn2")
	public static WebElement createSupplierRealEstateBrokerProcureOneUpdated;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_upd_ach_btn2")
	public static WebElement createSupplierRealEstateBrokerACHInformationUpdated;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersVAL1_btn2")
	public static WebElement createSupplierRealEstateBrokerApproveFinal;
	@FindBy(id = "proxyActionBar_x_txtWflRefuseMessage_x_x")
	public static WebElement createSupplierRealEstateBrokerReason;
	@FindBy(id = "proxyActionBar_x_btnWflRefuseMessage_btn2")
	public static WebElement createSupplierRealEstateBrokerReasonConfirm;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtSupPayTrx_x0")
	public static WebElement createSupplierRealEstateBrokerIsPayable;
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