package com.nit.comparator;
import java.util.Arrays;

 class Student implements Comparable<Student>{
	private int id;
	private String name;
	private double marks;
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id); 
        
    }

	

}

 public class StudentTest {
public static void main(String[] args) {
	Student s1=new Student(101,"Alice",85.5);
	Student s2=new Student(102,"Bob",90.0);
	Student s3=new Student(100,"Charlie",78.0);
	
	Student[] students= {s1,s2,s3};
	
	System.out.println("Before Sorting:");
	for(Student s:students) {
		System.out.println(s);
	}
	
	Arrays.sort(students);
	
	System.out.println("After Sorting:");
	for(Student s:students) {
		System.out.println(s);
		}
 }
 }