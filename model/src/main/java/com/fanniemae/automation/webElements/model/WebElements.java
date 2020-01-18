package com.fanniemae.automation.webElements.model;

import com.fanniemae.automation.webElements.model.Supplier;
import com.fanniemae.automation.webElements.model.ProcurementDelete;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class WebElements {

	public Supplier supplier;
	public ProcurementDelete procurementDelete;

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public ProcurementDelete getProcurementDelete() {
		return procurementDelete;
	}

	public void setProcurementDelete(ProcurementDelete procurementDelete) {
		this.procurementDelete = procurementDelete;
	}

	public void init(WebDriver driver) {
		supplier = PageFactory.initElements(driver, Supplier.class);
		procurementDelete = PageFactory.initElements(driver, ProcurementDelete.class);
	}
}