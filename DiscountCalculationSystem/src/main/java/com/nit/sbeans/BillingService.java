package com.nit.sbeans;
import org.springframework.stereotype.Component;

@Component
public class BillingService {

    private DiscountStrategy discountStrategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }

    public void generateBill(double amount) {
        double discount = discountStrategy.calculateDiscount(amount);
        double finalAmount = amount - discount;

        System.out.println("Original Amount: ₹" + amount);
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
    }
}
