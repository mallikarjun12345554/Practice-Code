package com.Multiple.and.Multilevel;
interface MaleDog{
	void Bark();
}
interface FemaleDog {
	void bark();
}
interface Puppy{
	void ChildBark();
}
class FatherDog implements MaleDog extends Object{
	
	public void Bark() {
		System.out.println("woof woof");
	}}
class MotherDog implements FemaleDog extends FatherDog {

	public void bark() {
		System.out.println("bow bow");
	}}
class ChildDog implements Puppy extends FatherDog, MotherDog{
	
	public void ChildBark() {
		System.out.println("boo boo");
	}
}


public class Eg1 {

	public static void main(String[] args) {

	}

}
