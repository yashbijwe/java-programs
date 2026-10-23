package com.nit.ArrayList02_12_25;

import java.util.ArrayList;
import java.util.List;

public class ClassroomManager {
	public String getFirstStudent(List<String> students) {
		return students.get(0);
	}
	public static void main(String[] args) {
		List<String> l1= new ArrayList<String>();
		l1.add("yash");
		l1.add("Shreyash");
		l1.add("Vedant");
		System.out.println(l1);
		ClassroomManager c1= new ClassroomManager();
		System.out.println(c1.getFirstStudent(l1));
	}

}
