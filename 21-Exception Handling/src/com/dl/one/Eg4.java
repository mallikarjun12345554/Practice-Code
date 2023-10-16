package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
		//ArrayIndexOutOfBoundException
		//This exception will be thrown if the input given is out of the dimensions element limit
		 try {
			  int a[] = {10, 20, 30, 40, 50,};
			  System.out.println(a[0]);
			  System.out.println(a[1]);
			  System.out.println(a[2]);
			  System.out.println(a[3]);
			  System.out.println(a[4]);
			  System.out.println(a[5]);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
			
		} 
			System.out.println("After the Exception throw");
			
	}
}
