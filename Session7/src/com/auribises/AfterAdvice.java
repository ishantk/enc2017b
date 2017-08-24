package com.auribises;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("....After Executed....");

		// arg0 is having details of the method
		System.out.println("Method: "+arg1);
		
		//arg1 is input to the method
		for(Object o : arg2){
			System.out.println(o);
		}
		
		// arg2 is the reference variable pointing to the object
		System.out.println("arg0: "+arg0);
		System.out.println("arg3: "+arg3);
		
		System.out.println("Time2: "+new Date());
		
	}
}
