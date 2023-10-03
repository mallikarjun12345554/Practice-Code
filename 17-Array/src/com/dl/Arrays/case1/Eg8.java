package com.dl.Arrays.case1;

public class Eg8 {

	public static void main(String[] args) {
              int a[] = new int[-4];//Exception in thread "main" java.lang.NegativeArraySizeException: -4
              System.out.println(a.length);
              a[-4] = 1;
              System.out.println(a[-4]);
	}

}
