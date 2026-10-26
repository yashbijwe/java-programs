package com.nit.sbeans;


public class PremiumCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		System.out.println("PremiumCustomerDiscount.calculateDiscount()");
		return amount*0.1;
	}

}
