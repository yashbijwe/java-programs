package com.nit.exceptionhandling;
import java.util.Scanner;
class AccountInactiveException extends Exception{
	
}
public class Account {
	String status ;
	
	

	public void performTransaction(String action) {
		try {
		if(action.equalsIgnoreCase("active")) {
			System.out.println("Transaction Successful: <action>");
		}
		if(action.equalsIgnoreCase("inactive")) {
			throw new AccountInactiveException();
		}
		}
		catch(AccountInactiveException a) {
			System.out.println("Cannot perform <action>, account inactive");
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the status");
		String status=sc.next();
		Account a1=new Account();
		a1.performTransaction(status);
	}

}
