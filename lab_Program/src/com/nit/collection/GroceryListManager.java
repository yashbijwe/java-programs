package com.nit.collection;

import java.util.ArrayList;

public class GroceryListManager {
	private ArrayList<String> groceryList = new ArrayList<>();
	public void addItem(String item) {
		groceryList.add(item);

		
	}
	public void removeItem(String item) {
		if (groceryList.contains(item)) {
            groceryList.remove(item);
        } else {
            System.out.println("Error: '" + item + "' not found. Cannot remove.");
        }
		
	}
	public void replaceItem(int index, String newItem) {
		if (index >= 0 && index < groceryList.size()) {
            groceryList.set(index, newItem);
        } else {
            System.out.println("Error: Cannot replace at invalid index.");
        }
		
	}
	public int getItemCount() {
		return groceryList.size();
	}
	public void displayList() {
		System.out.println("Final Grocery List: " + groceryList);
        System.out.println("Total Items: " + getItemCount());
		
		
	}
	public static void main(String[] args) {
		
		
		GroceryListManager gm = new GroceryListManager();
		gm.addItem("Milk");
		gm.addItem("Eggs");
		gm.addItem("Butter");
		gm.removeItem("Eggs");   
		gm.replaceItem(1, "Bread");
		gm.displayList();
		
		
	}

}
