package com.dl.one;

public class Eg6 {
	
//equalsIgnoreCase Method 
//This method compare the two string irrespective of the upper and lower case

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("java");
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3 = new String("Python");
		String s4 = new String("python");
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		//compareToIgnoreCase Method
		System.out.println(s1.compareToIgnoreCase(s2));
				
		

	}

}
