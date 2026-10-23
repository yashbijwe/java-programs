package com.nit.multithreading20_11_2025;

import java.util.Scanner;

class Ping extends Thread{
	int range;
	public Ping(int range) {
	
		this.range = range;
	}
	public void run() {
		try{Thread.sleep(500) ;}
		catch(Exception e) {
			System.out.println("");
		}
		for(int i=1; i<=range;i++) {
			
				System.out.println("Ping");
			
		}
	}
}

class Pong extends Thread{
	int range;
	public Pong(int range) {
	
		this.range = range;
	}
public void run() {
	for(int i=1; i<=range;i++) {
		try{Thread.sleep(500) ;}
		catch(Exception e) {
			System.out.println("");
		}
			System.out.println("Pong");
		
	}
}
}
public class PingPong {
	
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter range for Ping");
	    	int range1=sc.nextInt();
	    	System.out.println("Enter range for Pong");
	    int range2=sc.nextInt();
	    Ping ping = new Ping(range1);
	    	Pong pong = new Pong(range2);
	    	ping.start();
	    	
	    	pong.start();
	      
	    }
	}


