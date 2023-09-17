package com.dl.one;
public class Eg18 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		boolean c = (a++ == b | b++ == b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		
		//Short circuit operators
		int x = 10;
		int y = 10;
		boolean c1 = (x++ == y || y++ == b);
		System.out.println(c1);
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		
		
	
		
		
		
		
	}
}
