package com.dl.one;

public class Eg6 {

	public static void main(String[] args) {
		try {
			System.out.println("Before the exception throw");
	        String s1 = "10";
	        int parseInt = Integer.parseInt(s1);
	        System.out.println(parseInt);
	        }
		
		catch (NumberFormatException e) {
			System.out.println(e);
		}
	
		System.out.println("After the exception throw");
	}

}
