package com.rigor.service;
/** 

* Supplier Service Interface for supplier. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* Basically help to perform CRUD operations with the help of SupplierDAO
* 
* @author Madhukarak 
* 
* @version 1.0
* 
* @see see also SupplierDAOImpl.java, SupplierDAO.java, SupplierServiceImpl

*/
import java.util.List;

import com.rigor.entity.Supplier;

public interface SupplierService {
	
	public void saveSupplier(Supplier supplier);
	public void updateSupplier(Supplier supplier);
	public Supplier getSupplier(int id);
	public void deleteSupplier(int id);
	public List<Supplier> getAllSuppliers();

}
