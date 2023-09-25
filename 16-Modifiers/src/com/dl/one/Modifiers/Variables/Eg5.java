package com.dl.one.Modifiers.Variables;

public class Eg5 {
	public void m1() {
		final int id = 102;
		System.out.println(id);
	}
  public void m2() {
	  final int id2 = 103;
	  System.out.println(id2);
  }
	public static void main(String[] args) {
		Eg5 eg5 = new Eg5();
		eg5.m1();
		eg5.m2();
  
	}

}
