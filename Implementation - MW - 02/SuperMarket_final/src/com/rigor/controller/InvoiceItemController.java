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

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value = "/listInvoice", method = RequestMethod.GET)
	
		public ModelAndView ListInvoice() {
			return new ModelAndView("list-invoice", "invoices", invoiceItemService.getAllInvoice());

	}


	@RequestMapping(value = "modifyInvoice")
	public ModelAndView modifyGrn(InvoiceItem invoiceItm,
			BindingResult result) {

		return new ModelAndView("list-invoice");

	}

/*
	@RequestMapping(value = "/listInvoice.htm")
	public ModelAndView addInvoice(InvoiceItem invoiceItem, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("list-invoice");
	
		if (invoiceItem.getInvoiceID() > 0) {
			
			invoiceItemService.createInvoice(invoiceItem);
		} else {
		
			
			invoiceItemService.createInvoice(invoiceItem);
		}
		
		modelAndView.addObject("invoiceItem", new InvoiceItem());
		System.out.println(invoiceItem.getInvoiceID());
		return modelAndView;
		
	}*/

	@RequestMapping(value = "/addInvoice.htm",method=RequestMethod.GET)
	public ModelAndView addInvoice(ModelMap modelmap) {
		ModelAndView modelAndView = new ModelAndView("create-invoice");
	
		modelmap.addAttribute("invoiceItem", new InvoiceItem());
		modelmap.addAttribute("update", false);
		return modelAndView;
		
	}
	
/*	@RequestMapping(value = "/editInvoice", method = RequestMethod.GET)
	public String editInvoice(ModelMap modelMap, HttpServletRequest request) {
		int invoiceId = Integer.parseInt(request.getParameter("id"));
		modelMap.addAttribute("invoiceItem", invoiceItemService.getInvoice(invoiceId));
		modelMap.addAttribute("update", true);
		return "create-invoice";
	}*/
	@RequestMapping(value = "/editInvoice/{id}", method = RequestMethod.GET)
	public String editPage(ModelMap modelMap, @PathVariable int id) {
		int invoiceId = id;
		modelMap.addAttribute("invoiceItem", invoiceItemService.getInvoice(invoiceId));
		modelMap.addAttribute("update", true);
		return "create-invoice";
	}
	
	@RequestMapping(value = "/deleteInvoice/{id}", method = RequestMethod.GET)
	public ModelAndView deleteInvoice( @PathVariable int id) {
		int invoiceId = id;
		invoiceItemService.cancelInvoice(invoiceId);
		return new ModelAndView("list-invoice", "invoices",
				invoiceItemService.getAllInvoice());

	}
	
	@RequestMapping(value = "/addInvoice" ,method=RequestMethod.POST)
	public ModelAndView addGrn(InvoiceItem invoiceItm, BindingResult result) {
		
		
		
		if (invoiceItm.getInvoiceID() > 0) {
			// update
			invoiceItemService.editInvoice(invoiceItm);
			
		} else {
			// add product
			invoiceItemService.createInvoice(invoiceItm);
			
		}
		ModelAndView modelAndView = new ModelAndView("list-invoice");
		modelAndView.addObject("invoices", invoiceItemService.getAllInvoice());
		System.out.println(invoiceItm.getInvoiceID());
		return modelAndView;
	}

}

	
	

