package com.nit.methodreferance26_11_25;

import java.util.Scanner;
import java.util.function.Consumer;

class SMSSender {
	public void sendSms(long number) {
		System.out.println("SMS sent to: "+number);
	}
}
public class SMS {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	SMSSender s1= new SMSSender();
	Consumer<Long> c1 =s1::sendSms;
	System.out.println("Enter Mobile Number");
	c1.accept(sc.nextLong());
	sc.close();
	
}
}
