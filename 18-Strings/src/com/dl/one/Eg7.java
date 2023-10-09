package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {
                
		        String s1 = "Java";
		        String s2 = "Java";
		        String s3 = "Python";
		        System.out.println(s1);//1 object in scp area
		        System.out.println(s2);//1 object in scp area
		        System.out.println(s3);//1 object in scp area
		        
		        String s4 = s1.concat(s3);
		        System.out.println(s4);//1 object in heap area
	}

}
