package com.rigor.entity;

/** 

* Entity Class for Product. 
* 
* This class is the entity class for Product which is  
* use to generate table name item and create relevant columns for the table  . 
* 
* @author Nadeesha 
* 
* @version 1.0
* 
* @see see also ProductController.java, 
* ProductDAO.java, ProductDAOImpl.java, 
* ProductDTO.java, ProductService.java, 
* ProductServiceImpl.java classes

*/ 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Product {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "product_id")
 private int productId;

 @Column(name = "product_name")
 private String productName;
 @Column(name = "made_in")
 private String madeIn;
 private String brand;
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
 public float getPrice() {
  return price;
 }
 public void setPrice(float price) {
  this.price = price;
 }
 public String getMadeIn() {
  return madeIn;
 }
 public void setMadeIn(String madeIn) {
  this.madeIn = madeIn;
 }

}