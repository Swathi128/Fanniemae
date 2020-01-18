package com.fanniemae.automation.dto.workbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class Workbook {

	private String name = null;
	private List<Sheet> sheets = null;

	public Workbook(String name, List<Sheet> sheets) {
		super();
		this.name = name;
		this.sheets = new ArrayList<>(sheets);
	}

	public Workbook(String name) {
		super();
		this.name = name;
		sheets = new ArrayList<>();
	}

	public List<Sheet> getSheets() {
		return sheets;
	}

	public void setSheets(List<Sheet> sheets) {
		this.sheets = sheets;
	}

	public String getName() {
		return name;
	}
	
	public void addSheet(Sheet sheet) {
		if(Objects.nonNull(sheet))
			sheets.add(sheet);
	}

	@Override
	public String toString() {
		return "Workbook [name=" + name + ", sheets=" + sheets + "]";
	}
}
