package com.nit.collection;

import java.util.ArrayList;

import java.util.Collections;

public class GradeManager {
	private ArrayList<Integer> grades;

	public GradeManager() {
		grades = new ArrayList<>();
	}

	public void addGrade(int grade) {
		grades.add(grade);
	}

	public double calculateAverage() {
		double sum = 0;
		for (int i = 0; i < grades.size(); i++) {
			sum += grades.get(i);
		}
		return sum / grades.size();
	}

	public int getHighestGrade() {
		
		return Collections.max(grades);
	}

	public void removeFailingGrades() {
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) < 60) {
				grades.remove(i);
				i--; 
			}
		}
	}

	public void displayGrades() {
		System.out.print("Grades:");
		
			System.out.println(grades);
		
	}

	public static void main(String[] args) {
		GradeManager gm = new GradeManager();
		gm.addGrade(85);
		gm.addGrade(76);
		gm.addGrade(93);
		gm.addGrade(55);

		gm.displayGrades();


		gm.removeFailingGrades();
		System.out.println("Grades after removing failing grades:");
		gm.displayGrades();
		System.out.println("Highest Grade: " + gm.getHighestGrade());
		System.out.printf("Average Grade: %.2f",gm.calculateAverage());
	}
}
