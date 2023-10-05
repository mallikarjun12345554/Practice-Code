package com.dl.four;

import java.util.Arrays;

public class Eg4 {

	public static void main(String[] args) {
		//Arrays.sort Method will repositions the array element in the order
           int a[] = {10, 30, 40, 20, 50};
           System.out.println(a);
           Arrays.sort(a);
           System.out.println(Arrays.toString(a));
           
           int b[] = {120, 290, 335, 555, 203, 3903, 3894, 8983, 3832};
           Arrays.sort(b);
           System.out.println(Arrays.toString(b));
           System.out.println("   ");
           
           new Eg4();
           
	}

	        public Eg4() {
				int d[] = {10, 40, 30, 50, 20};
				System.out.println(d);
				Arrays.sort(d);
				System.out.println("Arrays.to String Method by Sort Method: " +Arrays.toString(d));
	         }
}
