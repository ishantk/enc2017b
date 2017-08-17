package com.auribises;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.dialect.MySQLDialect;

public class Client {

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		
		s1.setName("Harry");
		s1.setAge(31);
		s1.setPhone("999999888");
		s1.setAddress("Country Homes West");
		
		Student s2 = new Student();
		
		s2.setName("Kim");
		s2.setAge(29);
		s2.setPhone("888888888");
		s2.setAddress("Country Homes SouthEast");
		
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
			
			// Inserting the data within the object into the table
			//session.save(s1); 
			//session.save(s2);
			
			// Retrieve Operation - Retrieve Single Record
			//Student s = (Student)session.get(Student.class, 3);
			//System.out.println(s);
			
			
			// Update Operation 
			//Student s = new Student();
			//s.setRoll(1);
			
			//s.setName("John JJ");
			//s.setAge(31);
			//s.setPhone("555555555");
			
			//session.update(s);
			
			// Delete Operation 
			//session.delete(s);
			
			// Retrieve All
			//String hql = "From Student";
			/*String hql = "From Student where age > 25";
			List<Student> list = session.createQuery(hql).list();
			
			for(Student s : list){
				System.out.println(s);
				System.out.println("---------------------------------------------------------------------");
			}*/
			
			Criteria criteria = session.createCriteria(Student.class);
			criteria.add(Restrictions.gt("age", 29));
			
			List<Student> list = criteria.list();
			
			for(Student s : list){
				System.out.println(s);
				System.out.println("---------------------------------------------------------------------");
			}
			
			transaction.commit();
			System.out.println("--Transaction Finished--");
			
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
			e.printStackTrace();
			transaction.rollback();
		}finally {
			session.close();
		}

	}

}
