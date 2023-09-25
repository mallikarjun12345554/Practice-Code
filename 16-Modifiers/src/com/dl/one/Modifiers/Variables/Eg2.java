package com.dl.one.Modifiers.Variables;
//Private method and variables can be accessed in the same class
//Protected method and variables can be accessed throughout the package
//public method and variables can be accessed through anywhere and any packge
//default can only be accessed through same variable

public class Eg2  {
	
//	private final int eid = 101;
//	private final static int sid = 102;
//	
//	 public final int eid = 101;
//	 public final static int sid = 102;
//	 
//	  final int eid = 101;
//	  final static int sid = 102;
	
	protected final int eid = 101;
	 protected final static int sid = 102;
	
	
	public static void main(String[] args) {
		System.out.println(new Eg2().eid);
		System.out.println(sid);
		
		
	}

}
