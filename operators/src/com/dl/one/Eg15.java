package com.dl.one;

public class Eg15 {
	//Short Circuit Operators or logical Operators
    //AND &&
	//OR ||
	public static void main(String[] args) {
		
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);//false // Dead code
		System.out.println(false&&false);//Dead code//false
		
		
		System.out.println(true||true);//Dead code 
		System.out.println(true||false);//Dead code
		System.out.println(false||true);
		System.out.println(false||false);
		   
		
		
		
		
		
		

	}

}
