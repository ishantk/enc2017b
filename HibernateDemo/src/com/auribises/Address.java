package com.auribises;

public class Address {
	
	Integer aid;
	String adrsLine;
	String city;
	String state;
	Integer zipCode;
	
	// One Address has One Person
	Person person; // Has-A
	
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAdrsLine() {
		return adrsLine;
	}
	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", adrsLine=" + adrsLine + ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + ", person=" + person + "]";
	}
}
