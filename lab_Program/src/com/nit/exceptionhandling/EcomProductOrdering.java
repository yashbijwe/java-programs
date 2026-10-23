package com.nit.exceptionhandling;

public class EcomProductOrdering {
public static void main(String[] args) {
	ElectronicProduct e=new ElectronicProduct("Mobile",12333,10);
	Clothing c=new Clothing("jacket",234,10);
	
	try {
		e.placeOrder(3);
		e.placeOrder(15);
		
	} catch (OutOfStockException e1) {
		System.out.println(e1.getMessage());
	}
	try {
		c.placeOrder(4);
		c.placeOrder(6);
	} catch (OutOfStockException e1) {
		
		System.out.println(e1.getMessage());
	}
	
}
}

interface OrderOperations{
	void placeOrder(int quantity)throws OutOfStockException;
	void cancleOrder(String pName);
}

abstract class Product implements OrderOperations{
	private String productName;
	private double price;
	private int stock;
	
	
	public Product(String productName, double price, int stock) {
		
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}

class ElectronicProduct extends Product{
	public ElectronicProduct(String productName, double price, int stock) {
		super(productName, price, stock);
	}
	
	public void placeOrder(int quantity) throws OutOfStockException{
		if(quantity<=getStock()) {
			System.out.println("Order placed successfully");
			setStock(getStock()-quantity);
		}else {
			throw new OutOfStockException("Exception: Out of stock!");
		}
	}
	public void cancleOrder(String pName) {
		if(pName.equals(getProductName())) {
			System.out.println("Order cancle");
		}else {
			System.out.println("Enter valid order details");
		}
		
	}
}

class Clothing extends Product{
	public Clothing(String productName, double price, int stock) {
		super(productName, price, stock);
	}
	
	public void placeOrder(int quantity) throws OutOfStockException{
		if(quantity<=5) {
			System.out.println("Order placed successfully");
			setStock(getStock()-quantity);
		}else {
			throw new OutOfStockException("Cannot order more than 5 items at a time");
		}
	}
	public void cancleOrder(String pName) {
		if(pName.equals(getProductName())) {
			System.out.println("Order cancle");
		}else {
			System.out.println("Enter valid order details");
		}
		
	}
}



class OutOfStockException extends Exception{

	public OutOfStockException(String message) {
		super(message);
	}
	
}