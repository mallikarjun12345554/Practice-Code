package com.dl.one.DownCasting;

class E {
	public void m1() {
		
		System.out.println("M1 Method of class E");
		
	}
}
public class Poly extends E {
	public void m1 () {
		System.out.println("M1 Method of class F");
		
	}



	public static void main(String[] args) {
//		E e = new F();
//		e.m1();
//		E e1 = new E();
//		e1.m1();
//		F f = new F();
//		f.m1();
		E p = new Poly();
		p.m1();
		
		
	}
}
