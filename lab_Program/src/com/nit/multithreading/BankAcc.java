package com.nit.multithreading;

public class BankAcc {
    long accNum;
    String accHolderName;
    double balance;
	public BankAcc(long accNum, String accHolderName, double balance) {
		
		this.accNum = accNum;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance+=amount;
		
	}
	public void withdraw(double amount) {
		balance-=amount;
		
	}
	public void checkBalance() {
		System.out.println("Current Balance is "+balance);
	}
    
}
