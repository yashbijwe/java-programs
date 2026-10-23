package com.nit.ArrayList02_12_25;

import java.util.ArrayList;

public class FavoritesList {
	
	private ArrayList<String> favorites = new ArrayList<>();
	
	
	public void removeItem(String item) {
		favorites.remove(item);
		
	}
	
	public void displayFavorites() {
		System.out.println("Updated favorites: "+favorites);
		
	}
	public static void main(String[]args) {
		FavoritesList f1= new FavoritesList();
		f1.favorites.add("movie1");
		f1.favorites.add("movie2");
		f1.favorites.add("movie3");
		f1.displayFavorites();
		f1.removeItem("movie2");
		f1.displayFavorites();
	
	}
	

}
