package com.dl.one.Modifiers.Variables;

public class Eg7 {
	
	public static void main(String[] args) {
		new Eg7().m1();
		new Eg7().m2();
		
		
	}
		public void m1() {
			final int c = 20;
			int i = 10;
		   // protected int p = 30;
		    //private int pi = 40;
		    System.out.println(c);
		    System.out.println(i);
       
	}
        public void m2() {
        	final int b = 32;
        	System.out.println(b);
        	
        }
}
