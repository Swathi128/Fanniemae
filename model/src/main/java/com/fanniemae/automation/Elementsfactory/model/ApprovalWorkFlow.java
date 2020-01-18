package com.fanniemae.automation.Elementsfactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApprovalWorkFlow {

	@FindBy(css = "#body_x_tabc_containerTab_partworkflow .tab_label_class > div")
	public static WebElement createSupplierApprovalWorkflowTab;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersINI_btn2")
	public static WebElement createSupplierApprovalWorkflowSubmitForDiligence;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersots_btn2")
	public static WebElement createSupplierApprovalWorkflowSubmitToWorkflow;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersVAL2_btn2")
	public static WebElement createSupplierApprovalWorkflowApprovalFinal;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersAPP2_btn2")
	public static WebElement createSupplierApprovalWorkflowApproveChanges;
}