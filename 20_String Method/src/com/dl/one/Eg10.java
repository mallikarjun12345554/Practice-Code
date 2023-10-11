package com.dl.one;

public class Eg10 {
	//replace method
	//replaceFirst method
	//replceAll method

	public static void main(String[] args) {
//       String s1 = new String("Java Programming Part");
//       System.out.println(s1.replace("Pro", "pro"));
//       System.out.println(s1.replace("J", "j"));
//       System.out.println(s1);
       String s2 = new String("Java Programming and Java Program");
       System.out.println(s2.replace("P", "p"));
//     System.out.println(s2.replaceAll("Pro", "pro"));
//     System.out.println(s2.replaceFirst("ram", "Ram"));
       
       System.out.println(s2.replaceAll("J", "j")); 
       
       String s3 = new String("Python Program");
       System.out.println(s3.replaceFirst("P", "p"));
       String s4 = new String("Python Python");
       System.out.println(s4.replaceFirst("Py", "pY"));
      
	}

}
