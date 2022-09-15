package com.tut.MavenProject;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	//CRUD Operations Hibernate
	public static void main(String[] args) throws Exception{
		// created configuraton class object for confugration
		Configuration cfg = new Configuration();
		// configuring hiberante to hibernate.cfg.xml file
		cfg.configure("hibernate.cfg.xml");

		// building session factory to perform save,delete operation on db
		// session factory is a interface so we created it's class obj
		SessionFactory factory = cfg.buildSessionFactory();

//    	System.out.println(factory);
//    	System.out.println(factory.isClosed());
//
		Student st = new Student();
		st.setId(103);
		st.setName("Vinay Kumar");
		st.setCity("Himachal Pradesh");
//		
//		Address address= new Address();
//		address.setCity("London");
//		address.setStreet("California");
//		address.setOpen(true);
//		address.setAddedDate(new Date());
//		address.setX(52.0);
		
//		FileInputStream fs= new FileInputStream("src/main/java/Image.png");
//		byte[] data= new byte[fs.available()];
//		address.setImage(data);
		

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//read operation
//		Student student = session.get(Student.class, 102);
		
		//create operation or insert data
		session.save(st);
//		session.save(address);
		//update operation 
		
//		student.setName("Vinay Kumar Shiontra");
//		session.saveOrUpdate(student);
		
		//delete opeartion
//		session.delete(student);
//		System.out.println(student.getCity());
//		System.out.println(student.getName());
		tx.commit();

		session.close();
//		fs.close();
	}
}
