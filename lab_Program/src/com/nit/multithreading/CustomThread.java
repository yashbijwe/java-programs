package com.nit.multithreading;

 class CustomThread extends Thread{
	 BankAcc acc;
	 double amt;
	 public CustomThread(BankAcc acc, double amt) {
	
		this.acc = acc;
		this.amt = amt;
	 }
	 @Override
	 public void run() {
		 
	 }

}
