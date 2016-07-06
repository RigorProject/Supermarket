package com.rigor.service;
/** 

* Grn Service Interface for Grn. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* Basically help to perform CRUD operations with the help of GrnDAO
* 
* @author Madushika 
* 
* @version 1.0
* 
* @see see also GrnDAOImpl.java, GrnDAO.java, GrnServiceImpl

*/
import java.util.List;

import com.rigor.entity.Grn;

public interface GrnService {
	
	public Grn getGrn(int id);
	public List<Grn> getAllGrn();
	public void saveGrn(Grn grnDTO);
	public void update(Grn grnDTO);
	public void deleteGrn(int id);
}
