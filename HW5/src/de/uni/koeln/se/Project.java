package de.uni.koeln.se;

import java.util.ArrayList;

public class Project {

	private String name;
	
	private Course course;
	private ArrayList<Student> students;
	
	public Project(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public void addMember(Student student) {
		
	}
	
	public ArrayList<Student> getMembers() {
		return students;
	}
}
