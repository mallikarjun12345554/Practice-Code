package com.Method.OverRiding;

 class Parent {
	public void m1 () {
		System.out.println("Parent M1 Method");
		
	}}
	class Child extends Parent {
		public void m1() {
			System.out.println("Child M1 Method");
		}
	}
	public class Eg1{
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.m1();
	    Parent p = new Child();
		p.m1();
		
        
	}

	}
