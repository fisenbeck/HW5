package de.uni.koeln.se;

import java.util.ArrayList;

public class Exam {

	private int maxValue;
	private ArrayList<Professor> professors;
	private ArrayList<Question> questions;
	private ArrayList<Student> students;
	private ArrayList<TA> tas;
	private Course course;
	
	public Exam(int value) {
		this.maxValue = value;
		
	}
	
	public Boolean register(Student student) {
		return null;
		
	}
	
	public void addQuestion(int id, String task, int value) {
		Question q = new Question(id,task,value);
		questions.add(q);
	}
	
	public ArrayList<Student> getRegisteredStudents() {
		return students;
		
	}
	
	public void setMaxValue(int max) {
		this.maxValue = max;
	}
}

