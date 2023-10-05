package com.dl.four;

import java.util.Arrays;

public class Eg2 {
	//Arrays.toString Method

	public static void main(String[] args) {
           int d[] = {10, 20, 30, 40, 50};
           System.out.println(d);
           Arrays.fill(d, 10);
           System.out.println(Arrays.toString(d));
           
           //Arrays.fill Method that the method will fill the array with same mentioned number
           int e[] = new int[5];
           System.out.println(e);
           Arrays.fill(e, 99);
           System.out.println(Arrays.toString(e));
           
	}

}
