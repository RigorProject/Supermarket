package com.rigor.dao;
/** 

* Data Access Object Interface for supplier. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This interface making it easy to work with data access technologies like JDBC, Hibernate
* 
* @author MadhukaraK 
* 
* @version 1.0
* 
* @see see also SupplierDAOImpl.java, SupplierService.java, SupplierServiceImpl.java

*/ 
import java.util.List;

import com.rigor.entity.Supplier;

public interface SupplierDAO {
	
	public int save(Supplier supplier);

	public void update(Supplier supplier);

	public Supplier findById(int id);

	public List<Supplier> findAll();

	public void deleteById(int id);
}
