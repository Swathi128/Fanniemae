package com.fanniemae.automation.procurement.model;

import com.fanniemae.automation.procurement.model.CreateProcument;
import com.fanniemae.automation.procurement.model.ProcurementDelete;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class Procurement {

	public CreateProcument createProcument;
	public ProcurementDelete procurementDelete;

	public CreateProcument getCreateProcument() {
		return createProcument;
	}

	public void setCreateProcument(CreateProcument createProcument) {
		this.createProcument = createProcument;
	}

	public ProcurementDelete getProcurementDelete() {
		return procurementDelete;
	}

	public void setProcurementDelete(ProcurementDelete procurementDelete) {
		this.procurementDelete = procurementDelete;
	}

	public void init(WebDriver driver) {
		createProcument = PageFactory.initElements(driver, CreateProcument.class);
		procurementDelete = PageFactory.initElements(driver, ProcurementDelete.class);
	}
}