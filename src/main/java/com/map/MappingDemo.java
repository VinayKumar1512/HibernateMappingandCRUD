package com.map;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		// configuring hibernate to hibernate.cfg.xml file
		cfg.configure("hibernate.cfg.xml");

		// building session factory to perform save,delete operation on db
		// session factory is a interface so we created it's class obj
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Emp e1= new Emp();
		Emp e2= new Emp();
		
		e1.setEid(23);
		e2.setEid(34);
		
		e1.setName("Ram");
		e2.setName("Shayam");
		
		
		Project p1= new Project();
		Project p2= new Project();
		
		p1.setPid(35);
		p2.setPid(33);
		p1.setProjectName("User Mangaement");
		p2.setProjectName("CRud operations");
		
		
		List<Emp> elist =new ArrayList<Emp>();
		List<Project> plist= new ArrayList<Project>();
		
		elist.add(e1);
		elist.add(e2);
		
		plist.add(p1);
		plist.add(p2);
		
		e1.setList(plist);
		
		p2.setList(elist);
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		

		tx.commit();

		session.close();
	}
}
