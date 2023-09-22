package com.dl.one.UpCasting;

class A {
	public A() {
              System.out.println("Default Constructor of class A");
           }
	public void m1() {
		System.out.println("M1 Method of class A");
	}
}
class B extends A{
	public B() {
              System.out.println("Default Constructor of class B"); 
 	}
	public void m1() {
		System.out.println("M1 Method of class B");
		
	}
}
//Converting subclass to super class
//By making the aa = b the subclass become the super class
public class Client {
	public static void main(String[] args) {
		A a = new B();
		a.m1();
		
//		B b = new B();
//		A aa = b;
//		aa.m1();
		
		 
	}
	

}
