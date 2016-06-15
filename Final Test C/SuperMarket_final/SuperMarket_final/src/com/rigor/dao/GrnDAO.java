package com.rigor.dao;

import java.util.List;

import com.rigor.entity.Grn;

public interface GrnDAO {
	
	public int save(Grn grn);
	public Grn findById(int id);
	public List<Grn> findAll();
	public void update(Grn grn_);
	public void deleteById(int id);
}
