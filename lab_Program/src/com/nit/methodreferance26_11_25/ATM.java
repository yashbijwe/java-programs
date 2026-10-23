package com.nit.methodreferance26_11_25;

import java.util.Scanner;

interface PINValidator {
	boolean validate(int pin);
	
}

class Bank {
	public static boolean validatePIN(int pin) {
		return pin == 1234;
	}
}

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PINValidator v1 = Bank::validatePIN;
		System.out.print("Enter your PIN: ");
		int pin = sc.nextInt();
		if (v1.validate(pin)) {
			System.out.println("PIN is valid. Access granted.");
		} else {
			System.out.println("Invalid PIN. Access denied.");
		}
		sc.close();
		
	}

}
