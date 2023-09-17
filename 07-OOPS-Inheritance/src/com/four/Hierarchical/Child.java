package com.four.Hierarchical;
//In Hierarchical inheritance all the child class will get the properties of Grand Parent 

//Creating a GrandParent class
class GrandParent extends Object{
	public void properties() {
		System.out.println("Properties from Grand Parent");
		
	}
}
//Creating a Parent class 
 class Parent extends GrandParent{
	 public void properties() {
			System.out.println("Properties from Parent can modify");
	 }
 }
 //Creating a child class 
public class Child extends GrandParent{
	public void properties(){
		System.out.println("Properties form child can modify");
	}	
		
	public static void main(String[] args) {
     GrandParent child= new GrandParent();
     child.properties();
     Parent child2 = new Parent();
     child2.properties();
     Child child3 = new Child();
     child3.properties();




		}
	

}
