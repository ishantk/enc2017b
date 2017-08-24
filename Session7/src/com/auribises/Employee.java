package com.auribises;

// Bean
public class Employee {

	// Attributes
	int id;
	String name;
	int salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public void saveEmployee(int type){
		// JDBC / Hibernate Code
		//..
		//..
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(type == 1)
			System.out.println(name+" saved in the DB as Permanent Employee");
		else
			System.out.println(name+" saved in the DB as Contract Employee");
	}
	
}
