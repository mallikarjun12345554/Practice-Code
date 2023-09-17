package com.primitivedatatypes.to.objects;
  
//Parameterized constructor
public class Eg3 {

	public static void main(String[] args) {
		int i = 5;
		while(i!=13) {
		System.out.println("Primitive Data Type: " +i);
		++i;
		}
	   
	    @SuppressWarnings("removal")
		Integer integer = new Integer(i);
		System.out.println("Objective type:" +integer);
		
		//---------------------------------------------
		
		int k = 10;
		Integer i3 = k;
		System.out.println("Objective Type: " +i3);
	
		
		
		
		
         
	}

}
