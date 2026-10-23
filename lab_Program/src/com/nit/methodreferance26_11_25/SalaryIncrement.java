package com.nit.methodreferance26_11_25;
import java.util.Scanner;
import java.util.function.BiFunction;


class Employee {
    double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double increment(Double percent) {
        return salary + (salary * percent / 100.0);
    }
}

public class SalaryIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary");
        double salary = sc.nextDouble();

        Employee e = new Employee(salary);

        BiFunction<Employee, Double, Double> b = Employee::increment;

        double newSalary = b.apply(e, 10.0);
        System.out.println("New Salary: " + newSalary);
        sc.close();
    }
}
