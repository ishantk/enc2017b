package com.auribises;

// BEAN
public class Employee {
	
	// Attributes | Property
	int eid;
	String name;
	int salary;
	String address;
	String email;
	
	public Employee(){
		System.out.println("--Employee Object Constructed--");
	}
	
	// myInit/myDestroy can be any name of your choice
	public void myInit(){
		System.out.println("--myInit Executed--");
	}
	
	public void myDestroy(){
		System.out.println("--myDestroy Executed--");
	}
	
	// Getters and Setters
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", address=" + address + ", email="
				+ email + "]\n"+super.toString();
	}
	
}
