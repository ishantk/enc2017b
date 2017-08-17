package com.auribises;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AnnotationClient {

	public static void main(String[] args) {
		
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		Employee emp1 = new Employee();
		emp1.setEname("John");
		emp1.setEsalary(50000);
		
		Employee emp2 = new Employee();
		emp2.setEname("Jennie");
		emp2.setEsalary(70000);
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure();
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			session.save(emp1);
			session.save(emp2);
			
			transaction.commit();
			System.out.println("Transaction Finished...");
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
			e.printStackTrace();
			
			transaction.rollback();
		}finally{
			session.close();
		}
		

	}

}
