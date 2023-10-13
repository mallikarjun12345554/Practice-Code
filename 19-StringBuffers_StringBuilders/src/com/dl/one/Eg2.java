package com.dl.one;

public class Eg2 {
  
	public static void main(String[] args) {
       //String Buffer and append method
	//String Builder and append method
		
		StringBuffer s1 = new StringBuffer("java");
		StringBuffer s2 = s1.append("Python");
		StringBuffer s3 = s1.append("JavaScript");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("  ");
		StringBuilder s4 = new StringBuilder("java");
		StringBuilder s5 = s4.append("Python");
		StringBuilder s6 = s5.append("JavaScript");
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
}
}
