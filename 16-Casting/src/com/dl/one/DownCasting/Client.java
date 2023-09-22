package com.dl.one.DownCasting;

class A{
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
	public void m2() {
		System.out.println("M2 Method of class B");
	
     }
}

//Converting superclass to subclass is called Down casting
public class Client {

	public static void main(String[] args) {
              //A a = new A();
              //B b = a; //Type mismatch: cannot convert from A to B
		      //A a = new A();
		     // B b = (B)a;
		A a = new B();
		B b = (B)a;
		b.m1();
		b.m2();
	}

}
