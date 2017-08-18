package com.auribises;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneClient {

	public static void main(String[] args) {
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		Person pRef = new Person();
		pRef.setName("Jennie Watson");
		pRef.setAge(28);
		pRef.setPhone("988888888");
		
		Address aRef = new Address();
		aRef.setAdrsLine("Country Homes North");
		aRef.setCity("Ludhiana");
		aRef.setState("Punjab");
		aRef.setZipCode(141002);
		
		pRef.setAddress(aRef);
		aRef.setPerson(pRef);
		
		
		try {
			
			config = new Configuration();
			config.configure();
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			session.save(pRef);
			
			transaction.commit();
			System.out.println("Transaction Finished....");
			
			
		} catch (Exception e) {
			System.out.println("Some Exception : "+e);
			e.printStackTrace();
			transaction.rollback();
		}finally {
			if(session!=null)
				session.close();
		}
		

	}

}
