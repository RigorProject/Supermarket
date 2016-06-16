package com.rigor.service;
/** 

* Supplier Service  Implementation for supplier. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* Basically help to perform CRUD operations with the help of SupplierDAO
* 
* @author MadhukaraK 
* 
* @version 1.0
* 
* @see see also SupplierDAOImpl.java, SupplierDAO.java, SupplierServiceImpl.java

*/
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rigor.dao.SupplierDAOImpl;
import com.rigor.entity.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDAOImpl supplierDAO;

	/** 
	* Use to Create Supplier and pass it to SupplierDAOImpl.java to commit into the database. 
	* 
	*/ 
	@Override
	public void saveSupplier(Supplier supplier) {
		supplierDAO.save(supplier);
	}
	
	/** 
	* Use to Update Supplier and pass it to SupplierDAOImpl.java to commit into the database. 
	* 
	*/ 

	@Override
	public void updateSupplier(Supplier supplier) {
		supplierDAO.update(supplier);		
	}

	/** 
	* Use to retrieve a supplier using given id . 
	* 
	*/
	@Override
	public Supplier getSupplier(int id) {
		Supplier supplier = supplierDAO.findById(id);
		return supplier;
	}

	/** 
	* Use to delete a supplier using given id . 
	* 
	*/
	@Override
	public void deleteSupplier(int id) {
		supplierDAO.deleteById(id);
	}

	/** 
	* Use to get all supplier store in the database . 
	* 
	*/
	@Override
	public List<Supplier> getAllSuppliers() {
		List<Supplier> suppliers = supplierDAO.findAll();
		return suppliers;
	}

}
