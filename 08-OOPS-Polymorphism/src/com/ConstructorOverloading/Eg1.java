package com.ConstructorOverloading;
public class Eg1 {

   public Eg1() {
        	 System.out.println("Default Constructor");
        	 }	
   public Eg1(int a) {
  	 System.out.println(a);
  	 }	
   public Eg1(int a, int b) {
  	 System.out.println(a+ " "+ b);
  	 }	
   public Eg1(float f) {
	   System.out.println(f);
   }
   public Eg1(double d) {
	   System.out.println(d);
   }
   public Eg1(long l) {
	   System.out.println(l);
   }
   public Eg1(char ch) {
	   System.out.println(ch);
   }
   public Eg1(String s1) {
	   System.out.println(s1);
	   
   }
   
	public static void main(String[] args) {
	   new Eg1("String Defaulat Constructor #2");
       new Eg1();
       new Eg1(10);
       new Eg1(10,20);
       new Eg1(98f);
       new Eg1(98.55);
       new Eg1(9177832353l);
       new Eg1('A');
       
}
	
}
