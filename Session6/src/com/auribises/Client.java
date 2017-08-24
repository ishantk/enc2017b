package com.auribises;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		// Traditional Way
		/*Employee e1 = new Employee();
		e1.setEid(101);
		e1.setName("John");
		e1.setSalary(50000);
		e1.setAddress("Country Homes");
		e1.setEmail("john@example.com");
		
		System.out.println("e1 is: "+e1);*/
		
		// Spring Way
		// Inversion of Control | IOC
		// Spring Core Container - BeanFactory
		
		//Resource resource = new ClassPathResource("employeebean.xml"); // Polymorphic Statement
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		// Spring Core Container - ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
//		Employee e1 = (Employee)factory.getBean("eRef1");
//		Employee e2 = factory.getBean("eRef2",Employee.class);
//		Employee e3 = factory.getBean("eRef1",Employee.class);
		
		/*Employee e1 = (Employee)context.getBean("eRef1");
		Employee e2 = context.getBean("eRef2",Employee.class);
		Employee e3 = context.getBean("eRef1",Employee.class);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);*/
		
		//Employee e1 = context.getBean("eRef1",Employee.class);
		//Employee e2 = context.getBean("eRef1",Employee.class);
		//System.out.println("e1: "+e1);
		//System.out.println("e2: "+e2);
		
		//Employee e1 = context.getBean("eRef1",Employee.class);
		//System.out.println("e1: "+e1);
		
		/*Parent p = context.getBean("pRef",Parent.class);
		System.out.println(p);
		
		Child c = context.getBean("cRef",Child.class);
		//System.out.println(c+" - "+c.getFname()+" - "+c.getLname()+" - "+c.getMoney());
		System.out.println(c);*/
		
//		Person p = context.getBean("pRef",Person.class);
//		System.out.println(p);
		
//		Manager mgr = context.getBean("mRef",Manager.class);
//		System.out.println(mgr);
//		
//		List<String> list = mgr.getCertificates();
//		for(String s : list){
//			System.out.println(s);
//		}
		
		CB cRef = context.getBean("cb",CB.class);
		
		cRef.getCa().sayHello("john watson");
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();

	}

}
