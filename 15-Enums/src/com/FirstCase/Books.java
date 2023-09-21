package com.FirstCase;

// Value method implementation with foreach loop
public enum Books {
	JAVABOOK, PYTHONBOOK, JAVASCRIPTBOOK;
	
	public static void main(String[] args) {
	         Books[] values = Books.values();
	         for (Books books : values) {
	        	 System.out.println(books);
	        	 System.out.println(books.ordinal());
	         
	        	 
	         }
	}
}
