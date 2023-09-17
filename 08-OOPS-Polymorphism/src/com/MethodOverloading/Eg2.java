package com.MethodOverloading;

public class Eg2 {
	public void getPatientDetails(String pName, int age, long contactNo, float weight, int height ) {
		System.out.println("Patient Name: " + pName + " Age: " + age + " Contact Number: " + contactNo + " Weight: " + weight + " Height: " + height);
	}
	public void getPatientDetails(String pName, int age, char gender) {
		System.out.println("Patient Name: " + pName + " Age: " + age + " Gender: " + gender );
	}
public static void main(String[] args) {
	new Eg2().getPatientDetails("Harsha Vardhan", 70, 9812355666L, 78.60f, 75);
	new Eg2().getPatientDetails("Jaggu", 25, 'M');
}
}
