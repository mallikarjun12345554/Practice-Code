package com.dl.one;

   public class Eg2 {
       
	   public static void main(String[] args) {
		//concat method()
		   String s1 = "Java";
		   String s2 = "Python";
		   String s3 = "Java";
		   
		   String s4 = new String(s1.concat(s2).concat(s3));
		   System.out.println(s4);
		  
		   String s5 = s1.concat("Spring");
		   System.out.println(s5);
		   
		   String s6 = new String("sfe");
		   System.out.println(s6);
		   String s7 = "sfe";
		   System.out.println(s7);
}
}