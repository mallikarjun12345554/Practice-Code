package com.dl.one;

class A {
	
}
public class Eg5 {

	//Primitive data types reference comparison(==)
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int c = 10;
		System.out.println(a==b);
		System.out.println(a==c);
		
		//Literal reference comparison(==) 
		String s1 = "Java";
		String s2 = "Python";
		String s3 = "Java";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		
		String s4 = new String("Java");
		String s5 = new String("Java");
		System.out.println(s4==s5);
		
		//new
		A aa = new A();
	    //System.out.println(aa);
	    System.out.println(aa.hashCode());
	    
	    A aaa = new A();
	    System.out.println(aaa.hashCode());
	    
	    //equals method (comparison method)
	    System.out.println(aa.equals(aaa));//false
	    
	    
		
	}

}
