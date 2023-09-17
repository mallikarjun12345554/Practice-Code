package com.multilevel.hierarchical;
class GrandParent extends Object{
	public void showG(){
		System.out.println("He is GrandFather");
	}
	}
//Inherits properties of GrandFather
class Parent extends GrandParent{
	public void showP() {
		System.out.println("He is Father");
		}
}
class Child1 extends Parent{
	public void showS() {
		System.out.println("He is the son");
	}
}

public class Child2 extends Parent{
	public void showD() {
		System.out.println("He is the second son");
	}
	
	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.showS();
	
		
		Child2 obj2 = new Child2();
		obj2.showD();
		Parent ob = new Parent();
		ob.showP();
		ob.showG();
	}

	
	
	}


