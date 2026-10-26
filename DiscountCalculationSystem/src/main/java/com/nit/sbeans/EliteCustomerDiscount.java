package com.nit.sbeans;


public class EliteCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		System.out.println("EliteCustomerDiscount.calculateDiscount()");
		return amount*0.15;
	}

}
