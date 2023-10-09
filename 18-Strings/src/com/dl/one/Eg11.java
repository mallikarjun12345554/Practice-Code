package com.dl.one;

public class Eg11 {
//Converting the data from byte to String by using the index offset and length
	public static void main(String[] args) {
           byte b1[] = {65, 66, 67, 68, 69};
           System.out.println(b1);
           String s1 = new String(b1,1,4);
           System.out.println(s1);
	}

}
