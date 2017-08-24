package com.auribises;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;
//import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.validation.DataBinder;

public class BeforeAdvice implements MethodBeforeAdvice{

	
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		
		System.out.println("....Before Executed....");
		System.out.println("Time1: "+new Date());
		// arg0 is having details of the method
		System.out.println("Method: "+arg0);
		
		//arg1 is input to the method
		for(Object o : arg1){
			System.out.println(o);
		}
		
		// arg2 is the reference variable pointing to the object
		System.out.println("arg2: "+arg2);
		
	}

}
