package com.rigor.dao;
/** 

* Data Access Object Interface for product. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This interface making it easy to work with data access technologies like JDBC, Hibernate
* 
* @author Nadeesha 
* 
* @version 1.0
* 
* @see see also ProductDAOImpl.java, ProductService.java, ProductServiceImpl.java

*/ 
import java.util.List;

import com.rigor.entity.Product;

public interface ProductDAO {
	public int save(Product product);

	public void update(Product product);

	public Product findById(int id);

	public List<Product> findAll();

	public void deleteById(int id);
}
