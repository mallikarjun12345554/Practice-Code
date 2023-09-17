package com.dl.two;

   public class Eg1{

   public static void main(String[] args) {
     int a = 10;
     int b = 10;
     boolean c = a++ != 10 || b++ == 10;
     System.out.println(c);
     System.out.println(b);
     System.out.println(b);
     
     boolean c1 = a++ !=10 && b++ != 10;
     System.out.println(c1);
     System.out.println(a);
     System.out.println(b);
     


}


}
