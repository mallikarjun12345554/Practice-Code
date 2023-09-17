package com.hierarchical.and.singleLevel;

class C {
	public void disp() {
		System.out.println("C");
		
	}
}
class A extends C{
	public void disp() {
		System.out.println("A");
		
	}
}
class B extends A{
	public void disp() {
		System.out.println("B");
		
		
	}
}


public class ClassD extends A {
	public void disp() {
		System.out.println("D");
	}
	
public static void main(String[] args) {
	A obj4 = new A();
    obj4.disp();
    B obj2 = new B();
    obj2.disp();
    C obj3 = new C();
	obj3.disp();
	ClassD obj = new ClassD();
	obj.disp();
	
	
    
	
	
}
}
