package com.dl.one;

public class Eg13 {

	public static void main(String[] args) {
		
           //lastIndexOf method to know the index of the single letter
           // It will count the index position form zero but point he the mentioned letter of the string from the last of the line\
		   String s1 = new String("I like the Java I like the Python and I like the JavaScript");
           System.out.println(s1.lastIndexOf("like"));
           System.out.println(s1.lastIndexOf("love"));
           
           
           //IndexOf method to know the position of the word or the letter
           String s2 = new String("I like the Java I like the Python and I like the JavaScript");
           System.out.println(s2.indexOf("like"));
           
           //IndexOf from index method will return the word of mentioned index position and word
           System.out.println(s2.indexOf("like", 6));
           
	}

}
