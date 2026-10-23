package com.nit.ArrayList02_12_25;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<String> items= new ArrayList<>();
	
	public void addItem(String item) {
		items.add(item);
	}
	public void displayCart() {
		
		System.out.println("Shopping Cart Items: " + items);
	}
	public static void main(String[] args) {
		ShoppingCart s1= new ShoppingCart();
		s1.addItem("Pen");
		s1.addItem("Notebook");
		s1.displayCart();
		s1.addItem("Pencil");
		s1.displayCart();
		
		
		
	}

	
}
