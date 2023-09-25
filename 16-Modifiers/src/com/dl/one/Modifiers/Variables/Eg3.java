package com.dl.one.Modifiers.Variables;

public class Eg3 {
	
	private int id = 10;
	
	// Except final modifier any other can't be used under the main method
	public static void main(String[] args) {
	Eg3 eg3 = new Eg3();
	System.out.println(eg3.id);
	//	private int eid = 20; // private cannot be used in the main method
    // Illegal modifier for parameter eid only final is permitted
	 
	
	}
}
