package com.rigor.dao;

/** 

* Data Access Object Interface Implementation for product. 
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

import org.hibernate.Query;
import org.hibernate.Session;
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
	public int save(Product product) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		int saved = (Integer) session.save(product);
		session.getTransaction().commit();
		return saved;
	}

	/**
	 * Use to establish connection with database and commit the changes(update)
	 * into database .
	 * 
	 */
	public void update(Product product) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(product);
		session.getTransaction().commit();
	}

	/**
	 * Use to establish connection with database and retrieve data from database
	 * for given id .
	 * 
	 */
	public Product findById(int id) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		return (Product) session.get(Product.class, id);
	}

	/**
	 * Use to establish connection with database and retrieve all data in a
	 * given table for given id .
	 * 
	 */
	public List<Product> findAll() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Query query = session.createQuery("from Product p");
		return query.list();
	}

	/**
	 * Use to establish connection with database and delete item in a
	 * given table for given id .
	 * 
	 */
	public void deleteById(int id) {
		Session session = HibernateUtility.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(findById(id));
		session.getTransaction().commit();

	}
}
