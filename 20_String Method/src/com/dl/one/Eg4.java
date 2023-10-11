package com.dl.one;

public class Eg4 {
	//Equals Method:-
	//Equals method always check and compare the data i.e.,content coparision
	//between the objects and returns true or false
	public static void main(String[] args) {
		 String s1 = "java";
		 String s2 = "Python";
		 String s3 = "Java Script";
		 System.out.println(s1.equals(s2));
		 System.out.println(s2.equals(s3));
		 System.out.println(s1.equals(s3));
		 String s4 = "java";
		 System.out.println(s1.equals(s4));
		 String s5 = "Java";
		 System.out.println(s1.equals(s5));
		 String s6 = new String("Java");
		 String s7 = new String("Python");
		 String s8 = new String("Java");
		 System.out.println(s6.equals(s7));
		 System.err.println(s6.equals(s8));
		 
	}

}
