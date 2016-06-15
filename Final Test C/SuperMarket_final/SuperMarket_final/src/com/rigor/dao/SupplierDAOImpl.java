package com.rigor.dao;

/** 

* Data Access Object Interface Implementation for supplier. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This class making it easy to work with data access technologies like JDBC, Hibernate.
* basically help to perform CRUD operations.
* 
* @author MadhukaraK 
* 
* @version 1.0
* 
* @see see also SupplierDAOImpl.java

*/

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.rigor.entity.Supplier;
import com.rigor.util.HibernateUtility;

@Repository
public class SupplierDAOImpl implements SupplierDAO {
	
	public int save(Supplier supplier) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		int saved = (int) session.save(supplier);
		session.getTransaction().commit();
		return saved;
	}

	public void update(Supplier supplier) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(supplier);
		session.getTransaction().commit();
	}

	public Supplier findById(int id) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		return (Supplier) session.get(Supplier.class, id);
	}

	public List<Supplier> findAll() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Query query = session.createQuery("from Supplier s");
		return query.list();
	}

	public void deleteById(int id) {
		Session session = HibernateUtility.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();
		session.delete(findById(id));
		session.getTransaction().commit();

	}

}
