package com.dl.one;

public class Eg8 {

	public static void main(String[] args) {
		//NullPointerException with the help of try catch method
		
		try {
			System.out.println("Implementatin of try catch for exception handling:");
			System.out.println(" ");
			String s1 = null;
			System.out.println(s1.length());
		
			
		} 
		catch (NullPointerException e) {
			System.out.println(e);
			
		}
		System.out.println(" ");
		System.out.println("String s1 implemented successfully and exception catched.");
		

	}

}
