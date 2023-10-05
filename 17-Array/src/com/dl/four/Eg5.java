package com.dl.four;

import java.util.Iterator;

public class Eg5 {

	public static void main(String[] args) {
          int a[][] = {{1, 2, 3, 17}, {4, 5, 6, 16}, {7, 8, 9, 15}, {10, 11, 13, 14}};
//          Arrays.sort(a);
//          System.out.println(Arrays.toString(a));
          for (int i = 0; i < a.length; i++) {
        	  System.out.println(a[i][0]+"    "+a[i][1]+"    "+a[i][2]+"    "+a[i][3]);
			
		}
          
	}

}
