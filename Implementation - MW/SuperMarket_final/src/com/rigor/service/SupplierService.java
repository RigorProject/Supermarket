package com.rigor.service;

import java.util.List;

import com.rigor.dto.SupplierDTO;

public interface SupplierService {
	
	public void saveSupplier(SupplierDTO supplierDTO);
	public void update(SupplierDTO supplierDTO);
	public SupplierDTO getSupplier(int id);
	public void deleteSupplier(int id);
	public List<SupplierDTO> getAllSuppliers();

}
