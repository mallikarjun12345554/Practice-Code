package com.dl.one;

public class Eg19 {

	public static void main(String[] args) {
		
		//Join method: Joins the multiple string

//		String s1 = String.join(" ","Hello", "Java", "Hello", "Python");
//
//		System.out.println(s1);
//		
//		String s2 = String.join(":", "Hey!", "Hello", "man", "how", "are", "you");
//		System.out.println(s2);
//	   
//		String s3 = String.join("-", "Java", "is", "cool" );
//		System.out.println(s3);
//				
//		String s4 = String.join(":-", "HelloJava", "and", "HelloPython", "and", "HelloJavascript" );
//		System.out.println(s4);
		
		
		String s5 = new String("HelloJava:and:HelloPython:and:HelloJavascript");
		String[] sp5 = s5.split(":");
		for (String str : sp5) {
		System.out.println(str);
		}
		

	}

}
