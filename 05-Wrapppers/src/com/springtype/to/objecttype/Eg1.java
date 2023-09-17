package com.springtype.to.objecttype;

public class Eg1 {
	//Converting String to object using parameterized constructor

	public static void main(String[] args) {
		
		String s1 = "20";
		System.out.println("String type: " +s1);
		@SuppressWarnings("removal")
		Integer i = new Integer(s1);
		System.out.println("Object type: " +i);
		
		//-----------------------------------------
		
		//Converting string to object by using valueof() method
		
		String s2 = "15";
		System.out.println("String: " +s2);
		Integer valueof = Integer.valueOf(s2);
		System.out.println("Object: " + valueof);
		
            
	}

}
