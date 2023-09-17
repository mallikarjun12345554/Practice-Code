package com.dl.eight;

public class Test {
	public void m1() {
		System.out.println(this);//com.dl.eight.Test@cac736f
	}
	

	public static void main(String[] args) {
      Test t = new Test();
      System.out.println(t);//com.dl.eight.Test@cac736f
      t.m1();
	}

}
