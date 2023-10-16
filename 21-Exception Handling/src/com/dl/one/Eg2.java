package com.dl.one;

public class Eg2 {

	//Try catch exception is a runtime exception and is unchecked exception
	//Arithmetic exception
	public static void main(String[] args) {
		 try {
      	   int a = 10;
      	   int b = 0;
      	   int c = 2;
      	   System.out.println("Before the Exception throw");
      	   System.out.println(a/c);
      	   System.out.println(a/b);
         }
         catch (ArithmeticException e) {
      	   System.out.println(e);
      	   System.out.println("After the Exception throw");
			
		}
		 System.out.println("Hello Java");

	}

}
