package com.dl.one;

public class Eg1 {
	//Difference between the length variable and the length() method.
	//Whenever the primitive data type is used the length variable is used.
	//Whenever the String class is used then the length method is used.
	public static void main(String[] args) {
		char ch[] = {'A', 'B', 'C', 'D'};
		System.out.println(ch);
		System.out.println(ch.length);
		
		String s1 = new String("Hello");
		System.out.println(s1);
		System.out.println(s1.length());
	
		
		
	}

}
