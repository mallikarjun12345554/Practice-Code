package com.three.multiple;
interface Dog {
	void bark();
}
interface Cat {
	void meow();
	
}
class Animal implements Dog, Cat {
	public void bark() {
		System.out.println("bow bow");
	}

public void meow() {
	System.out.println("meooooow");
	
	
}
}
public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.bark();
		a.meow();
		

	}

}
