package com.cdac.core;

public class Student {
	
	private int id, age;
	private static int counter;
	private String name, email;
	private static double gpa;
	
	public Student(String name, String email, int age) {
		
		id = ++counter;
		this.name = name;
		this.email = email;
		this.age = age;
		gpa = 0;
	}
	
	public String fetchDetails() {
		
		return name + " " + email + " " + age;
	}
	
	public double computeGPA(int quiz, int test, int asgn) {
		
		gpa = ((quiz * 0.2) + (test * 0.5) + (asgn * 0.3)) / 10;
		return gpa;
	}
	
	public double getGPA() {
		
		return gpa;
	}
	
	public int getID() {
		
		return id;
	}
}
