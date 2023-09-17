package com.one.singlelevel;
class ParentB{
	public void m1() {
		System.out.println("Parent class and Parent mehtod");
		
	}
}
class ChildB extends ParentB{
	public void m2(){
		System.out.println("Child class and Child method");
	}
}
public class Heridity {

	public static void main(String[] args) {
		ChildB childB = new ChildB();
		childB.m1();
		childB.m2();

	}

}
