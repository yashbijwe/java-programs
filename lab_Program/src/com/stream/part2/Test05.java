package com.stream.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee3 {
	String name;
	String dept;
	char gender;
	double sal;
	int age;

	public Employee3(String name, String dept, char gender, double sal, int age) {
		this.name = name;
		this.dept = dept;
		this.gender = gender;
		this.sal = sal;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public char getGender() {
		return gender;
	}

	public double getSal() {
		return sal;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", "
				+ "Department=" + dept + ", "
						+ "Gender=" + gender + ","
								+ " Salary=" + sal + ", "
										+ "age=" + age;
	}
}

public class Test05 {
	public static void main(String[] args) {

		List<Employee3> employ = new ArrayList<>();

		employ.add(new Employee3("Amit", "IT", 'M', 45000, 25));
		employ.add(new Employee3("Sneha", "HR", 'F', 40000, 25));
		employ.add(new Employee3("Rahul", "Sales", 'M', 38000, 26));
		employ.add(new Employee3("Priya", "IT", 'F', 50000, 28));
		employ.add(new Employee3("Vikas", "Finance", 'M', 55000, 30));
		employ.add(new Employee3("Neha", "HR", 'F', 42000, 27));
		employ.add(new Employee3("Arjun", "Sales", 'M', 36000, 23));
		employ.add(new Employee3("Pooja", "Finance", 'F', 48000, 29));
		employ.add(new Employee3("Karan", "IT", 'M', 60000, 32));

		Map<String, Double> emp = employ.stream()
				.collect(Collectors.
						groupingBy(Employee3::getDept,
						Collectors.averagingDouble
						(Employee3::getSal)));
		emp.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}