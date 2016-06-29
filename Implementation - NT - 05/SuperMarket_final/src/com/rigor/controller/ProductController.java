package com.rigor.controller;

/** 

* Controller Class for Product. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This class is the controller class for Product.It prepares data,create a java object to 
* hold the data
* 
* @autho Nadeesha 
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rigor.entity.Product;
import com.rigor.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {

	private List<Product> productList = new ArrayList();

	@Autowired
	private ProductService productService;
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	/**
	 * This method will list all existing products.
	 */

	@RequestMapping(value = "/listProduct", method = RequestMethod.GET)
	public ModelAndView listProduct() {

		String task = "Loading listProduct()  request mapping ";
		logger.info("Hello from productController.");
		logger.debug("Inside {}.", task);

		return new ModelAndView("list-product", "products", productService.getAllProducts());

	}

	/**
	 * This method will provide the medium to add a new product.
	 */
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String addProduct(ModelMap modelMap) {
		
		String task = "Loading addProduct()  request mapping ";
		logger.info("Hello from productController.");
		logger.debug("Inside {}.", task);
		
		modelMap.addAttribute("product", new Product());
		modelMap.addAttribute("update", false);
		return "create-product";

	}

	@RequestMapping(value = "modifyProduct")
	public ModelAndView modifyProduct(Product product, BindingResult result) {
		
		String task = "Loading modifyProduct()  request mapping ";
		logger.info("Hello from productController.");
		logger.debug("Inside {}.", task);
		
		return new ModelAndView("list-product");
	}

	@RequestMapping(value = "/editProduct", method = RequestMethod.GET)
	public String editPage(ModelMap modelMap, HttpServletRequest request) {
		
		String task = "Loading editPage()  request mapping ";
		logger.info("Hello from productController.");
		logger.debug("Inside {}.", task);
		
		int productId = Integer.parseInt(request.getParameter("id"));
		modelMap.addAttribute("product", productService.getProduct(productId));
		modelMap.addAttribute("update", true);
		return "create-product";
	}

	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
	public ModelAndView deleteProduct(HttpServletRequest request) {
		
		String task = "Loading deleteProduct()  request mapping ";
		logger.info("Hello from productController.");
		logger.debug("Inside {}.", task);
		
		int productId = Integer.parseInt(request.getParameter("id"));
		productService.deleteProduct(productId);
		return new ModelAndView("list-product", "products", productService.getAllProducts());

	}

	 
	@RequestMapping(value = "/addProduct")
	public ModelAndView addProduct(Product product, BindingResult result) {
		
		String task = "Loading addProduct()  request mapping ";
		logger.info("Hello from productController.");
		logger.debug("Inside {}.", task);
		
		ModelAndView modelAndView = new ModelAndView("list-product");
		if (product.getProductId() > 0) {
			// update
			logger.debug("Updating {}.", product.getProductId());
			productService.update(product);
		} else {
			// add product
			logger.debug("add Product {}.", product.getProductId());
			productService.saveProduct(product);
		}
		modelAndView.addObject("products", productService.getAllProducts());
		System.out.println(product.getProductId());
		return modelAndView;
	}

}
