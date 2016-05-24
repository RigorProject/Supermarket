package com.rigor.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.rigor.entity.InvoiceItem;
import com.rigor.util.HibernateUtility;

@Repository("invoiceItemDAO")
public class InvoiceItemDAOImpl implements InvoiceItemDAO {

	@Override
	public int createInvoice(InvoiceItem invoiceItem) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		int saved = (Integer) session.save(invoiceItem);
		session.getTransaction().commit();
		return saved;
	}

	@Override
	public void searchInvoice(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editInvoice(InvoiceItem invoiceItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelInvoice(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAmount(double amount) {
		// TODO Auto-generated method stub
		
	}

	

}
