package com.dl.one;

public class Eg6 {
	

	public static void main(String[] args) {
		String s1 = new String("Hello World");
		String s2 = new String("Hello World");
		System.out.println(s1==s2);
		
		String s3 = "Java";
		String s4 = new String("Java");
		System.out.println(s3==s4);
		
		String s5 = new String("Hello World");
		System.out.println(s1==s5);
		System.out.println(s2==s5);
		
//		String s6 = s1.concat(s4);
//		System.out.println(s6);
		
		
		
		
		
	}
}
