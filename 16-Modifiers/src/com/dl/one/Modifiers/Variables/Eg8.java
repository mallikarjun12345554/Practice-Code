package com.dl.one.Modifiers.Variables;

public class Eg8 {
	int a = 10;
	public int b = 20;
	private int c = 30;
	protected int d = 40;
	

	public static void main(String[] args) {
         System.out.println(new Eg8().a);  
         System.out.println(new Eg8().b);
         System.out.println(new Eg8().c);
         System.out.println(new Eg8().d);
         System.out.println("     ");
          m2();
     }
	
	public static void m2() {
		System.out.println(new Eg8().a);  
        System.out.println(new Eg8().b);
        System.out.println(new Eg8().c);
        System.out.println(new Eg8().d);
		
	}

}
