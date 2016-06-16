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

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rigor.dao.ProductDAOImpl;
import com.rigor.dto.ProductDTO;
import com.rigor.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAOImpl productDAO;
	
	/** 
	* Use to Create Product and pass it to ProductDAOImpl.java to commit into the database. 
	* 
	*/ 

	public void saveProduct(ProductDTO productDTO) {
	    Product product = new Product();
		BeanUtils.copyProperties(productDTO, product); //Utility methods for populating JavaBeans properties via reflection.
		productDAO.save(product);
	}

	/** 
	* Use to Update Product and pass it to ProductDAOImpl.java to commit into the database. 
	* 
	*/ 
	
	public void update(ProductDTO productDTO) {
		Product product = new Product();
		BeanUtils.copyProperties(productDTO, product);
		productDAO.update(product);

	}
	
	/** 
	* Use to retrieve a product using given id . 
	* 
	*/ 

	public ProductDTO getProduct(int id) {
		Product product = productDAO.findById(id);
		ProductDTO productDTO = new ProductDTO();
		BeanUtils.copyProperties(product, productDTO);
		return productDTO;
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

	public List<ProductDTO> getAllProducts() {
		List<ProductDTO> productDtos = new ArrayList<ProductDTO>();
		List<Product> products = productDAO.findAll();
		if (products != null && !products.isEmpty()) {
			for (Product product : products) {
				ProductDTO productDTO = new ProductDTO();
				BeanUtils.copyProperties(product, productDTO);
				productDtos.add(productDTO);
			}
		}
		return productDtos;
	}
}
