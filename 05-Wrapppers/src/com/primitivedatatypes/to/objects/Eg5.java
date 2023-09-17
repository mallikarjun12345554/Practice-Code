package com.primitivedatatypes.to.objects;

public class Eg5 {
	//Value of() method

	public static void main(String[] args) {
		
        int j = 10;
        while(j<=20) {
        Integer valueof = Integer.valueOf(j);
        System.out.println("Object Type:" + valueof);
        ++j;
        }
	

}
}