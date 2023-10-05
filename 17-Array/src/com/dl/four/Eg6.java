package com.dl.four;

public class Eg6 {

	public static void main(String[] args) {
		//Rows and the columns
		int b[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        for (int row = 0; row < b.length; row++) {
			
		
        for (int col = 0; col < b[row].length; col++) {
      	  System.out.println(b[row][col]+ "\t");
        }	
    System.out.println(" ");
		}
	}

}
