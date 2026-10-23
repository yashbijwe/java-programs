package com.nit.multithreading;

import java.util.Scanner;

/*
  create parameterized constructor to receive the number of iteration
 override run method to execute loop for n  number of iteration based on user input.
 take an instance variable to initialize 
 */
class MyThread extends Thread{
	int iteration;
	public MyThread(int i) {
		
		this.iteration=i;
	}
	public void run() {
		for(int i=1;i<=iteration;i++) {
			System.out.println("Task two: "+i);
		}
	}
}
public class Sample {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of iteration");
		int iteration=sc.nextInt();
		MyThread m1=new MyThread(iteration);
		MyThread m2=new MyThread(iteration);
		m1.start();
		m2.start();
		
		
		
		sc.close();
	}

}
