package com.nit.ArrayList02_12_25;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExitManager {
	public void clearList(List<String> name) {
		name.clear();
		
	}
	public void displaySize(List<String> name) {
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		List<String> s1= new ArrayList<>();
		s1.add("Ria");
		s1.add("Sonali");
		s1.add("Tanu");
		s1.add("Swati");
		EmployeeExitManager e1= new EmployeeExitManager();
		e1.displaySize(s1);
		e1.clearList(s1);
		e1.displaySize(s1);
	}
	
}
