package com.dl.four.Modifiers.Variables;
import com.dl.one.Modifiers.Variables.Eg8;


public class Eg9 extends Eg8 {
	

	public static void main(String[] args) {
		Eg8 eg8 = new Eg8();
		System.out.println(eg8.b);
		new Eg9().m1();
		
	}
	
	public void m1() {
		Eg9 eg9 = new Eg9();
		System.out.println(eg9.d);
		System.out.println(eg9.b);
	}

}
