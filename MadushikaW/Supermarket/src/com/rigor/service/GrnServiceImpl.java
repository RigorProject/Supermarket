package com.rigor.service;

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
	//private GrnDAOImpl grnDAO;
	
	public void saveGrn(Grn grn) {
		
		
		grnDAO.save(grn);
	}
	
	@Override
	public void update(Grn grn) {
		
		grnDAO.update(grn);

	}
	
	@Override
	public Grn getGrn(int id) {
		Grn grn = grnDAO.findById(id);
		
		
		return grn;
	}

	
	@Override
	public List<Grn> getAllGrn() {
		
		List<Grn> grns = grnDAO.findAll();
		
		return grns;
		
	}

/*	@Override
	public List<Grn> getAllGrn() {
		List<GrnDAO> grnDAOs = new ArrayList<GrnDAO>();
		List<Grn> grn_ = grnDAO.findAll();
		if (grn_ != null && !grn_.isEmpty()) {
			for (Grn grn : grn_) {
				GrnDAO grnDAO = new GrnDAO();
				grnDAOs.add(grnDAO);
			}
		}
		return grnDAOs;
	}
*/

	@Override
	public void deleteGrn(int id) {
		grnDAO.deleteById(id);
		
	}


}
