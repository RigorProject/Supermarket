package com.rigor.controller;

/** 

* Controller Class for Product. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This class is the controller class for Product.It prepares data,create a java object to 
* hold the data
* 
* @author Nadeesha 
* 
* @version 1.0
* 
* @see see also Product.java, 
* ProductDAO.java, ProductDAOImpl.java, 
* ProductDTO.java, ProductService.java, 
* ProductServiceImpl.java classes

*/ 

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rigor.entity.InvoiceItem;
import com.rigor.service.InvoiceItemService;

@Controller
@RequestMapping("/")
public class InvoiceItemController {
	
	private List<InvoiceItem> invoiceList = new ArrayList<>();
	@Autowired
	private InvoiceItemService invoiceItemService;
	



	@RequestMapping(value = "/addInvoice.htm",method=RequestMethod.POST)
	public ModelAndView addInvoice(InvoiceItem invoiceItem, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("create-invoice");
	
		if (invoiceItem.getInvoiceID() > 0) {
			
			invoiceItemService.createInvoice(invoiceItem);
		} else {
		
			
			invoiceItemService.createInvoice(invoiceItem);
		}
		
		modelAndView.addObject("invoiceItem", new InvoiceItem());
		System.out.println(invoiceItem.getInvoiceID());
		return modelAndView;
		
	}

	@RequestMapping(value = "/addInvoice.htm",method=RequestMethod.GET)
	public ModelAndView addInvoice(ModelMap modelmap) {
		ModelAndView modelAndView = new ModelAndView("create-invoice");
	
		modelmap.addAttribute("invoiceItem", new InvoiceItem());
		return modelAndView;
		
	}
}
