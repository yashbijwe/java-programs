package com.nit.collection;

import java.util.ArrayList;
class Student{
	 int sid;
	String sname;
	String course;
	String mobileNo;
	
	public Student(int sid, String sname, String course, String mobileNo) {
		this.sid = sid;
		this.sname = sname;
		this.course = course;
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "sid=" + sid + "\nsname=" + sname + "\ncourse=" + course + "\nmobileNo=" + mobileNo ;
	}
	
}

public class StudentRegistration {
	public static void main(String[] args) {
		Student s1=new Student(101,"Yash","BE (cse)","9876543210");
		Student s2=new Student(102,"Rohit","BE (IT)","8765432109");
		Student s3=new Student(103,"Amit","BE (ECE)","7654321098");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		for(Student s:students) {
			System.out.println(s);
			System.out.println();
		}
		
	}

}
