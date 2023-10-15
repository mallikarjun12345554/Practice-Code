package com.dl.one;

public class Eg20 {

	public static void main(String[] args) {
		
		//It is thread safe and it is mutable
		StringBuffer sb = new StringBuffer("Java");
		sb.append("Python");
		System.out.println(sb);
		sb.append("JavaScript");
		System.out.println(sb);
		
		//It is not thread safety and mutable
		StringBuilder sb1 = new StringBuilder("Java");
		sb1.append("Python");
		System.out.println(sb1);
		sb1.append("JavaScript");
		System.out.println(sb1);


	}

}
