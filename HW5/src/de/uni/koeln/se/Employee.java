package de.uni.koeln.se;

import java.util.ArrayList;

public class Employee {

	private String name;
	private int employeeld;
	
	private Department department;
	
	
	public Employee(String name, int employeeld, Department department) {
		this.name = name;
		this.employeeld = employeeld;
		this.department = department;
		
	}
}
