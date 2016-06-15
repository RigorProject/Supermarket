package com.rigor.dao;

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
