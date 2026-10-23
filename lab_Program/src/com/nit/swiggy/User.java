package com.nit.swiggy;

public class User {
	private int userId;
	private String name;
	private String deliveryAddress;
	public User(int userId, String name, String deliveryAddress) {
		super();
		this.userId = userId;
		this.name = name;
		this.deliveryAddress = deliveryAddress;
	}
	public int getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	@Override
	public String toString() {
		return "UserId=" + userId + ", Name=" + name + ", Delivery Address=" + deliveryAddress  ;
	}
	

}
