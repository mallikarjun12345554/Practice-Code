package com.dl.one.Modifiers.Variables;

public class Eg6 {
	private int eid = 101;
	protected int sid = 102;
	int vid = 103;
	public int pid = 104;
	
	

	public static void main(String[] args) {
            Eg6 eg6 = new Eg6();
            System.out.println(eg6.eid);//private can only be called in the same class
            System.out.println(eg6.vid);//final can only be called in the same class
	}

}
