package com.rigor.dao;
/** 

* Data Access Object Interface for grn. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This interface making it easy to work with data access technologies like JDBC, Hibernate
* 
* @author Madushika 
* 
* @version 1.0
* 
* @see see also GrnDAOImpl.java, GrnService.java, GrnServiceImpl.java

*/ 
import java.util.List;

import com.rigor.entity.Grn;

public interface GrnDAO {
	
	public int save(Grn grn);
	public Grn findById(int id);
	public List<Grn> findAll();
	public void update(Grn grn_);
	public void deleteById(int id);
}
