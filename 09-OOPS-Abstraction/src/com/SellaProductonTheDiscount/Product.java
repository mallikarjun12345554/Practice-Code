package com.SellaProductonTheDiscount;

public abstract class Product {
	
	static int productPrice;
	static int discount;
	

	public void getDiscount(int offer) {
		discount = productPrice-offer;
		System.out.println("After Discount Product Price is: " +discount);
	}	
	
	public void getUserDetails(String fName, String lName, String productName) {
		System.out.println("User First Name: " + fName);
		System.out.println("User Last Name: " + lName);
		System.out.println("Product Name: " + productName);
	}

}
