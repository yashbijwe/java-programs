package com.stream.part2;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1 {
	String name;
	String dept;
	char gender;
	double sal;
	int age;

	public Employee1(String name, String dept, char gender, double sal, int age) {
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

public class Test2 {
	public static void main(String[] args) {

		List<Employee1> employee1 = new ArrayList<>();

		employee1.add(new Employee1("Amit", "IT", 'M', 45000, 25));
		employee1.add(new Employee1("Sneha", "HR", 'F', 40000, 24));
		employee1.add(new Employee1("Rahul", "Sales", 'M', 38000, 26));
		employee1.add(new Employee1("Priya", "IT", 'F', 50000, 28));
		employee1.add(new Employee1("Vikas", "Finance", 'M', 55000, 30));
		employee1.add(new Employee1("Neha", "HR", 'F', 42000, 27));
		employee1.add(new Employee1("Arjun", "Sales", 'M', 36000, 23));
		employee1.add(new Employee1("Pooja", "Finance", 'F', 48000, 29));
		employee1.add(new Employee1("Karan", "IT", 'M', 60000, 32));

	
	Map<Character,List<Employee1>> genderwise = employee1.stream()
			.collect(Collectors.groupingBy(Employee1::getGender));
		
	genderwise.forEach((gender, empList) -> {
			System.out.println("Gender: " + gender);
			empList.forEach(System.out::println);
			System.out.println();
		});
	}
}