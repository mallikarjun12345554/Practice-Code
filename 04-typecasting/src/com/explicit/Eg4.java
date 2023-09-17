package com.explicit;

public class Eg4 {

	public static void main(String[] args) {
         
		
		double d1 = 65.0;
		int i1 = (char)d1;
		System.out.println(i1);
		
		////----------------------------
		
		char ch1 = 'A';
		int i = ch1;
		System.out.println(i);
		
		///------------------------------
		
		double d2 = 67.0;
		char ch2 = (char)d2;
		System.out.println(ch2);
		
		////------------------------------
		
		
		//can take any right hand cast but
		//the actual conversion will be left hand side one
		double d4 = 23.0;
		long l4 = (int)(char)(short)(byte)d4;
		System.out.println(l4);
				
				
	}
	
	

}
