package com.three.multiple;


	 class A extends Object{
     	
			public void m1() {
     		 System.out.println("M1 Method");
     	 }
     	 
      }
      class B extends A{
     	
			public void m2() {
     		System.out.println("M2 Method");
     		
     	}
     	 
      }
     
		
		class C extends B,A{
     	 public void m3() {
     		 System.out.println("M3 Method");
     		 
     	 }
     	 
      }
		public class Client {
	public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m2();
        c.m3();
        
         
	}

}
