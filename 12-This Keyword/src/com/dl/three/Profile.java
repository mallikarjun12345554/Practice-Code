package com.dl.three;

//This keyword is used to invoke current class method
//If this keyword is not used before calling the instance variable then the compiler will call the this keyword
public class Profile {
	public void AddToCart() {
		System.out.println("Products added to the cart");
	}
	public void get() {
		System.out.println("Get the products");
	}
	public void Remove() {
		this.AddToCart();
		System.out.println("Remove the products");
	}

	public static void main(String[] args) {
		Profile pro = new Profile();
		
		pro.Remove();
		
		
	}

}
