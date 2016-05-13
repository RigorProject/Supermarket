package com.rigor.controller;

/** 

* Controller Class for Product. 
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rigor.dto.ProductDTO;
import com.rigor.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {

	private List<ProductDTO> productList = new ArrayList();

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/listProduct", method = RequestMethod.GET)
	public ModelAndView listProduct() {
		return new ModelAndView("list-product", "products",
				productService.getAllProducts());

	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String addProduct(ModelMap modelMap) {
		modelMap.addAttribute("product", new ProductDTO());
		modelMap.addAttribute("update", false);
		return "create-product";

	}

	@RequestMapping(value = "modifyProduct")
	public ModelAndView modifyProduct(ProductDTO productDTO,
			BindingResult result) {

		return new ModelAndView("list-product");

	}

	@RequestMapping(value = "/editProduct", method = RequestMethod.GET)
	public String editPage(ModelMap modelMap, HttpServletRequest request) {
		int productId = Integer.parseInt(request.getParameter("id"));
		modelMap.addAttribute("product", productService.getProduct(productId));
		modelMap.addAttribute("update", true);
		return "create-product";
	}

	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
	public ModelAndView deleteProduct(HttpServletRequest request) {
		int productId = Integer.parseInt(request.getParameter("id"));
		productService.deleteProduct(productId);
		return new ModelAndView("list-product", "products",
				productService.getAllProducts());

	}

	@RequestMapping(value = "/addProduct")
	public ModelAndView addProduct(ProductDTO productDTO, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("list-product");
		if (productDTO.getProductId() > 0) {
			// update
			productService.update(productDTO);
		} else {
			// add product
			productService.saveProduct(productDTO);
		}
		modelAndView.addObject("products", productService.getAllProducts());
		System.out.println(productDTO.getProductId());
		return modelAndView;
	}

}
