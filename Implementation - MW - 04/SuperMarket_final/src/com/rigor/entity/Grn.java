package com.rigor.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@Column(name = "ProductName")
	private String productName;
	
	@NotNull
	@Min(1)
	@Column(name = "Quantity")
	private int quantity;

	@NotNull
	@Column(name = "UnitPrice")
	private double unitPrice;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SupplierID")
	private Supplier supplier;

	

	public int getGrnID() {
		return grnID;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public void setGrnID(int grnID) {
		this.grnID = grnID;
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
