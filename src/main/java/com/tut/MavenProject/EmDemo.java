package com.tut.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		// configuring hibernate to hibernate.cfg.xml file
		cfg.configure("hibernate.cfg.xml");

		// building session factory to perform save,delete operation on db
		// session factory is a interface so we created it's class obj
		SessionFactory factory = cfg.buildSessionFactory();
		
		Student st =new Student();
		st.setId(106);
		st.setName("Spring Boot");
		st.setCity("Kangra");
		
		Certificate cert= new Certificate();
		cert.setCourse("Hibernate");
		cert.setDuration("2.5 months");
		st.setCert(cert);
		

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	
		session.save(st);

		tx.commit();

		session.close();
	}

}
