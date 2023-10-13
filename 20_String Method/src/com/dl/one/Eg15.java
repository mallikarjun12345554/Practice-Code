package com.dl.one;

public class Eg15 {
   
	public static void main(String[] args) {
	
//substring method will remove the characters in the string by user defined index
//In the substring characters that are undesired can be removed by mentioning the index positions
		
         String s1 = new String("Hello world");
         System.out.println(s1.substring(4));
         System.out.println(s1.substring(3, 7));
	}
}
