package com.Private.MethodsandVariables;

public abstract class client {
	private int a = 10;
	private void m1() {
		System.out.println("Non Abstract Method M1 in Abstract Class");
	}
    public static int b = 20;
    public static void m2() {
    	System.out.println("Non Abstract Static Method M2 in Abstract Class");
    }
	public static void main(String[] args) {
             int c = 30;
             System.out.println("Local Variable in Abstract Method: " +c);
             
             System.out.println("Private Variable in the Abstract Class: " + client.b);
             client.m2();
           //  new client().m1();//Cannot instantiate
           //  System.out.println(new client().a);//Cannot instantiate
             
	}

}
