package com.Website.Creation;

public abstract class O1_WebDeveloper {
	public void create() {
		System.out.println("Developer: Writes the Source Code");
	}
	public void submit() {
		System.out.println("Developer: Submits the source code for testing");
	}
	public abstract void testerFindsError();
	public abstract void testerRemovestheError();	
	
	public static void main(String[] args) {
      
	}

}
