package com.AbstractMethodImpl;

public class ProfileImplTwo extends ProfileImpl{
	public void m2() {
		System.out.println("M2 Method of ProfileImplTwo");
	}
	

	public static void main(String[] args) {

		ProfileImplTwo P2 = new ProfileImplTwo();
		P2.m1();
	    P2.m2();
	}

}
