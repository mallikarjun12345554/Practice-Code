package com.two.multilevel;
class GrandparentA {
	public static void m1() {
		System.out.println("M1 Method");
		
	}
}
class ParentA extends GrandparentA {
	public static void m2() {
		System.out.println("M2 Method");
		
    }						
}
class ChildA extends ParentA{
	public static void m3() {
		System.out.println("M3 Method");
		
	}
}
public class ThreeGenerations {
	public static void main(String[] args) {
		ChildA.m1();
		ChildA.m2();
		ChildA.m3();
		
	}

}
