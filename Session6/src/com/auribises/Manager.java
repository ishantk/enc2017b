package com.auribises;

import java.util.List;

public class Manager {
	
	// Attributes
	int mid;
	String email;
	int salary;
	List<String> certificates; // HAS-A Relation | One to Many
	//List<Employee> empList;
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<String> getCertificates() {
		return certificates;
	}
	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}
	
	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", email=" + email + ", salary=" + salary + ", certificates=" + certificates
				+ "]";
	}
}
