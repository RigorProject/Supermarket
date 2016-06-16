package com.rigor.dao;
/* Data Access Object Interface for InvoiceItem.



 * 
 * Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
 * 
 * This is the interface uses to work with data access technologies like JDBC, Hibernate
 * 
 * @author Madara Dayananda
 * 
 * @version 1.0
 * 
 * @see also InvoiceItem.java,
 * InvoiceItemDAOImpl.java,
 * InvoiceItemService.java,
 * InvoiceItemServiceImpl.java,InvoiceItemController.java classes
 * */

import java.util.List;

import com.rigor.entity.InvoiceItem;

public interface InvoiceItemDAO {

	public int createInvoice(InvoiceItem invoiceItem);
	public void searchInvoice(int id);
	public void editInvoice(InvoiceItem invoiceItem);
	public void cancelInvoice(int id);
	public void setAmount(double amount);
	public InvoiceItem findbyID(int id) ;
	public List<InvoiceItem> findAll();
	
}