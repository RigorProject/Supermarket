package com.rigor.service;
/** 

* Product Service Interface for product. 
* Basically help to perform CRUD operations with the help of ProductDAO
* 
* @author Nadeesha 
* 
* @version 1.0
* 
* @see see also ProductDAOImpl.java, ProductDAO.java, ProductServiceImpl

*/
import java.util.List;

import com.rigor.dto.ProductDTO;

public interface ProductService {
	public void saveProduct(ProductDTO productDTO);
	public void update(ProductDTO productDTO);
	public ProductDTO getProduct(int id);
	public void deleteProduct(int id);
	public List<ProductDTO> getAllProducts();
}
