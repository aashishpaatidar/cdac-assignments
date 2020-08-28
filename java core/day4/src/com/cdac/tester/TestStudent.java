package com.cdac.tester;

import java.util.Scanner;

import com.cdac.core.Student;

class TestStudent {
    
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("enter class size of students");
		Student[] std = new Student[scan.nextInt()];
		
		boolean flag = false;
		int choice = 0, counter = 0, roll = 0, id = 0;
		double score = 0;
		
		System.out.println("1. Admit new student, 2. Assign scores, 3. Display topper details, 4. Exit");
		
		while(!flag) {
			
			System.out.println("enter choice");
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1: 
				if(std[counter] == null) {
				    System.out.println("enter name, email and age");
				    std[counter++] = new Student(scan.next(), scan.next(), scan.nextInt());
			}
				else 
					System.out.println("class capacity full");
				break;
			
			case 2: 
				System.out.println("enter student roll no.");
				roll = scan.nextInt() - 1;
				if(roll >= 0 && roll <= std.length - 1) {
					System.out.println("enter scores for -> quiz, test & assignment");
					System.out.println("scores added, GPA computed = " + std[roll].computeGPA(scan.nextInt(), scan.nextInt(), scan.nextInt()));
				}
				else
					System.out.println("invalid student id or whatever");
				break;
			
			case 3:
				for(Student s : std) {
					if(s != null) {
					    if(s.getGPA() != 0 && s.getGPA() > score) {
					    	score = s.getGPA();
					    	id = s.getID()-1;				    
					    	}	
					}
				}
				System.out.println("topper: " + std[id].fetchDetails() + " " + score);
				break;
			
			case 4: 
				flag = true;
			        
			}
		}
	}

}
