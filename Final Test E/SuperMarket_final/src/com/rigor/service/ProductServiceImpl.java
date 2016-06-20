package com.rigor.service;
/** 

* Product Service  Implementation for product. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* Basically help to perform CRUD operations with the help of ProductDAO
* 
* @author Nadeesha 
* 
* @version 1.0
* 
* @see see also ProductDAOImpl.java, ProductDAO.java, ProductServiceImpl.java

*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rigor.dao.ProductDAOImpl;
import com.rigor.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAOImpl productDAO;

	/**
	 * Use to Create Product and pass it to ProductDAOImpl.java to commit into
	 * the database.
	 * 
	 */
	public void saveProduct(Product product) {
		productDAO.save(product);
	}
	
	

	/**
	 * Use to Update Product and pass it to ProductDAOImpl.java to commit into
	 * the database.
	 * 
	 */
	public void update(Product product) {
		productDAO.update(product);

	}

	
	/**
	 * Use to retrieve a product using given id .
	 * 
	 */
	public Product getProduct(int id) {
		Product product = productDAO.findById(id);
		return product;
	}

	
	/**
	 * Use to delete a product using given id .
	 * 
	 */
	public void deleteProduct(int id) {
		productDAO.deleteById(id);
	}

	
	/**
	 * Use to get all products store in the database .
	 * 
	 */
	public List<Product> getAllProducts() {

		List<Product> products = productDAO.findAll();
		return products;
	}
}
