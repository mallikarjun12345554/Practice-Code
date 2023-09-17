package com.Abstract;

abstract class Profile{
	public void m1() {
		System.out.println("Non Abstract Method");
	}
	public abstract void m2();
}
class ProfileImpl extends Profile{
	public void m2() {
		System.out.println("Abstract Method Implementation");
}
	}
public class Eg1 {

	public static void main(String[] args) {
		ProfileImpl profileImpl = new ProfileImpl();
		profileImpl.m2();
		profileImpl.m1();
	}
}
