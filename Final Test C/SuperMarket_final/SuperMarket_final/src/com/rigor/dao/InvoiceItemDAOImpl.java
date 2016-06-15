package com.rigor.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;

import org.springframework.stereotype.Repository;

import com.rigor.entity.InvoiceItem;
import com.rigor.util.HibernateUtility;

@Repository("invoiceItemDAO")
public class InvoiceItemDAOImpl implements InvoiceItemDAO {

	@Override
	public int createInvoice(InvoiceItem invoiceItem) {
		int saved=0;
		Session session = HibernateUtility.getSessionFactory().openSession();
		try{
		session.beginTransaction();
		 saved = (Integer) session.save(invoiceItem);
		
		session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			session.close();
		}
		return saved;
	}

	@Override
	public void searchInvoice(int id) {
		
		
	}

	@Override
	public void editInvoice(InvoiceItem invoiceItem) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(invoiceItem);
		session.getTransaction().commit();
		
	}

	@Override
	public void cancelInvoice(int id) {
		Session session = HibernateUtility.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();
		session.delete(findbyID(id));
		session.getTransaction().commit();
		
	}

	@Override
	public void setAmount(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InvoiceItem findbyID(int id) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		return (InvoiceItem) session.get(InvoiceItem.class, id);
		
	}

	@Override
	public List<InvoiceItem> findAll() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Criteria c=session.createCriteria(InvoiceItem.class);
		
		return c.list();
		
	}

	
	
	

	

}
