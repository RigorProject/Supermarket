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
public int getInvoiceID() {
	return InvoiceID;
}
public void setInvoiceID(int invoiceID) {
	InvoiceID = invoiceID;
}

}
