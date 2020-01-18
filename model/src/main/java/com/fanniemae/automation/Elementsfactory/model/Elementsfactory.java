package com.fanniemae.automation.Elementsfactory.model;

import com.fanniemae.automation.Elementsfactory.model.CreateMasterServicesAgreement;
import com.fanniemae.automation.Elementsfactory.model.approval;
import com.fanniemae.automation.Elementsfactory.model.Logout;
import com.fanniemae.automation.Elementsfactory.model.Login;
import com.fanniemae.automation.Elementsfactory.model.Supplier;
import com.fanniemae.automation.Elementsfactory.model.CreateSupplierBankingInfo;
import com.fanniemae.automation.Elementsfactory.model.Contacts;
import com.fanniemae.automation.Elementsfactory.model.ApprovalWorkFlow;
import com.fanniemae.automation.Elementsfactory.model.SearchAndVerify;
import com.fanniemae.automation.Elementsfactory.model.RealEstateBroker;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class Elementsfactory {

	public CreateMasterServicesAgreement createMasterServicesAgreement;
	public approval approval;
	public Logout logout;
	public Login login;
	public Supplier supplier;
	public CreateSupplierBankingInfo createSupplierBankingInfo;
	public Contacts contacts;
	public ApprovalWorkFlow approvalWorkFlow;
	public SearchAndVerify searchAndVerify;
	public RealEstateBroker realEstateBroker;

	public CreateMasterServicesAgreement getCreateMasterServicesAgreement() {
		return createMasterServicesAgreement;
	}

	public void setCreateMasterServicesAgreement(CreateMasterServicesAgreement createMasterServicesAgreement) {
		this.createMasterServicesAgreement = createMasterServicesAgreement;
	}

	public approval getApproval() {
		return approval;
	}

	public void setApproval(approval approval) {
		this.approval = approval;
	}

	public Logout getLogout() {
		return logout;
	}

	public void setLogout(Logout logout) {
		this.logout = logout;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public CreateSupplierBankingInfo getCreateSupplierBankingInfo() {
		return createSupplierBankingInfo;
	}

	public void setCreateSupplierBankingInfo(CreateSupplierBankingInfo createSupplierBankingInfo) {
		this.createSupplierBankingInfo = createSupplierBankingInfo;
	}

	public Contacts getContacts() {
		return contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

	public ApprovalWorkFlow getApprovalWorkFlow() {
		return approvalWorkFlow;
	}

	public void setApprovalWorkFlow(ApprovalWorkFlow approvalWorkFlow) {
		this.approvalWorkFlow = approvalWorkFlow;
	}

	public SearchAndVerify getSearchAndVerify() {
		return searchAndVerify;
	}

	public void setSearchAndVerify(SearchAndVerify searchAndVerify) {
		this.searchAndVerify = searchAndVerify;
	}

	public RealEstateBroker getRealEstateBroker() {
		return realEstateBroker;
	}

	public void setRealEstateBroker(RealEstateBroker realEstateBroker) {
		this.realEstateBroker = realEstateBroker;
	}

	public void init(WebDriver driver) {
		createMasterServicesAgreement = PageFactory.initElements(driver, CreateMasterServicesAgreement.class);
		approval = PageFactory.initElements(driver, approval.class);
		logout = PageFactory.initElements(driver, Logout.class);
		login = PageFactory.initElements(driver, Login.class);
		supplier = PageFactory.initElements(driver, Supplier.class);
		createSupplierBankingInfo = PageFactory.initElements(driver, CreateSupplierBankingInfo.class);
		contacts = PageFactory.initElements(driver, Contacts.class);
		approvalWorkFlow = PageFactory.initElements(driver, ApprovalWorkFlow.class);
		searchAndVerify = PageFactory.initElements(driver, SearchAndVerify.class);
		realEstateBroker = PageFactory.initElements(driver, RealEstateBroker.class);
	}
}