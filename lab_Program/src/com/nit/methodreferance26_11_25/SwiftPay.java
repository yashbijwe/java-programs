package com.nit.methodreferance26_11_25;


interface PaymentGateway{
	void makePayment(double amount);
}

interface PaymentProcessor{
	
	void process(PaymentGateway pg, double amount);
}

class CreditCardPayment implements PaymentGateway{
	
	double balance;
	String cardHolderName;
	public CreditCardPayment(double balance, String cardHolderName) {
		
		this.balance = balance;
		this.cardHolderName = cardHolderName;
	}
	@Override
	public void makePayment(double amount) {
		if(balance>=amount) {
			balance-=amount;
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
		public void display() {
			System.out.println("Name: "+cardHolderName);
			System.out.println("Balance: "+balance);
		}
		
	}


class DebitCardPayment implements PaymentGateway{
	  double balance;
	  String cardHolderName;
	  public DebitCardPayment(double balance, String cardHolderName) {
		
		this.balance = balance;
		this.cardHolderName = cardHolderName;
	  }
	  @Override
		public void makePayment(double amount) {
			if(balance>=amount) {
				balance-=amount;
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}
			public void display() {
				System.out.println("Name: "+cardHolderName);
				System.out.println("Balance: "+balance);
			}
			
}


public class SwiftPay {
public static void main(String[] args) {
	CreditCardPayment c1= new CreditCardPayment(10000,"Amar");
	DebitCardPayment d1= new DebitCardPayment(100000,"yash");
	
	PaymentProcessor p1=PaymentGateway::makePayment;
	p1.process(d1, 5000);
	d1.display();
	p1.process(c1, 5000);
	c1.display();
	
}
}
