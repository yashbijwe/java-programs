package com.nit.methodreferance26_11_25;

import java.util.Scanner;
import java.util.function.Consumer;
class Patient{
	String name;

	public Patient(String name) {
		this.name = name;
		System.out.println("Patient Registered: "+name);
	}
	
}

public class Hospital {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter patient name");
	
		Consumer<String> c1= Patient::new;
		
		c1.accept(sc.next());
		sc.close();
	}
	

}
