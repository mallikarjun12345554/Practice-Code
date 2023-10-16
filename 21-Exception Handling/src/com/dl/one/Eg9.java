package com.dl.one;

public class Eg9 {

	public static void main(String[] args) {
		//StringIndexOutOfBoundsException
		
		System.out.println("Element of a string at Index position 6:");
		
		try {
			String s1 = new String("Hello Java Hello Python");
	    System.out.println(s1.charAt(6));
	    
	    System.out.println(" ");  
	    
	    System.out.println(s1.charAt(30));
	    } 
		
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println(e);
			}
		
		System.out.println(" ");
		System.out.println("Exception handle done successfully");
	    

	}

}
