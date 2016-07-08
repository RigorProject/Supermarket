package com.rigor.controller;
/** 

* Controller Class for Grn. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This class is the controller class for Grn.It prepares data,create a java object to 
* hold the data
* 
* @author Madushika
* 
* @version 1.0
* 
* @see see also Grn.java, 
* GrnDAO.java, GrnDAOImpl.java, 
* GrnService.java,GrnServiceImpl.java classes
* 

*/
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rigor.dao.GrnDAO;
import com.rigor.entity.Grn;
import com.rigor.entity.Supplier;
import com.rigor.service.GrnService;
import com.rigor.service.SupplierService;

@Controller
@RequestMapping("/")
public class GrnController {
	//private List<Grn> grn_list = new ArrayList<>();
	
	@Autowired
	private GrnService grnService;
	
	@Autowired
	private SupplierService supService;
	
	 @Autowired
	    MessageSource messageSource;
	
	@RequestMapping(value = "/listGrn", method = RequestMethod.GET)
	public ModelAndView ListGrn() {
		return new ModelAndView("list-Grn", "grnList", grnService.getAllGrn());
		

	}
	
	
	
	@RequestMapping(value = "modifyGrn")
	public ModelAndView modifyGrn(Grn grnEntity,
			BindingResult result) {

		return new ModelAndView("list-Grn");

	}
	@RequestMapping(value = "/editGrn", method = RequestMethod.GET)
	public String editPage(ModelMap modelMap, HttpServletRequest request) {
		int grnId = Integer.parseInt(request.getParameter("id"));
		modelMap.addAttribute("grns", grnService.getGrn(grnId));
		modelMap.addAttribute("update", true);
		return "place-grn";
	}
	
	@RequestMapping(value = "/deleteGrn", method = RequestMethod.GET)
	public ModelAndView deleteGrn(HttpServletRequest request) {
		int grnId = Integer.parseInt(request.getParameter("id"));
		grnService.deleteGrn(grnId);
		return new ModelAndView("list-Grn", "grnList",
				grnService.getAllGrn());

	}


	@RequestMapping(value = "/addGrn", method = RequestMethod.GET)
	public String addGrn(ModelMap modelMap) {
		List<Supplier> supList=supService.getAllSuppliers();
		
		modelMap.addAttribute("suppliers",supList);
		modelMap.addAttribute("grns", new Grn());
		modelMap.addAttribute("update", false);
		return "place-grn";

	}

	@RequestMapping(value = "/addGrn", method = RequestMethod.POST )
	public ModelAndView addGrn(@Valid @ModelAttribute("grns") Grn grnEntity, BindingResult result) {
		
		ModelAndView modelAndView = new ModelAndView("list-Grn");
		
		if(result.hasErrors()){
			return new ModelAndView("place-grn");
		}
		else {
			
		if (grnEntity.getGrnID() > 0) {
			// update
			grnService.update(grnEntity);
			
		} else {
			// add product
			grnService.saveGrn(grnEntity);
			
		}
		modelAndView.addObject("grnList", grnService.getAllGrn());
		System.out.println(grnEntity.getGrnID());
		return modelAndView;
		
		}
	}


}
