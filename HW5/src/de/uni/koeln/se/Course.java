package de.uni.koeln.se;

import java.util.ArrayList;

public class Course {

	private int id;
	private String name;
	private int maxCapacity;
	private boolean isFull;

	private Department department;
	private ArrayList<TA> tas;
	private ArrayList<Professor> professors;
	private ArrayList<Exam> exams;
	private ArrayList<Project> project;


	public Course(int id, String name, int cap,  ArrayList<Professor> prof) {
		this.id = id;
		this.name = name;
		this.maxCapacity = cap;
		this.professors = prof;

	}

	public void entroll(Student student) {

	}

	public void apply(TA ta) {

	}

	public void setMaxCap(int max) {
		this.maxCapacity = max;
	}

	public ArrayList<Professor>  getProfessor() {
		return professors;
	}



	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<TA> getTA() {
		return tas;
	}

	public void setTas(ArrayList<TA> ta) {
		this.tas = ta;
	}

}
