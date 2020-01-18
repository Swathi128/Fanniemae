package com.fanniemae.automation.dto.workbook;

import org.apache.poi.ss.usermodel.CellType;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class Cell {

	private int index;
	private String value;
	private CellType cellType;
	
	private boolean isEmpty;

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		if(isEmpty)
			this.isEmpty = isEmpty;
	}

	public Cell(int index, String value, CellType cellType) {
		super();
		this.index = index;
		this.value = value;
		this.cellType = cellType;
		this.isEmpty = false;
	}
	
	public Cell() {this.isEmpty = true;}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public void setCellType(CellType cellType) {
		this.cellType = cellType;
	}
	
	public int getIndex() {
		return index;
	} 
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public CellType getCellType() {
		return cellType;
	}

	@Override
	public String toString() {
		return "Cell [index=" + index + ", value=" + value + ", cellType=" + cellType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cellType == null) ? 0 : cellType.hashCode());
		result = prime * result + index;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (cellType != other.cellType)
			return false;
		if (index != other.index)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value)) {
			return false;
		}
		return true;
	}
}
