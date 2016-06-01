package com.rigor.service;


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