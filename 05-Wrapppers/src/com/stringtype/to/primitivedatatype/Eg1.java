package com.stringtype.to.primitivedatatype;


public class Eg1 {
	//Using the parseInt method
	
       public static void main(String[] args) {
	
		String s1 = "10";
		System.out.println("String type :" +s1);
		int parseInt = Integer.parseInt(s1);
		System.out.println("Integer: " + parseInt);
		
		//Example
		String userSalary = "200000";
		System.out.println("String: " +userSalary);
		double parsedouble = Double.parseDouble(userSalary);
		System.out.println("Primitive datatype: " + parsedouble);
		
	}

}
