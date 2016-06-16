package com.rigor.controller;

/** 

* Controller Class for Supplier. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This class is the controller class for Supplier.It prepares data,create a java object to 
* hold the data
* 
* @author MadhukaraK 
* 
* @version 1.0
* 
* @see see also Supplier.java, 
* SupplierDAO.java, SupplierDAOImpl.java, 
* SupplierDTO.java, SupplierService.java, 
* SupplierServiceImpl.java classes

*/ 

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rigor.entity.Supplier;
import com.rigor.service.SupplierService;

@Controller
public class SupplierController {
	private List<Supplier> supplireList = new ArrayList<Supplier>();

	@Autowired
	private SupplierService supplierService;

	@RequestMapping(value = "/listSupplier", method = RequestMethod.GET)
	public ModelAndView listSupplier() {
		return new ModelAndView("list-supplier", "suppliers",
				supplierService.getAllSuppliers());
	}

	
	@RequestMapping(value = "/supplier", method = RequestMethod.GET)
	public String addSupplier(ModelMap modelMap) {
		modelMap.addAttribute("supplier", new Supplier());
		modelMap.addAttribute("update", false);
		return "create-supplier";

	}

	@RequestMapping(value = "modifySupplier")
	public ModelAndView modifySupplier(Supplier supplier,
			BindingResult result) {

		return new ModelAndView("list-supplier");

	}

	@RequestMapping(value = "/editSupplier", method = RequestMethod.GET)
	public String editPage(ModelMap modelMap, HttpServletRequest request) {
		int supplierId = Integer.parseInt(request.getParameter("id"));
		modelMap.addAttribute("supplier", supplierService.getSupplier(supplierId));
		modelMap.addAttribute("update", true);
		return "create-supplier";
	}

	@RequestMapping(value = "/deleteSupplier", method = RequestMethod.GET)
	public ModelAndView deleteSupplier(HttpServletRequest request) {
		int supplierId = Integer.parseInt(request.getParameter("id"));
		supplierService.deleteSupplier(supplierId);
		return new ModelAndView("list-supplier", "suppliers",
				supplierService.getAllSuppliers());

	}

	@RequestMapping(value = "/addSupplier")
	public ModelAndView addSupplier(Supplier supplier, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("list-supplier");
		if (supplier.getSupplierId() > 0) {
			// update
			supplierService.update(supplier);
		} else {
			// add product
			supplierService.saveSupplier(supplier);
		}
		modelAndView.addObject("suppliers", supplierService.getAllSuppliers());
		System.out.println(supplier.getSupplierName());
		return modelAndView;
	}

}
