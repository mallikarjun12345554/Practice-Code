package com.dl.one;
 
public class Eg18 {

	public static void main(String[] args) {
		//split method will split the sentence into the single world
		//using the for each together will make this happen
		//can use the colon:, hyphen-, can't use the star *
		//can also use the and in split method\
		//split can also be used for split the single into two by mentioning the where split in the numbers
	     
		String s1 = new String("Hello@Java@Hello@Python");
	   
	      String[] sp = s1.split("@");
	      System.out.println(sp);
	      for (String string : sp) {
	    	  System.out.println(string);
	    	  }
	      System.out.println(" ");
	      String s2 = new String("HelloJavaandHelloPython");
	      String[] sp2 = s2.split("and");
	      for (String string2 : sp2) {
	    	  System.out.println(string2);
	    	  }
	      
	      System.out.println(" ");
	    		String s3 = new String("CoreJava and Advjava");
	    	    String[] sp3 = s3.split(" ", 2);
	    	    for (String string3 : sp3) {
	    	    	System.out.println(string3);
					
				}
	   
	    		
	}

}