package com.nit.collection;

import java.util.Arrays;
 class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "id = " + id + "\t | name =   " + name + "\t | salary = " + salary;
	}
	@Override
	public int compareTo(Employee o) {
		
		return Integer.compare(this.id, o.id);
	}
	
}

 public class Sorting{
	 public static void main(String[] args) {
		Employee[] e = {new Employee(101,"yash",100000),
				new Employee(105,"ramesh",100000),
				new Employee(102,"suresh",100000),
				new Employee(104,"prajwal",100000),
				new Employee(106,"pranav",100000),
				new Employee(103,"sumit",100000),
				new Employee(107,"ruchir",100000),
				
		
		
		};
		Arrays.sort(e);
		for(Employee emp:e) {
			System.out.println(emp);
//			System.out.println("---------------");
		}
	}
	 
 }
