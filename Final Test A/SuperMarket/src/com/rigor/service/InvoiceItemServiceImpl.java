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

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rigor.dao.InvoiceItemDAO;
import com.rigor.dto.InvoiceItemDTO;
import com.rigor.entity.InvoiceItem;


@Service("invoiceItemService")
public class InvoiceItemServiceImpl implements InvoiceItemService {
	@Autowired
	private InvoiceItemDAO invoiceItemDAO;

	@Override
	public int createInvoice(InvoiceItemDTO invoiceItemDTO) {
		
			InvoiceItem invoice = new InvoiceItem();
			BeanUtils.copyProperties(invoiceItemDTO, invoice); //Utility methods for populating JavaBeans properties via reflection.
			invoiceItemDAO.createInvoice(invoice);
		

		return 0;
	}

	@Override
	public void searchInvoice(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editInvoice(InvoiceItemDTO invoiceItemDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelInvoice(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
