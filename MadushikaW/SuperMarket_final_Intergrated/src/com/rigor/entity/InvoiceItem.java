package com.rigor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoiceItem")
public class InvoiceItem {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int InvoiceID;
private double Amount;
@Column(name="Item_ID")
private int ItemID;



public int createInvoice(InvoiceItem invoiceItem) {
	return InvoiceID;
}
public void searchInvoice(int invoiceID) {
	InvoiceID = invoiceID;
}

public void editInvoice(InvoiceItem invoiceItem) {
	
}
public double getAmount() {
	return Amount;
}
public void setAmount(double amount) {
	Amount = amount;
}
public int getItemID() {
	return ItemID;
}
public void setItemID(int itemID) {
	ItemID = itemID;
}


}
