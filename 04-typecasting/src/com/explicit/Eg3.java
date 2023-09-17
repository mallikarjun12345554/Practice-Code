package com.explicit;

public class Eg3 {
	//Explicit type casting conversion

	public static void main(String[] args) {
            double d = 65.0d;
            System.out.println(d);
            
            float f = (float)d;
            System.out.println(f);
            
            long l = (long)f;
            System.out.println(l);
            
            int i = (int)l;
            System.out.println(i);
            
            char ch = (char)i;
            System.out.println(ch);
            
            short s = (short)ch;
            System.out.println(s);
            
            byte b = (byte)s;
            System.out.println(b);
            		
	}

}
