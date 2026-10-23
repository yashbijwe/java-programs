package com.nit.exceptionhandling;

class CourseFullException extends Exception {
	public CourseFullException(String message) {
		super(message);
	}
}
class AlreadyEnrolledException extends Exception {
	public AlreadyEnrolledException(String message) {
		super(message);
	}
}
interface CourseOperations {
	void enroll(Student s) throws CourseFullException, AlreadyEnrolledException;
	void drop(Student s);
}
class Student {
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
abstract class Course implements CourseOperations{
	protected String courseName;
	protected int maxStudents;
	protected int enrolledStudents;
	
	public Course(String courseName, int maxStudents) {
		this.courseName = courseName;
		this.maxStudents = maxStudents;
		this.enrolledStudents = 0;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getMaxStudents() {
		return maxStudents;
	}
	
	public int getEnrolledStudents() {
		return enrolledStudents;
	}
}
class ProgrammingCourse extends Course{

	public ProgrammingCourse(String courseName, int maxStudents) {
		super(courseName, maxStudents);
		
	}
	public void enroll(Student s) throws CourseFullException, AlreadyEnrolledException {
		
	}
	public void drop(Student s) {
		
	}
	
}
class DesignCourse extends Course{
	public DesignCourse(String courseName, int maxStudents) {
		super(courseName, maxStudents);
		
	}
	public void enroll(Student s) throws CourseFullException, AlreadyEnrolledException {
		
	}
	public void drop(Student s) {
		
	}
	
}
public class Online_learning{
	public static void main(String[] args) {
		
	}
}



