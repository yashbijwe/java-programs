package com.stream.part3;



import java.util.List;
import java.util.Objects;




class Employee1 {
    int id;
    String name;
    String department;
    double salary;
    int age;
    int joiningYear;
    int experience;
    String city;
    List<String> skills;

    public Employee1(int id, String name, String department, double salary,
                    int age, int joiningYear, int experience,
                    String city, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.joiningYear = joiningYear;
        this.experience = experience;
        this.city = city;
        this.skills = skills;
    }
    
    public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public int getJoiningYear() {
		return joiningYear;
	}

	public int getExperience() {
		return experience;
	}

	public String getCity() {
		return city;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
    public String toString() {
        return name;
    }
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Employee1)) return false;

	    Employee1 e = (Employee1) o;
	    return Objects.equals(name, e.name);
	}



	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
}

public class Test011{
	public static void main(String[] args) {
		
	
List<Employee1> empList = List.of(

    new Employee1(1, "John", "IT", 90000, 28, 2020, 4,
            "Delhi", List.of("Java", "Spring", "SQL")),

    new Employee1(2, "Mary", "HR", 60000, 31, 2018, 6,
            "Mumbai", List.of("Excel", "Communication")),

    new Employee1(3, "Alex", "IT", 75000, 24, 2022, 2,
            "Delhi", List.of("Java", "Python", "ML")),

    new Employee1(4, "Bob", "Sales", 50000, 29, 2019, 5,
            "Kolkata", List.of("Negotiation", "CRM")),

    new Employee1(5, "Riya", "IT", 85000, 26, 2021, 3,
            "Delhi", List.of("Java", "Spring", "Teamwork")),

    new Employee1(6, "Zara", "HR", 65000, 34, 2017, 8,
            "Mumbai", List.of("Hiring", "Excel", "Training")),

    new Employee1(7, "Chris", "IT", 95000, 30, 2016, 9,
            "Delhi", List.of("Java", "SpringBoot", "Angular")),

    new Employee1(8, "Anil", "Sales", 45000, 27, 2023, 1,
            "Kolkata", List.of("CRM", "Excel"))
);



empList.stream()
.distinct()
.forEach(System.out::println);


}
}