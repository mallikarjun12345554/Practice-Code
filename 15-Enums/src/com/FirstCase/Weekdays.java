package com.FirstCase;

// Implementation of Enum
//Implementation of value of method
//Implementation of values method

public enum Weekdays {
	Monday, Tuesday, Wednesday;

	
	public static void main(String[] args) {
		System.out.println("Constants of Enum Weekdays: ");
         Weekdays mon = Weekdays.Monday;	
         System.out.println(mon);
         Weekdays tue = Weekdays.Tuesday;
         System.out.println(tue);
         Weekdays wed = Weekdays.Wednesday;
         System.out.println(wed);
         System.out.println("        ");
         
         System.out.println("Value of:");
		Weekdays valueOf = Weekdays.valueOf("Tuesday");
		System.out.println(valueOf);
		System.err.println("      ");
		
		
		System.out.println("Values:");
        Weekdays[] values = Weekdays.values();
		for (Weekdays wd : values) {
			System.out.println(wd);
			
			
			
			
		}
	}

}
