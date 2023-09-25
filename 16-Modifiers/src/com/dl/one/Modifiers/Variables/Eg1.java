package com.dl.one.Modifiers.Variables;

public class Eg1 {
	
	public static void main(String[] args) {
		//private int eid = 101;
		final int eid = 102;
		System.out.println(eid);
		new Eg1().m1();
	}
		
		private void m1() {
			final int sid = 103;
			System.out.println(sid);
		
	}

}
