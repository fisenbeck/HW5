package de.uni.koeln.se;

import java.util.ArrayList;

public class Student {

	private int id;
	private String name;
	
	private Project project;
	private ArrayList<Exam> exams;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Project getProject() {
		return project;
	}
	
}
