package com.rigor.dao;

/** 

* Data Access Object Interface Implementation for product. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This class making it easy to work with data access technologies like JDBC, Hibernate.
* basically help to perform CRUD operations.
* 
* @author Nadeesha 
* 
* @version 1.0
* 
* @see see also ProductDAOImpl.java

*/
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import com.rigor.entity.Product;
import com.rigor.util.HibernateUtility;

@Repository
public class ProductDAOImpl implements ProductDAO {

	/**
	 * Use to establish connection with database and commit the changes(save)
	 * into database .
	 * 
	 */
	private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);
	public int save(Product product) {

	    Session session = HibernateUtility.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			int saved = (Integer) session.save(product);
			session.getTransaction().commit();
			logger.info("Product save successfully, Product Details="+product);
			return saved;
			
		} catch (HibernateException e) {
			try {
				session.getTransaction().rollback();
				logger.info("Transaction successfuly roll back, Product ID"+product);
			} catch (RuntimeException e2) {
				 logger.error("Couldn’t roll back transaction"+e2);
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
	public void update(Product product) {
		
	    Session session = HibernateUtility.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.update(product);
			session.getTransaction().commit();
			logger.info("Product updated successfully, Product Details="+product);
			
		} catch (HibernateException e) {
			try {
				session.getTransaction().rollback();
				logger.info("Transaction successfuly roll back, Product ID"+product);
			} catch (RuntimeException e2) {
				logger.error("Couldn’t roll back transaction"+e2);
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
	public Product findById(int id) {

	    Session session = HibernateUtility.getSessionFactory().openSession();
		try {
		    return (Product) session.get(Product.class, id);
			
		} catch (HibernateException e) {
			try {
				session.getTransaction().rollback();
				logger.info("Transaction successfuly roll back, Product ID"+id);
			} catch (RuntimeException e2) {
				logger.error("Couldn’t roll back transaction"+e2);
			}
			throw e;
		}finally {
			session.close();
		}
	}

	/**
	 * Use to establish connection with database and retrieve all data in a
	 * given table for given id .
	 * 
	 */
	public List<Product> findAll() {
	    Session session = HibernateUtility.getSessionFactory().openSession();
		try {
		    Query query = session.createQuery("from Product p");
		    List<Product> queryList = query.list();
		    for(Product p:queryList){
		    	logger.info("Person List"+p);
		    }
		    
			return query.list();
			
		} catch (HibernateException e) {
			try {
				session.getTransaction().rollback();
				logger.info("Transaction successfuly roll back");
			} catch (RuntimeException e2) {
				logger.error("Couldn’t roll back transaction"+e2);
			}
			throw e;
			
		}
		
	}

	/**
	 * Use to establish connection with database and delete item in a
	 * given table for given id .
	 * 
	 */
	
	// This function should change to check the utilization of product and add option to change the state of the product
	public void deleteById(int id) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.delete(findById(id));
			session.getTransaction().commit();
			logger.info("Product disabled successfully, Product ID="+id);
			
			findAll();
			
		} catch (HibernateException e) {
			try {
				session.getTransaction().rollback();
				logger.info("Transaction successfuly roll back: Product ID"+id);
			} catch (RuntimeException e2) {
				logger.error("Couldn’t roll back transaction"+e2);
			}
			throw e;
		}finally {
			session.close();
		}

	}
}
