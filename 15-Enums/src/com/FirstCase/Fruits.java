package com.FirstCase;

// valueOf method implementation
public enum Fruits {
	Apple, Orange, Watermelon;
	
	
	public static void main(String[] args) {
		
		Fruits valueOf = Fruits.valueOf("Orange");
		System.out.println(valueOf);
	}

}
