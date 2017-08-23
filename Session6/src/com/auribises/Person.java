package com.auribises;

public class Person {

	//Attributes
	String name;
	int age;
	String email;
	
	Address adrs; // Has - A Relation

	public Person() {
		
	}
	
	// Constructor for Constructor Injection
	public Person(Address adrs) {
		this.adrs = adrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAdrs() {
		return adrs;
	}

	// Setter for Setter Injection
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", adrs=" + adrs + "]";
	}
	
	
}
