package com.dl.one;

public class Eg3 {
	//Even concatenation of two Strings by using the new keyword,
	//will store in the heap memory only
    //If the scp data is used to concat then the same data will concat and saved 
	//in the heap memory the original data is immutable in scp
    
	
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Python";
		String s3 = "Java Script";
		String s7 = s1.concat(s2);//heap memory
		String s8 = s2.concat(s7);//heap memory
		String s9 = s3.concat(s8);//heap memory
		
		System.out.println(s1);//scp memory 
		System.out.println(s2);//scp memory
		System.out.println(s3);//scp memory
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		
		String s4 = new String("Java");//scp and heap memory
		String s5 = new String("Python");//scp and heap memory
		String s6 = new String("Java Script");//scp and heap memory
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		String s10 = new String(s4.concat(s6));//heap memory
		System.out.println(s10);
		String s11 = new String(s4.concat(s5));//heap memory
		System.out.println(s11);
		String s12 = new String(s6.concat(s10));//heap memory
		System.out.println(s12);
		String s13 = new String(s11.concat(s12));//heap memory
		System.out.println(s13);
		System.out.println(s12.concat(s13));//heap memory
		
		
	}

}
