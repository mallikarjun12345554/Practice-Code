package com.dl.one;

public class Eg8 {
	//Bitwise operators/Non short circuit operator 
	//AND(&) 
	//OR(|) 
    //BITWISE Exclusive OR(^)(XOR}
	//BITWISE NOT(~)

	public static void main(String[] args) {
		System.out.println(true & true);
		System.out.println(false & true);
		System.out.println(true & false);
		System.out.println(false & false);
        System.out.println(true | false);		
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(false | true);
        System.out.println(true ^ true );
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        
        int a =20;
        int b = 500;
        
        System.out.println(a^b);
        
        
        	}

}
