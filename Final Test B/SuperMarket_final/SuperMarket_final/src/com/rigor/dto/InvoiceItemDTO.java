package com.rigor.dto;

public class InvoiceItemDTO {
	
	private int InvoiceID;
	private int ItemID;
	private double Amount;
	
	public int getInvoiceID() {
		return InvoiceID;
	}
	public void setInvoiceID(int invoiceID) {
		InvoiceID = invoiceID;
	}
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
	

}
