package com.nit.multithreading20_11_2025;
import java.util.Scanner;
class EvenThread extends Thread{
	int range;
	public EvenThread(int range) {
	
		this.range = range;
	}
	public void run() {
		for(int i=1; i<=range;i++) {
			if(i%2==0) {
				System.out.println("Even : "+i);
			}
		}
	}
}

class OddThread extends Thread{
	int range;
	public OddThread(int range) {
	
		this.range = range;
	}
public void run() {
	for(int i=1; i<=range;i++) {
		if(i%2!=0) {
			System.out.println("Odd : "+i);
		}
	}
}
}

public class EvenOdd{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter range for Even");
    	int range1=sc.nextInt();
    	System.out.println("Enter range for Odd");
    int range2=sc.nextInt();
    	EvenThread evenThread = new EvenThread(range1);
    	OddThread oddThread = new OddThread(range2);
    	evenThread.start();
   
    	oddThread.start();
      
    }
}


