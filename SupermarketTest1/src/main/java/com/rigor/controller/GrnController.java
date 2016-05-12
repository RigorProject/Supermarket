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


import com.rigor.entity.Grn;
import com.rigor.service.GrnService;

@Controller
@RequestMapping("/")
public class GrnController {
	private List<Grn> grnList = new ArrayList<>();
	
	@Autowired
	private GrnService grnService;
	
	@RequestMapping(value = "/listGrn", method = RequestMethod.GET)
	public ModelAndView placeGrn() {
		return new ModelAndView("place-grn", "grns", grnService.getAllGrn());
		

	}
	
	
	@RequestMapping(value = "modifyGrn")
	public ModelAndView modifyGrn(Grn grnDTO,
			BindingResult result) {

		return new ModelAndView("place-grn");

	}
	@RequestMapping(value = "/editGrn", method = RequestMethod.GET)
	public String editPage(ModelMap modelMap, HttpServletRequest request) {
		int grnId = Integer.parseInt(request.getParameter("id"));
		modelMap.addAttribute("grn", grnService.getGrn(grnId));
		modelMap.addAttribute("update", true);
		return "place-grn";
	}
	
	@RequestMapping(value = "/deleteGrn", method = RequestMethod.GET)
	public ModelAndView deleteProduct(HttpServletRequest request) {
		int grnId = Integer.parseInt(request.getParameter("id"));
		grnService.deleteGrn(grnId);
		return new ModelAndView("place-grn", "grns",
				grnService.getAllGrn());

	}

	@RequestMapping(value = "/addGrn", method = RequestMethod.POST)
	public ModelAndView addGrn(Grn grnDTO, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("place-grn");
		if (grnDTO.getGrnID() > 0) {
			// update
			grnService.update(grnDTO);
		} else {
			// add product
			grnService.saveGrn(grnDTO);
		}
		modelAndView.addObject("grns", new Grn());
		System.out.println(grnDTO.getGrnID());
		return modelAndView;
	}
	@RequestMapping(value = "/addGrn", method = RequestMethod.GET)
	public String addGrn(ModelMap modelMap) {
		modelMap.addAttribute("grns", new Grn());
		//modelMap.addAttribute("update", false);
		return "place-grn";

	}

}
