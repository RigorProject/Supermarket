package com.rigor.dto;

public class SupplierDTO {
	
	private int supplierId;
	private String supplierName;
	private String organization;
	
	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierID) {
		this.supplierId = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getOrganization(){
		return organization;
	}
	
	public void setOrganization(String organization){
		this.organization = organization;
	}

}
