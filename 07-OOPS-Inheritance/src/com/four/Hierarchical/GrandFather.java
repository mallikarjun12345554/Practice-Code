package com.four.Hierarchical;

public class GrandFather extends Object {
	public void earnig() {
	System.out.println("earned the wealth over the year by doing the hard work");
	
}
}
     class Ayya7 extends GrandFather{
		public void wealth1() {
			System.out.println("Wealth got transfered to child name from father");
		
		}
	}
	class Koduku7 extends Ayya7{
	public void wealth2() {
		System.out.println("Wealth got transfered form the Parent");
	}
	
	public static void main(String[] args) {
		GrandFather c = new GrandFather();
	    Ayya7 ayya7 = new Koduku7();
	    Koduku7 koduku7 = new Koduku7();
	    
	    c.earnig();
	    ayya7.wealth1();
	    koduku7.wealth2();
		
	}
	}


