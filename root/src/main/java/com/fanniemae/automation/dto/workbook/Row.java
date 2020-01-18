package com.fanniemae.automation.dto.workbook;

import java.util.Map;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class Row {

	private Map<Cell, Cell> data = null;
	private int index;
	private String sheetName;
	
	public Row(Map<Cell, Cell> data, int index, String sheetName) {
		super();
		this.data = data;
		this.index = index;
		this.sheetName = sheetName;
	}

	public Map<Cell, Cell> getData() {
		return data;
	}

	public int getIndex() {
		return index;
	}

	public String getSheetName() {
		return sheetName;
	}

	@Override
	public String toString() {
		return "Row [data=" + data + ", index=" + index + ", sheetName=" + sheetName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + index;
		result = prime * result + ((sheetName == null) ? 0 : sheetName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return ((obj instanceof Row) && index == ((Row)obj).getIndex()) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue();
	}
}
