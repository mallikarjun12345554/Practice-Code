package com.dl.five;

//This keyword is used as an argument in the method
public class Customer {
	
	public void m1 (Customer customer) {
		System.out.println("M1 Method");
		
	}
	public void m2() {
		m1(this);
		System.out.println("M2 Method");
	}

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.m2();
		
         
		
	}

}
