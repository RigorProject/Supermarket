package com.rigor.service;


import com.rigor.dto.InvoiceItemDTO;


public interface InvoiceItemService {
	
	public int createInvoice(InvoiceItemDTO invoiceItemDTO);
	public void searchInvoice(int id);
	public void editInvoice(InvoiceItemDTO invoiceItemDTO);
	public void cancelInvoice(int id);

}