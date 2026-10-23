package Stream_10_12_2025;

import java.util.List;
import java.util.stream.Collectors;

//write a program to create employee objects. Each employee will have name,designation,salary,yoe.
//Filter and display the employees whose salary more than 50000.
public class Employee {
		String name;
		String designation;
		double salary;
		int yoe;
	
		public Employee(String name, String designation, double salary, int yoe) {
			super();
			this.name = name;
			this.designation = designation;
			this.salary = salary;
			this.yoe = yoe;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public void setDesignation(String designation) {
			this.designation = designation;
		}
	
		public void setSalary(double salary) {
			this.salary = salary;
		}
	
		public void setYoe(int yoe) {
			this.yoe = yoe;
		}
	
		public String getName() {
			return name;
		}
	
		public String getDesignation() {
			return designation;
		}
	
		public double getSalary() {
			return salary;
		}
	
		public int getYoe() {
			return yoe;
		}

	@Override
	public String toString() {
		return "Name=" + name + "\nDsignation=" + designation +
				"\nSsalary=" + salary + "\nYoe=" + yoe + "\n";
	}

	public static void main(String[] args) {
		List<Employee> emp = List.of(new Employee("Alice", "Manager", 60000, 5),
									new Employee("Bob", "Developer", 45000, 3), 
									new Employee("Charlie", "Designer", 55000, 4),
									new Employee("David", "Tester", 40000, 2));
		List<Employee> seniorEmp = emp.
				                   stream().
				                   filter(e -> e.getSalary() > 50000).
				                   collect(Collectors.toList());
		System.out.println("Employees with salary more than 50K");
		seniorEmp.forEach(System.out::println);

	}
}
