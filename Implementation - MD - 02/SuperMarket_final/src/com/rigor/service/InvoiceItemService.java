package com.rigor.service;
/** 

* InvoiceItemService interface for InvoiceItem. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* Basically help to perform CRUD operations with the help of InvoiceItemDAO
* 
* @author Madara Dayananda
* 
* @version 1.0
* 
* @see @see also InvoiceItemDAO.java,
 * InvoiceItemDAOImpl.java,
 * InvoiceItemServiceImpl.java,InvoiceItemController.java classes

*/


import java.util.List;

import com.rigor.entity.InvoiceItem;


public interface InvoiceItemService {
	
	public void createInvoice(InvoiceItem invoiceItem);
	public void searchInvoice(int id);
	public void editInvoice(InvoiceItem invoiceItemDTO);
	public void cancelInvoice(int id);
	public List<InvoiceItem> getAllInvoice();
	public InvoiceItem getInvoice(int id);
	
	
	

}