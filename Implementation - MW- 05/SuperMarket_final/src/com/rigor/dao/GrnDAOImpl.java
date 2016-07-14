package com.rigor.dao;
/** 

* Data Access Object Interface Implementation for grn. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This class making it easy to work with data access technologies like JDBC, Hibernate.
* basically help to perform CRUD operations.
* 
* @author Madushika
* 
* 
* @version 1.0
* 
* @see see also GrnDAOImpl.java

*/
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;

//import javax.management.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.rigor.entity.Grn;
import com.rigor.util.HibernateUtility;

@Repository
public class GrnDAOImpl implements GrnDAO {

	
	public GrnDAOImpl() {
		
	}
	/**
	 * Use to establish connection with database and commit the changes(save)
	 * into database .
	 * 
	 */
	public int save(Grn grn) {
		
	 Session session = HibernateUtility.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			int saved = (Integer) session.save(grn);
			session.getTransaction().commit();
			return saved;
			
		} catch (HibernateException e) {
			try {
				session.getTransaction().rollback();
			} catch (RuntimeException e2) {
				System.out.println("Couldn’t roll back transaction"+e2);
			}
			throw e;
		}finally {
			session.close();
		}
	}
	/**
	 * Use to establish connection with database and commit the changes(update)
	 * into database .
	 * 
	 */
	public void update(Grn grn) {
		 Session session = HibernateUtility.getSessionFactory().openSession();
			try {
				session.beginTransaction();
				session.update(grn);
				session.getTransaction().commit();
				
			} catch (HibernateException e) {
				try {
					session.getTransaction().rollback();
				} catch (RuntimeException e2) {
					System.out.println("Couldn’t roll back transaction"+e2);
				}
				throw e;
			}finally {
				session.close();
			}
	}
	/**
	 * Use to establish connection with database and retrieve data from database
	 * for given id .
	 * 
	 */
	public Grn findById(int id) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		try {
			return (Grn) session.get(Grn.class, id);
		} catch (HibernateException e) {
			try {
				session.getTransaction().rollback();
			} catch (RuntimeException e2) {
				System.out.println("Couldn’t roll back transaction"+e2);
			}
			throw e;
		}finally {
			session.close();
			findAll();
		}
	}

	/**
	 * Use to establish connection with database and retrieve all data in a
	 * given table for given id .
	 * 
	 */
	public List<Grn> findAll() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		try {
			
			Query query = session.createQuery("from Grn g");
			return query.list();
				
		} catch (HibernateException e) {
			try {
				session.getTransaction().rollback();
			} catch (RuntimeException e2) {
				System.out.println("Couldn’t roll back transaction"+e2);
			}
			throw e;
		
		}
		
	}
	/**
	 * Use to establish connection with database and delete item in a
	 * given table for given id .
	 * 
	 */
	public void deleteById(int id) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.delete(findById(id));
			session.getTransaction().commit();
			
			findAll();
			
		} catch (HibernateException e) {
			try {
				session.getTransaction().rollback();
			} catch (RuntimeException e2) {
				System.out.println("Couldn’t roll back transaction"+e2);
			}
			throw e;
		}finally {
		
			session.close();
		}

	}

}
