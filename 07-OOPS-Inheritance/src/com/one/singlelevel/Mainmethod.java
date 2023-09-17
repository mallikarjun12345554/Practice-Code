package com.one.singlelevel;

class ParentA{
	public void m1() {
		System.out.println("M1 method");
	}
}
class ChildA extends ParentA{
	public void m2() {
		System.out.println("M2 method");
		
	}
}
public class Mainmethod {

	public static void main(String[] args) {
		ChildA childA = new ChildA();
		childA.m2();
		childA.m1();

	}

}
