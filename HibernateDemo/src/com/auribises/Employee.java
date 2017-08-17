package com.auribises;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id @GeneratedValue
	@Column(name="EID")
	Integer eid;
	
	@Column(name="ENAME")
	String ename;
	
	@Column(name="ESALARY")
	Integer esalary;
	
	public Employee(){
		
	}
	
	public Employee(Integer eid, String ename, Integer esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEsalary() {
		return esalary;
	}

	public void setEsalary(Integer esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
}
