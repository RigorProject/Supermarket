package com.rigor.dao;

import java.util.List;

import com.rigor.entity.Supplier;

public interface SupplierDAO {
	
	public int save(Supplier supplier);

	public void update(Supplier supplier);

	public Supplier findById(int id);

	public List<Supplier> findAll();

	public void deleteById(int id);
}
