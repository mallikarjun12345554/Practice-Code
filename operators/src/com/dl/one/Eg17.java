package com.dl.one;

public class Eg17 {
	//Short circuit/logical Operators

	public static void main(String[] args) {
		 
	  int a = 10;
	  int b = 10;
	  int c = 11;
	   
	  
	  //System.out.println(a++ == b);
	  //System.out.println(a++ == 11);
	  
	  //System.out.println(a++ == ++c);
	  System.out.println(c == a | ++b == c);
	  
	}

}
