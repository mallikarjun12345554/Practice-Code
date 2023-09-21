package com.FirstCase;

// Values with foreach loop and ValueOf method implementation
public enum Bikes {
	Hero, Honda, TvS;
	
	public static void main(String[] args) {
		System.out.println("Value of");
		Bikes valueOf = Bikes.valueOf("Honda");
		   System.out.println(valueOf);
		   System.out.println("      ");
		   
		Bikes [] values = Bikes.values();
		for (Bikes bike : values) {
			System.out.println(bike);
			System.out.println(bike.ordinal());
			}
		
	
		
			
		
		
		
				
	}

}
	


