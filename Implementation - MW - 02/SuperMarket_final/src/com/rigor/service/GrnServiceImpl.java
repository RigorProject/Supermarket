package com.rigor.service;
/** 

* Grn Service  Implementation for grn. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* Basically help to perform CRUD operations with the help of GrnDAO
* 
* @author Madushika 
* 
* @version 1.0
* 
* @see see also GrnDAOImpl.java, GrnDAO.java, GrnServiceImpl.java

*/

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rigor.dao.GrnDAO;
import com.rigor.entity.Grn;


@Service
public class GrnServiceImpl implements GrnService {
	
	@Autowired
	private GrnDAO grnDAO;
	
	/** 
	* Use to Create Grn and pass it to GrnDAOImpl.java to commit into the database. 
	* 
	*/ 
	public void saveGrn(Grn grn) {
		
		
		grnDAO.save(grn);
	}
	/** 
	* Use to Update Grn and pass it to GrnDAOImpl.java to commit into the database. 
	* 
	*/
	@Override
	public void update(Grn grn) {
		
		grnDAO.update(grn);

	}
	/** 
	* Use to retrieve a Grn using given id . 
	* 
	*/ 

	@Override
	public Grn getGrn(int id) {
		Grn grn = grnDAO.findById(id);
		
		
		return grn;
	}
	/** 
	* Use to get all grn store in the database . 
	* 
	*/
	
	@Override
	public List<Grn> getAllGrn() {
		
		List<Grn> grns = grnDAO.findAll();
		
		return grns;
		
	}
	/** 
	* Use to delete a Grn using given id . 
	* 
	*/
	@Override
	public void deleteGrn(int id) {
		grnDAO.deleteById(id);
		
	}


}
