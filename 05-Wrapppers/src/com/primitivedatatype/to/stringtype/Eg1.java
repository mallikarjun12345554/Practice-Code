package com.primitivedatatype.to.stringtype;

public class Eg1 {
	//Primitive to String by using toString() 

	public static void main(String[] args) {
       int i1 = 10;
       System.out.println("Primitive data: " +i1);
       String s1 = Integer.toString(i1);
       System.out.println("String :" +s1);
       
       //------------------------------------------
       
       //using the operator + method
       int i2 = 15;
       System.out.println("Primitive datatype: " +i2);
       String s2 = ""+i2;
       System.out.println("String: " +s2);
       
       
	}

}
