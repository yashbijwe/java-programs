package com.nit.comparator;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Product implements Comparable<Product>{
     private int productId;
     private String productName;
     private double price;
     private double rating;
	 public Product(int productId, String productName, double price, double rating) {
	
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.rating = rating;
	 }
	 public void setProductId(int productId) {
		 this.productId = productId;
	 }
	 public void setProductName(String productName) {
		 this.productName = productName;
	 }
	 public void setPrice(double price) {
		 this.price = price;
	 }
	 public void setRating(double rating) {
		 this.rating = rating;
	 }
	 public int getProductId() {
		 return productId;
	 }
	 public String getProductName() {
		 return productName;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public double getRating() {
		 return rating;
	 }
	 @Override
	 public String toString() {
		 return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", rating="
					+ rating + "]";
	 }
	 
	 @Override
	 public int compareTo(Product other) {
		 return Integer.compare(this.productId, other.productId); 
		 
	 }
	 
	 
     
}
 
public class Electronicstore {
	public static void display(Product[] products) {
		for (Product p : products) {
            System.out.println(p);
        }
	}
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 Product[] products = { 
				 new Product(205, "Laptop", 75000.0, 4.5),
				 new Product(207, "Smartphone", 50000.0, 4.7), 
				 new Product(209, "Tablet", 30000.0, 4.3),
				 new Product(204, "Smartwatch", 15000.0, 4.0),
				 new Product(201, "Headphones", 8000.0, 4.2),
				 new Product(206, "Camera", 45000.0, 4.6),
				 new Product(203, "Printer", 12000.0, 3.9),
				 new Product(208, "Monitor", 20000.0, 4.4),
				 new Product(202, "Keyboard", 3000.0, 4.1),
				 new Product(210, "Mouse", 1500.0, 4.0)
		        };
		 System.out.println("1. Sort by Product Name (A–Z)");
		 System.out.println("2. Sort by Product ID (Ascending)");
		 System.out.println("3. Sort by Price (Low → High)");
		 System.out.println("4. Sort by Price (High → Low)");
		 System.out.println("5. Sort by Rating (High → Low)");
		 System.out.println("6. Exit");
		 System.out.println("Enter your choice: ");
		 
		 switch (sc.nextInt()) {
		        
		 case 1:System.out.println("Products sorted by Product Name (A–Z):");
		        Comparator<Product> sortbyName = Comparator.comparing(Product::getProductName);
		         Arrays.sort(products,sortbyName);
		         display(products);
			    break;
		 
		 case 2:	System.out.println("Products sorted by Product ID (Ascending):");
		        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));
		        display(products);
			    break;	 
		
		 case 3:System.out.println("Products sorted by Price (Low → High):");
		        Arrays.sort(products, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		        display(products);
			    break;
	
		 case 4:System.out.println("Products sorted by Price (High → Low):");
			    Arrays.sort(products, (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
			    display(products);
			    break;
			    
		 case 5:System.out.println("Products sorted by Rating (High → Low):");
		        Arrays.sort(products, (p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
		        display(products);
		        break;
		 
		 case 6:System.out.println("Exiting the program.");	
		          sc.close();
		          return;
		  
		  default:System.out.println("Invalid choice. Please try again.");
		 
		
		 }
		 
       
		 
	 }
 }
