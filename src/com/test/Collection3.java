package com.test;

import java.util.ArrayList;

public class Collection3 {
	public static void main (String[] args) {
	ArrayList<Employee> al=new ArrayList<Employee>();
	
	al.add(new Employee(10,"pune","25000"));
	
	for(Employee e:al) {
		System.out.println(e);
	}

}
}