package com.rigor.util;
/** 

* Convenience class to get an instance of the Hibernate Session Factory. 
* 
* Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
* 
* This class is creating sessionFactory object using the configurations in hibernate.cfg.xml
* Help to create basic interface between java application and hibernate
* 
* @author Nadeesha 
* 
* @version 1.0
* 

*/

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtility {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		// Create the SessionFactory from hibernate.cfg.xml
		Configuration configuration = new Configuration();
		configuration.configure();

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}

	/** 
	* Use to return sessionFactory to perform tasks in productDAO - Establish connection wth database and perform CRUD. 
	* 
	*/ 
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
