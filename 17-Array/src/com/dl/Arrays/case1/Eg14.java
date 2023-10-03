package com.dl.Arrays.case1;

public class Eg14 {

	public static void main(String[] args) {
           int a[][] = {{10, 20, 30, 40 }, {40, 50, 60}, {70, 80, 90}};
           System.out.println(a[0].length);
           for (int[] i : a) {
        	   System.out.println(i[0]);
        	   System.out.println(i[1]);
        	   System.out.println(i[2]);
        	   System.out.println(i.length);
        	   System.out.println(a[2][0]);
        	   
        	  
        	 }
           System.out.println("        ");
           System.out.println(a[0][0]);
           System.out.println(a[0][1]);
           System.out.println(a[0][2]);
           System.out.println(a[0][3]);
           System.out.println(a[0]);
	}

}
