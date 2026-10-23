package com.nit.exceptionhandling;

import java.util.Scanner;
class ATMOutOfCashException extends Exception{}
public class ATM {
	int ATMcash=20000;
	
	
	public void withdraw(int amount) {
		if (amount <= ATMcash){
			System.out.println("Withdrawal Successful: "+amount);
		}
		try {
			if(amount > ATMcash) {
				throw new ATMOutOfCashException();
			}
		}
		catch(ATMOutOfCashException e) {
			System.out.println("ATMOutOfCashException: Withdraw "+amount+" exceeds limit "+ATMcash);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount");
		int amount=sc.nextInt();
		ATM b1=new ATM();
		b1.withdraw(amount);
		
	}
}