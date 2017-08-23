package com.auribises;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String str) throws BeansException {
		System.out.println("--postProcessAfterInitialization--");
		System.out.println("bean is: "+bean);
		
		Employee e = (Employee)bean; // Downcasting
		
		System.out.println("str is: "+str);
		System.out.println("-----------------------------------");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String str) throws BeansException {
		System.out.println("--postProcessBeforeInitialization--");
		System.out.println("bean is: "+bean);
		System.out.println("str is: "+str);
		System.out.println("-----------------------------------");
		return bean;
	}

}
