package com.dl.one;

class Products {
	int pid;
	String pName;
	
	public Products(int pid, String pName) {
		this.pid = pid;
		this.pName = pName;
	}
	
}

public class Eg9 {

	public static void main(String[] args) {
		 Products p1 = new Products(101, "Samsung");
		 System.out.println(p1.hashCode());
		 
		Products p2 = new Products(102, "Iphone");
		System.out.println(p2.hashCode());
		
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		String s3 = "A";
		String s4 = "A";
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3 == s4);
		
		
		
		
		
        
	}

}
