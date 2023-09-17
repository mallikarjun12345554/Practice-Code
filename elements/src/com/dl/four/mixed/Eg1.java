package com.dl.four.mixed;

public class Eg1 {
	{ 
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}
    public void m1() {
    	System.out.println("m1 instance method" );
    }
	public static void m2() {
		System.out.println("m2 static method");
	}
	public static void main(String[] args) {
		new Eg1();
		new Eg1().m1();
		    m2();
	
		
		
	
}
}
