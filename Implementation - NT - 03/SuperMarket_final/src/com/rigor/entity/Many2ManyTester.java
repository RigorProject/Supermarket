package com.rigor.entity;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class Many2ManyTester {
	public static void main(String[] args) {
		// loads configuration and mappings
		Configuration configuration = new Configuration().configure();
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();

		// builds a session factory from the service registry
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);

		// obtains the session
		Session session = sessionFactory.openSession();
		session.beginTransaction();

//		testSaveAllNew(session);
//		testSaveWithExistingUserAndGroup(session);
		testDeleteUserGroup(session);
		

		session.getTransaction().commit();
		session.close();		
	}

	private static void testSaveAllNew(Session session) {
		User user = new User("sam", "mas", "sam@gmail.com");
		
		Group group = new Group("Designer");
		session.save(group);
		
		UserGroup userGroup = new UserGroup();
		userGroup.setGroup(group);
		userGroup.setUser(user);
		userGroup.setActivated(true);
		userGroup.setRegisteredDate(new Date());
		
		user.addUserGroup(userGroup);
		
		session.save(user);
	}
	
	private static void testSaveWithExistingUserAndGroup(Session session) {
		// this user is obtained from the database with ID 40
		User user = (User) session.get(User.class, new Long(40));

		// this group is obtained from the database with ID 26		
		Group group = (Group) session.get(Group.class, new Long(26));
		
		UserGroup userGroup = new UserGroup();
		userGroup.setGroup(group);
		userGroup.setUser(user);
		userGroup.setActivated(true);
		userGroup.setRegisteredDate(new Date());
				
		session.save(userGroup);		
	}
	
	private static void testDeleteUserGroup(Session session) {
		UserGroup userGroup = new UserGroup();
		
		User user = new User();
		user.setId(39);
		userGroup.setUser(user);
		
		Group group = new Group();
		group.setId(25);
		userGroup.setGroup(group);
		
		session.delete(userGroup);
	}
}
