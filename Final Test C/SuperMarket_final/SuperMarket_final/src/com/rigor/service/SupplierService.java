package com.rigor.service;

import java.util.List;

import com.rigor.entity.Supplier;

public interface SupplierService {
	
	public void saveSupplier(Supplier supplier);
	public void update(Supplier supplier);
	public Supplier getSupplier(int id);
	public void deleteSupplier(int id);
	public List<Supplier> getAllSuppliers();

}
