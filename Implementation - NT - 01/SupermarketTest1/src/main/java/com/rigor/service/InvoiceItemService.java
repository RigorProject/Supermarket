package com.rigor.service;


import com.rigor.entity.InvoiceItem;


public interface InvoiceItemService {
	
	public void createInvoice(InvoiceItem invoiceItem);
	public void searchInvoice(int id);
	public void editInvoice(InvoiceItem invoiceItemDTO);
	public void cancelInvoice(int id);

}