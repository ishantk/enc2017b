package com.auribises;

// POJO/Bean/Model
public class Student {
	
	// Attributes
	Integer roll;
	String name;
	Integer age;
	String phone;
	String address;
	
	
	// Constructors
	public Student() {
		
	}
	
	public Student(Integer roll, String name, Integer age, String phone, String address) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	// Getters and Setters (Mutators and Accessors)
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
}
