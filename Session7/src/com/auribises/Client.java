package com.auribises;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e = context.getBean("empProxy",Employee.class);
		e.saveEmployee(2);
	}

}
