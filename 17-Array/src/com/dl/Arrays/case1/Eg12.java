package com.dl.Arrays.case1;

public class Eg12 {

	public static void main(String[] args) {
       int a[] = {10, 20, 30, 40, 50, 60, 70};
       System.out.println(a.length);
       for (int i = 0; i < 6; i++) {
    	   System.out.println(a[i]); 
       }
//    	   System.out.println("       ");
//
//      
//       int b[] = {10, 20, 30, 40, 50, 60};
//       for (int j = 0; j < b.length; j++) {
//    	   System.out.println(b[j]);
//		
//	}
//           System.out.println("     ");
//       Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
//       int c[] = {10, 20, 30, 40, 50, 60};
//       for (int k = 0; k <= c.length; k++) {
//    	   System.out.println(c[k]);
//		
//       //For each loop or enhance loop for implementing the whole array
//       int d[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
       for (int i : a) {
    	   System.out.println(i);
		
	}
       
       
		
	}
       
	}


