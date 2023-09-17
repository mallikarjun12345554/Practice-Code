package com.dl.six;
//this keyword to pass as an argument in the constructor call
class B{
	A a;

	public B(A a) {
		this.a = a;
	}
	public void idNumber() {
		System.out.println(a.id);
	}
}
public class A {
	int id = 10;
	
	public A() {
          new B(this).idNumber();
	}

	public static void main(String[] args) {
           new A();
	}

}
