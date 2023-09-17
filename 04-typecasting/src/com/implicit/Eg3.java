package com.implicit;

public class Eg3 {
	//Type casting conversion
	
	public static void main(String[] args) {
		byte b = 10;// 1 bit
		short s = b;// 2 bytes
		System.out.println(s);
		
		byte b1 = 20;
		int  i = b1;
		System.out.println(i);
		
		int ii1 = s;// 4 bytes
		System.out.println(ii1);
	
		long l = ii1;// 8 bytes 
		System.out.println(l);
		
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		
		int i3 = 104;
		System.out.println(i3);
		char ch = 104;
		System.out.println(ch);
		
		
	}

}
