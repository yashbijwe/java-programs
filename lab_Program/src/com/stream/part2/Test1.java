package com.stream.part2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	String name;
	String dept;
	char gender;
	double sal;
	int age;

	public Employee(String name, String dept, char gender, double sal, int age) {
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

public class Test1 {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Amit", "IT", 'M', 45000, 25));
		employees.add(new Employee("Sneha", "HR", 'F', 40000, 24));
		employees.add(new Employee("Rahul", "Sales", 'M', 38000, 26));
		employees.add(new Employee("Priya", "IT", 'F', 50000, 28));
		employees.add(new Employee("Vikas", "Finance", 'M', 55000, 30));
		employees.add(new Employee("Neha", "HR", 'F', 42000, 27));
		employees.add(new Employee("Arjun", "Sales", 'M', 36000, 23));
		employees.add(new Employee("Pooja", "Finance", 'F', 48000, 29));
		employees.add(new Employee("Karan", "IT", 'M', 60000, 32));

	
	Map<String,List<Employee>> deptWiseEmp = employees.stream()
			.collect(Collectors.groupingBy(Employee::getDept));
		
	deptWiseEmp.forEach((dept, empList) -> {
			System.out.println("Department: " + dept);
			empList.forEach(System.out::println);
			System.out.println();
		});
	
//	Map<String,List<String>> byDepartmentNames = employees.stream()
//			.collect(Collectors.groupingBy(Employee::getDept,
//					Collectors.mapping(Employee::getName, Collectors.toList())));
//	byDepartmentNames.forEach((x, y) -> {
//		System.out.print(x+": ");
//		y.forEach(System.out::println);
//		System.out.println();
//	});
		
//		Map<String, Set<Employee>> byDeptSet =
//		        employees.stream()
//		                 .collect(Collectors.groupingBy(
//		                         Employee::getDept,
//		                         Collectors.toSet()));
//
//		byDeptSet.forEach((k, v) -> {
//		    System.out.println(k + " : ");
//		    v.forEach(System.out::println);
//		    System.out.println();
//		});

//		Map<String, Map<Character, List<Employee>>> result =
//		        employees.stream()
//		                 .collect(Collectors.groupingBy(
//		                         Employee::getDept,
//		                         Collectors.groupingBy(Employee::getGender)));
//
//		result.forEach((dept, genderMap) -> {
//		    System.out.println(dept + " : ");
//		    genderMap.forEach((gender, list) -> {
//		        System.out.println("  " + gender + " : ");
//		        list.forEach(System.out::println);
//		    });
//		});
		
		  
//		Map<String, Optional<Employee>> minSalary =
//		        employees.stream()
//		                 .collect(Collectors.groupingBy(
//		                         Employee::getDept,
//		                         Collectors.minBy(Comparator.comparing(Employee::getSal))));
//
//		minSalary.forEach((k, v) -> System.out.println(k + " : " + v.get()));

		
//		Map<String, List<String>> result =
//		        employees.stream()
//		                 .filter(e -> e.getSal() > 50000)
//		                 .collect(Collectors.groupingBy(
//		                         Employee::getDept, 
//		                         Collectors.mapping(Employee::getName, Collectors.toList())));
//
//		result.forEach((k, v) -> {
//		    System.out.println(k + " : ");
//		    v.forEach(System.out::println);
//		});


	}
}