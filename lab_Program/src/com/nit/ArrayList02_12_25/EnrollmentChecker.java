package com.nit.ArrayList02_12_25;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentChecker {
	
	public boolean isEnrolled(List<String> students, String name) {
	   if(students.contains(name)) return true;
	   else return false;
	}
	
	public static void main(String[] args) {
		List<String> students = new  ArrayList<String>();
		students.add("Swati");
		students.add("Sam");
		students.add("Sonali");
		
		EnrollmentChecker e1= new EnrollmentChecker();
		System.out.println(e1.isEnrolled(students, "Sam"));
	}
	

}
