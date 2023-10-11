package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {
        String s1 = new String("A");
        String s2 = new String("B");
        String s3 = new String("B");
        String s4 = new String("C");
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s3));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s4));
        
        String s5 = new String("a");
        System.out.println(s5.compareToIgnoreCase(s1));
        System.out.println(s5.compareToIgnoreCase(s2));
        System.out.println(s5.compareToIgnoreCase(s3));
        System.out.println(s5.compareToIgnoreCase(s4));  
        
	}

}
