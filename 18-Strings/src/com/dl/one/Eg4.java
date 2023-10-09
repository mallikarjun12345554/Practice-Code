package com.dl.one;

public class Eg4 {
	int i = 30;
	String s1 = "String one from outside of the main Method";

	public static void main(String[] args) {
//            int i = 20;
//            System.out.println(i);
//           System.out.println(new Eg4().i);
           String s1 = "String one form inside of the main Method";
           System.out.println(s1);
           System.out.println(new Eg4().s1);
	}

}
