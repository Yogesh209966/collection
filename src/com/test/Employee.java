package com.test;

public class Employee {
	
	int id;
	String name;
	String Salary;
	public Employee(int id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
	
	
}