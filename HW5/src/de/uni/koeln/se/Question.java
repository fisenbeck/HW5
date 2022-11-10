package de.uni.koeln.se;

public class Question {

	private String task;
	private int maxValue;
	private int id;

	private Exam exam;

	public Question(int id, String task, int value) {

		this.id = id;
		this.task = task;
		this.maxValue = value;

	}

}
