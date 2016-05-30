package com.rigor.dao;

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