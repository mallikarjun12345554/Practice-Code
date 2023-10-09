package com.dl.one;

public class Eg12 {

//Converting the data from the char to String by using the method char value
	
	public static void main(String[] args) {
		char ch[] = {'A', 'B', 'C', 'D', 'E'};
		String s1 = new String(ch);
		System.out.println(s1);
		
		//converting data from int offset and int count of char 
		String s2 = new String(ch,1,3);
		System.out.println(s2);
		
	 
		
		

	}

}
