package com.nit.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.BillingService;
import com.nit.sbeans.DiscountStrategy;
import com.nit.sbeans.EliteCustomerDiscount;
import com.nit.sbeans.PremiumCustomerDiscount;
import com.nit.sbeans.RegularCustomerDiscount;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class AppConfig {
	  @Bean("regular")
	    public DiscountStrategy regularCustomerDiscount() {
	        return new RegularCustomerDiscount();   // 5%
	    }

	    @Bean("premium")
	    public DiscountStrategy premiumCustomerDiscount() {
	        return new PremiumCustomerDiscount();   // 10%
	    }

	    @Bean("elite")
	    public DiscountStrategy eliteCustomerDiscount() {
	        return new EliteCustomerDiscount();     // 15%
	    }
	   

	    @Bean
	    public BillingService billingService() {
	        return new BillingService();
	    }
}
