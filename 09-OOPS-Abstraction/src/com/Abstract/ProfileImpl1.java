package com.Abstract;

abstract class Profile1 {
	 public void m1() {
		 System.out.println("M1 Instance Method");
	 }
     public static void m2 () {
    	 System.out.println("M2 Static Method");
     }
     public int m3() {
    	 System.out.println("M3 Primitive Type Method");
    	 return 0;
     }
     public String m4() {
    	 System.out.println("M4 String Method");
    	 return null;
     }
     public abstract void m5();
     public abstract void m6();
}

     public class ProfileImpl1 extends Profile1{

		@Override
		public void m5() {
           System.out.println("M5 Abstract Method");			
		}

		@Override
		public void m6() {
               System.out.println("M6 Abstract Method");			
		}
    
    
	public static void main(String[] args) {
		
		ProfileImpl1 pro = new ProfileImpl1();
		pro.m1();
		pro.m3();
		ProfileImpl1.m2();
		pro.m4();
		pro.m5();
		pro.m6();
		
         
	}
     
}
