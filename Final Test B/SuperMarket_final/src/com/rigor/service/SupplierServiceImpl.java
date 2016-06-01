package com.rigor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rigor.dao.SupplierDAOImpl;
import com.rigor.dto.SupplierDTO;
import com.rigor.entity.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDAOImpl supplierDAO;

	@Override
	public void saveSupplier(SupplierDTO supplierDTO) {
		Supplier supplier = new Supplier();
		BeanUtils.copyProperties(supplierDTO, supplier);
		supplierDAO.save(supplier);
	}

	@Override
	public void update(SupplierDTO supplierDTO) {
		Supplier supplier = new Supplier();
		BeanUtils.copyProperties(supplierDTO, supplier);
		supplierDAO.update(supplier);		
	}

	@Override
	public SupplierDTO getSupplier(int id) {
		Supplier supplier = supplierDAO.findById(id);
		SupplierDTO supplierDTO = new SupplierDTO();
		BeanUtils.copyProperties(supplier, supplierDTO);
		return supplierDTO;
	}

	@Override
	public void deleteSupplier(int id) {
		supplierDAO.deleteById(id);
	}

	@Override
	public List<SupplierDTO> getAllSuppliers() {
		List<SupplierDTO> supplierDtos = new ArrayList<SupplierDTO>();
		List<Supplier> suppliers = supplierDAO.findAll();
		if (suppliers != null && !suppliers.isEmpty()) {
			for (Supplier supplier : suppliers) {
				SupplierDTO supplierDTO = new SupplierDTO();
				BeanUtils.copyProperties(supplier, supplierDTO);
				supplierDtos.add(supplierDTO);
			}
		}
		return supplierDtos;
	}

}
