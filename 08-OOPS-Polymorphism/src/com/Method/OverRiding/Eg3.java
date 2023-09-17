
package com.Method.OverRiding;
  class Vehicle {
	public void buyVehicle(String vehicleName, String vehicleColour) {
		System.out.println("Vehicle Name :" + vehicleName);
		System.out.println("Vehicle Colour: " + vehicleColour);
}}
class TestDrive extends Vehicle {
	public void buyVehicle(String vehicleName, String vehicleColour) {
		System.out.println("Vehicle Name :" + vehicleName);
		System.out.println("Vehicle Colour: " + vehicleColour);
}}
 public class Eg3 extends Vehicle {
    public static  void main(String[] args) {
		Vehicle v = new TestDrive();
		v.buyVehicle("BMW", "Black");
}}
