package com.rigor.service;
import java.util.List;

import com.rigor.entity.Grn;

public interface GrnService {
	
	public Grn getGrn(int id);
	public List<Grn> getAllGrn();
	public void saveGrn(Grn grnDTO);
	public void update(Grn grnDTO);
	public void deleteGrn(int id);
}
