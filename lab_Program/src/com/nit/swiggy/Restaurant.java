package com.nit.swiggy;

public class Restaurant {
	private int restaurantId;
	private String name;
	private String cuisine;
	private double rating;
	public Restaurant(int restaurantId, String name, String cuisine, double rating) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.cuisine = cuisine;
		this.rating = rating;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public String getName() {
		return name;
	}
	public String getCuisine() {
		return cuisine;
	}
	public double getRating() {
		return rating;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Restaurant Id=" + restaurantId + ", Name=" + name + ", Cuisine=" + cuisine + ", Rating="
				+ rating ;
	}
	

}
