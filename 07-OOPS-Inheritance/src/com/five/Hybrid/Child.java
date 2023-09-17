package com.five.Hybrid;

//Single and Multiple Inheritance(Hybrid Inheritance)

class HumanBody{
	public void displayHuman() {
		System.out.println("Method defined inside HumanBody class");
	}
}
interface Male{
	public void show();
	
}
interface Female{
	public void show();
    
}

public class Child extends HumanBody implements Male, Female {
	public void show() {
		System.out.println("Implementation of show() method in the interface of Male and Female");
		
	}
	public void displayChild() {
		System.out.println("Method defined inside child class");
	}

	public static void main(String[] args) {
    Child obj = new Child();
    obj.show();
    HumanBody obj2 = new HumanBody();
    obj2.displayHuman();
    obj.displayChild();
    
	}

}
