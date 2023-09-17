package com.SuperKeywordVariables;
class C {
	 int k = 10;
	 int l = 20;
}
public class D extends C {
  int t = 100;
  int u = 200;
  
  public void m1(int r, int e) {
	  System.out.println(r+e);
		System.out.println(super.k);
		System.out.println(super.l);
		System.out.println(this.t);
		System.out.println(this.u);
		  
  }
  public static void main(String[] args) {
	  D d = new D();
	  d.m1(1000, 2000);
	  
	  
}
		 
}
