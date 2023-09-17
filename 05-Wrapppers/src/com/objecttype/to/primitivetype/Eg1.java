package com.objecttype.to.primitivetype;

public class Eg1 {
	//Objective type to primitive data type by the method
	//of intvalue

	public static void main(String[] args) {
          @SuppressWarnings("removal")
		  Integer i = new Integer(10);
          System.out.println("Objective datatype: " +i);
          int intvalue = i.intValue();
          System.out.println("primitve datatype: "+ intvalue);
          
 //Auto unboxing method for the conversion of Object to Primitive datatype
          
          @SuppressWarnings("removal")
		Integer i2 = new Integer(25);
          System.out.println("Objective type: " + i2);
          
          int i3 = i2;
          System.out.println("Primitive datatype: " +i3);
          
          
          }
}
