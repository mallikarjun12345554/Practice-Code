package com.MethodOverloading;

public class Eg1 {
	public void GetFuelCost(int petrolCost, int dieselCost) {
		System.out.println("Petrol Cost: " +petrolCost);
		System.out.println("Diesel Cost: " +dieselCost);
		
	}
	
    public void GetFuelCost(float petrolCost, float dieselCost) {
    	System.out.println("Accurate Petrol Cost: " +petrolCost);
		System.out.println("Accurate Diesel Cost: " +dieselCost);
	}
	public static void main(String[] args) {
		Eg1 price = new Eg1();
		price.GetFuelCost(110, 98);
		price.GetFuelCost(109.54f, 97.82f);
		
	}

}
