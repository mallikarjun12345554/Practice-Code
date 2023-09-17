package com.dl.two;

//Result can be print with the name of Child class and also directly with the Interface name

public class ClientOneImpl implements ClientOne {

	public static void main(String[] args) {
		System.out.println(ClientOneImpl.x);
		System.out.println(ClientOneImpl.y);
		System.out.println(ClientOneImpl.c);
		
		System.out.println(ClientOne.x);
		System.out.println(ClientOne.y);
		System.out.println(ClientOne.c);
	}
}
