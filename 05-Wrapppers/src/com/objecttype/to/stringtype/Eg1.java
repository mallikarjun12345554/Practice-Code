package com.objecttype.to.stringtype;

public class Eg1 {

	public static void main(String[] args) {
//Objective to string by using toString method
		@SuppressWarnings("removal")
		Integer i = new Integer(10);
		System.out.println("Ojective type: " +i);
		String string = i.toString();
		System.out.println("String type: " + string);
		
		
		//object to spring by using operator +
		
		@SuppressWarnings("removal")
		Integer i1 = new Integer(25);
		System.out.println("Object type: " +i1);
		String s1 = ""+ i1; //+i1.toString();
		System.out.println("String type: " +s1); 
		
		


	}

}
