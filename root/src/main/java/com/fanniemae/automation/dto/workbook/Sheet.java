package com.fanniemae.automation.dto.workbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class Sheet {

	private String name;
	private int index;
	
	private List<Row> rows = null;

	public Sheet(String name, List<Row> rows) {
		this.name = name;
		this.rows = new ArrayList<>(rows);
	}

	public Sheet(String name) {
		super();
		this.name = name;
		this.rows = new ArrayList<>();
	}
	
	public void setRow(Row row) {
		if(Objects.nonNull(row))
			rows.add(row);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "Sheet [name=" + name + ", index=" + index + ", rows=" + rows + "]";
	}
}
