package de.uni.koeln.se;

import java.util.ArrayList;

public class TA {
	
	private ArrayList<Exam> exams;
	private ArrayList<Course> courses;
	
	private String name;
	

	
	public  ArrayList<Course> getCourse() {
		return courses;
	}
	public String getName() {
		return name;
	}
	
	public void extendContract(Course course) {
		
	}
	public void setName(String name) {
		this.name = name;
	}
}
