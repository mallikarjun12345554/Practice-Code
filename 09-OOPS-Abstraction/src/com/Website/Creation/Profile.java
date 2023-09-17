package com.Website.Creation;
//Abstract class doesn't allow the Object creation but allow instance block creation
//To execute instance block by creating the object the new class should be taken

public abstract class Profile {
  {
	System.out.println("Instance Method");
	}
	static {
		System.out.println("Static Block");
	}
	

	public static void main(String[] args) {
         
	}

}
