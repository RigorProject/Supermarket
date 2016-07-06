package com.rigor.entity;
/** 

* Entity Class for Grn. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This class is the entity class for Grn which is  
* use to generate table name grn and create relevant columns for the table  . 
* 
* @author Madushika 
* 
* @version 1.0
* 
* @see see also GrnController.java, 
* GrnDAO.java, GrnDAOImpl.java, 
* GrnService.java,GrnServiceImpl.java classes 
* 

*/ 
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "grn")
public class Grn {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GrnID")
	private int grnID;
	
	@NotEmpty
	@Column(name = "SupplierName")
	private String supplierName;
	
	@NotEmpty
	@Column(name = "ProductName")
	private String productName;
	
	@NotNull
	@Min(1)
	@Column(name = "Quantity")
	private int quantity;

	@NotNull
	@Column(name = "UnitPrice")
	private double unitPrice;
	
/*	@OneToMany(mappedBy="invoiceItem")
	private Set<Product> products;*/
	
	/* @ManyToOne
	 @JoinColumn(name="supplier_id")
	 private Supplier suppliers;*/
	private Supplier supplier;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUPPLIER_ID", nullable = false)
	
	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public int getGrnID() {
		return grnID;
	}

	public void setGrnID(int grnID) {
		this.grnID = grnID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


}
