package com.Multiple.and.Multilevel;
interface FatherDog{
	public void Bark();
}
interface MotherDog{
	public void bark();
}
interface {
	public void Childbark();
}
class Father implements FatherDog {
	public void Bark() {
		
		System.out.println("woof woof");
		
	}

	public void Childbark() {
		// TODO Auto-generated method stub
		
	}
}
class Mother implements MotherDog extends Father{
	public void bark() {
		System.out.println("bow bow");
	}
}

class ChildDog implements Child, FatherDog, MotherDog{
	public void Childbark() {
		System.out.println("boo boo");
	}

	@Override
	public void Bark() {
		// TODO Auto-generated method stub
		
	}
}
public class Eg2 {
	public static void main(String[] args) {
		
	


}}