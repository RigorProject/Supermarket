package com.rigor.dto;
/** 

* Data Transfer Object (DTO) class for product. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
*  When multiple requests are required to bring data for a task.It allows only one request to bring all required data 
* 
* @author Nadeesha 
* 
* @version 1.0
* 
* @see see also SupplierService.java Interface

*/ 
public class ProductDTO {

	private int productId;
	private String productName;
	private String brand;
	private String madeIn;
	private float price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
