package com.dl.one;

public class Eg16 {
	
	public static void main(String[] args) {
		//By using the StringBuilder a character can be deleted
		//Delete the character by the using the method deleteCharAt
	       String s1 = "Cool";
	       StringBuilder sb = new StringBuilder(s1);
	       StringBuilder deleteCharAt = sb.deleteCharAt(0); 
	       System.out.println(deleteCharAt);
	     
	       
	}

}
