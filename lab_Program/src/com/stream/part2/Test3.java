package com.stream.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee2 {
	String name;
	String dept;
	char gender;
	double sal;
	int age;

	public Employee2(String name, String dept, char gender, double sal, int age) {
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
		return "Name=" + name + ", Department=" + dept + ", Gender=" + gender + 
				        ", Salary=" + sal + ", age=" + age
				;
	}
}

public class Test3 {
	public static void main(String[] args) {

		List<Employee2> employee2 = new ArrayList<>();

		employee2.add(new Employee2("Amit", "IT", 'M', 45000, 25));
		employee2.add(new Employee2("Sneha", "HR", 'F', 40000, 25));
		employee2.add(new Employee2("Rahul", "Sales", 'M', 38000, 26));
		employee2.add(new Employee2("Priya", "IT", 'F', 50000, 28));
		employee2.add(new Employee2("Vikas", "Finance", 'M', 55000, 30));
		employee2.add(new Employee2("Neha", "HR", 'F', 42000, 27));
		employee2.add(new Employee2("Arjun", "Sales", 'M', 36000, 23));
		employee2.add(new Employee2("Pooja", "Finance", 'F', 48000, 29));
		employee2.add(new Employee2("Karan", "IT", 'M', 60000, 32));

	
	Map<Integer,List<Employee2>> agewise = employee2.stream()
			.collect(Collectors.groupingBy(Employee2::getAge));
		
	agewise.forEach((age, empList) -> {
			System.out.println("Age: " + age);
			empList.forEach(System.out::println);
			System.out.println();
		});
	}
}