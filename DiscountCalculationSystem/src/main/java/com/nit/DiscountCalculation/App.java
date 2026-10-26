package com.nit.DiscountCalculation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.AppConfig.AppConfig;
import com.nit.sbeans.BillingService;
import com.nit.sbeans.DiscountStrategy;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter customer type (regular/premium/elite): ");
        String type = sc.next();

        DiscountStrategy strategy = null;

        switch (type.toLowerCase()) {
            case "regular":
                strategy = context.getBean("regular", DiscountStrategy.class);
                break;

            case "premium":
                strategy = context.getBean("premium", DiscountStrategy.class);
                break;

            case "elite":
                strategy = context.getBean("elite", DiscountStrategy.class);
                break;

            default:
                System.out.println("Invalid customer type");
                System.exit(0);
        }

        BillingService billingService = context.getBean(BillingService.class);
        billingService.setStrategy(strategy);
        billingService.generateBill(amount);

        sc.close();
    }
}
