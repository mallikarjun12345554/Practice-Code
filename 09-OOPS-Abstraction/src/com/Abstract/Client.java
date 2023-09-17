package com.Abstract;
abstract class A{
	public void m1() {
		System.out.println("M1 Method of A");
	}
	public abstract void m2();
}
class B extends A{
	public void m2() {
		System.out.println("M2 Method of B");
	}
}
public abstract class Client {

	public static void main(String[] args) {
          B b = new B();
          b.m1();
          b.m2();
	}

}
