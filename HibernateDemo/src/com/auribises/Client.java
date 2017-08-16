package com.auribises;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		
		s1.setName("John Watson");
		s1.setAge(24);
		s1.setPhone("9999999999");
		s1.setAddress("Country Homes");
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Reads hibernate.cfg.xml file
			//config.configure("anyname.xml"); // Reads anyname.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			session.save(s1); // Inserting the data within the object into the table
			
			transaction.commit();
			System.out.println("--Transaction Finished--");
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
			e.printStackTrace();
		}

	}

}
