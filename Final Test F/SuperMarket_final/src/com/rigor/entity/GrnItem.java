package com.rigor.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/** 

* Entity Class for GrnItem. 
* 
* 
* This class is the entity class for Product which is  
* use to generate table name item and create relevant columns for the table  . 
* 
* @author Nadeesha 
* 
* @version 1.0
* 
* @see see also ProductController.java,
* Grn.java
* Supplier.java classes
*/ 

@Entity
@Table(name = "grnItem")
public class GrnItem {
	
	private long id;
	private Grn grn;
	private Product product;
	private double amount;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GRN_ITEM_ID")
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "GRN_ID")
	public Grn getGrn() {
		return grn;
	}


	public void setGrn(Grn grn) {
		this.grn = grn;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PRODUCT_ID")
	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
	 

}
