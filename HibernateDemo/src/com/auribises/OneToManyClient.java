package com.auribises;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyClient {

	public static void main(String[] args) {
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
	
		
		Manager mRef = new Manager();
		mRef.setName("Jennie Watson");
		mRef.setSalary(40000);
		
		
		Certificate c1 = new Certificate();
		c1.setCname("OCJP");
		
		Certificate c2 = new Certificate();
		c2.setCname("OCWD");
		
		
		ArrayList<Certificate> certificateList = new ArrayList<>();
		certificateList.add(c1); //0
		certificateList.add(c2); //1
		//certificateList.add(c3); //2
		
		mRef.setCertificateList(certificateList);
		
		
		try {
			
			config = new Configuration();
			config.configure();
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			session.save(mRef);
			
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
