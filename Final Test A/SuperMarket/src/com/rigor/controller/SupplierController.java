package com.rigor.controller;

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

import com.rigor.dto.SupplierDTO;
import com.rigor.service.SupplierService;

@Controller
public class SupplierController {
	private List<SupplierDTO> supplireList = new ArrayList<>();

	@Autowired
	private SupplierService supplierService;

	@RequestMapping(value = "/listSupplier.htm", method = RequestMethod.GET)
	public ModelAndView listSupplier() {
		return new ModelAndView("list-supplier", "suppliers",
				supplierService.getAllSuppliers());
	}

//	@RequestMapping(value = "/getSup", method = RequestMethod.GET)
//	public List<SupplierDTO> getSup() {
//		return supplierService.getAllSuppliers();
//	}
	
	@RequestMapping(value = "/supplier", method = RequestMethod.GET)
	public String addSupplier(ModelMap modelMap) {
		modelMap.addAttribute("supplier", new SupplierDTO());
		modelMap.addAttribute("update", false);
		return "create-supplier";

	}

	@RequestMapping(value = "modifySupplier")
	public ModelAndView modifySupplier(SupplierDTO supplierDTO,
			BindingResult result) {

		return new ModelAndView("list-supplier");

	}

	@RequestMapping(value = "/editSupplier", method = RequestMethod.GET)
	public String editPage(ModelMap modelMap, HttpServletRequest request) {
		int supplierId = Integer.parseInt(request.getParameter("id"));
		modelMap.addAttribute("supplire", supplierService.getSupplier(supplierId));
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

	@RequestMapping("/addSupplier.htm")
	public ModelAndView addSupplier(SupplierDTO supplierDTO, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("list-supplier");
		if (supplierDTO.getSupplierId() > 0) {
			// update
			supplierService.update(supplierDTO);
		} else {
			// add product
			supplierService.saveSupplier(supplierDTO);
		}
		modelAndView.addObject("suppliers", supplierService.getAllSuppliers());
		System.out.println(supplierDTO.getSupplierId());
		return modelAndView;
	}

}
