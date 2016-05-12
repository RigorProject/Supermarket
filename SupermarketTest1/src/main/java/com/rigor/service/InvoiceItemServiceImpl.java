package com.rigor.service;
/** 

* Product Service  Implementation for product. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* Basically help to perform CRUD operations with the help of ProductDAO
* 
* @author Nadeesha 
* 
* @version 1.0
* 
* @see see also ProductDAOImpl.java, ProductDAO.java, ProductServiceImpl.java

*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rigor.dao.InvoiceItemDAO;
import com.rigor.entity.InvoiceItem;

@Service("invoiceItemService")
public class InvoiceItemServiceImpl implements InvoiceItemService {
	@Autowired
	private InvoiceItemDAO invoiceItemDAO;

	public void createInvoice(InvoiceItem invoiceItem) {

		
		invoiceItemDAO.createInvoice(invoiceItem);
		
	}

	@Override
	public void searchInvoice(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editInvoice(InvoiceItem invoiceItemDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelInvoice(int id) {
		// TODO Auto-generated method stub

	}

}
