package com.rigor.dao;

import java.util.List;

import org.hibernate.Criteria;
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

	public int save(Grn grn) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		int saved = (int) session.save(grn);
		
		session.getTransaction().commit();
		return saved;
	}
	
	public void update(Grn grn) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(grn);
		session.getTransaction().commit();
	}
	
	public Grn findById(int id) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		return (Grn) session.get(Grn.class, id);
	}

	
	public List<Grn> findAll() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Criteria c=session.createCriteria(Grn.class);
		return c.list();
		
	}
	public void deleteById(int id) {
		Session session = HibernateUtility.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();
		session.delete(findById(id));
		session.getTransaction().commit();

	}

}
