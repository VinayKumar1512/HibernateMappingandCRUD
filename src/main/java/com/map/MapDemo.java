package com.map;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		// configuring hibernate to hibernate.cfg.xml file
		cfg.configure("hibernate.cfg.xml");

		// building session factory to perform save,delete operation on db
		// session factory is a interface so we created it's class obj
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Question q1 = new Question();
		q1.setQuestionId(101);
		q1.setQuestion("What is Java");
		
		Answer a1= new Answer();
		a1.setAnswerId(102);
		a1.setAnswer("Java is a Programming Language");
		a1.setQuestion(q1);
		
		Answer a2= new Answer();
		a2.setAnswerId(104);
		a2.setAnswer("General Purpose Language");
		a2.setQuestion(q1);
		
		Answer a3= new Answer();
		a3.setAnswerId(404);
		a3.setAnswer("Backend Language");
		a3.setQuestion(q1);
		
		List<Answer> list =new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswers(list);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		session.save(q1);
		

		tx.commit();

		session.close();
		
	}
}
