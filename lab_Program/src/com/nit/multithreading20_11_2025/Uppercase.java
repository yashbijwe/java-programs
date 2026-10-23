package com.nit.multithreading20_11_2025;

import java.util.Scanner;

class Uppercaseletters extends Thread{
	String letters;

	public Uppercaseletters(String leters) {
		super();
		this.letters = leters;
	}
	@Override
	public void run() {
		System.out.println(letters.toUpperCase());
	}
	
}

public class Uppercase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Letters");
	String letters=sc.nextLine();
	Uppercaseletters uppercaseletters = new Uppercaseletters(letters);
	uppercaseletters.start();
}
}
