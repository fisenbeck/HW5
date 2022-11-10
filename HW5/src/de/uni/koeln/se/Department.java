package de.uni.koeln.se;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	
	private List<Course> courses;
	private ArrayList<Employee> employees;
	
	public Department (String name, List<Course> courses) {
		this.name = name;
		this.courses = courses;
	
	}
	
}
