package com.auribises;

import java.util.Date;

// Web Service
public class MyWebService {

	// Web Methods
	public String sayHello(String name){
		String str = "Hello, "+name+"\nIts: "+new Date();
		return str;
	}
	
	public int dollarsToRupees(int dollar){
		int rupees = dollar*65;
		return rupees;
	}
	
	public String registerUser(String name, String phone, String email){
		// DB Operation
		String str = name+" Registered Succesfully";
		return str;
	}
}

