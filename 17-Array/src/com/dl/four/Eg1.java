package com.dl.four;

import java.util.Arrays;

public class Eg1 {
	
	//Arrays.toString method print the arrays in the form of String and the default package need is java.util.Arrays

	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50};
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println("Arrays.toString prints the arrays like this: " + Arrays.toString(a));
		int b[] = new int[5];
		System.out.println(b);
		int c[] = {30,40,50,60,70};
		System.out.println(Arrays.toString(c));
	
	}

}
