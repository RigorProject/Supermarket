package com.rigor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Supplier")
public class Supplier {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "SupplierID")
	private int supplierId;
@Column(name = "SupName")
	private String supplierName;
@Column(name = "Organization")
	private String organization;

	public int getSupplierID() {
		return supplierId;
	}
	public void setSupplierID(int supplierID) {
		this.supplierId = supplierID;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
}

	

}
