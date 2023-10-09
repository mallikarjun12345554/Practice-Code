package com.dl.one;

public class Eg8 {

	public static void main(String[] args) {
              
		String s1 = new String("Java");
//		String s2 = new String("Java");
//		System.out.println(s1.equals(s2));
//		System.out.println(s1==s2);
		String s3 = "Ja";
		String s4 = new String("va");
		String s5 = s3.concat(s4);
		System.out.println(s5);
		System.out.println(s1 == s5);
		System.out.println(s1.equals(s5));
		//String s5 = new String("Python");//Duplicate local variable
		//The original data of the string cannot be changed
		
	}

}
