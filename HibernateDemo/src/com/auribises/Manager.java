package com.auribises;

import java.util.List;

public class Manager {

	// Attributes
	Integer mid;
	String name;
	Integer salary;
	
	// One to Many
	List<Certificate> certificateList; // Has-A Relation

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public List<Certificate> getCertificateList() {
		return certificateList;
	}

	public void setCertificateList(List<Certificate> certificateList) {
		this.certificateList = certificateList;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", salary=" + salary + ", certificateList=" + certificateList
				+ "]";
	}
	
}
