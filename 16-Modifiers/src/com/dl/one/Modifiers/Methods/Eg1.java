package com.dl.one.Modifiers.Methods;

public class Eg1 {
	public void m1() {
		System.out.println("M1 Public Method");
	}
    protected void m2() {
    	System.out.println("M2 Protected Method");
    }
    void m3() {
    	System.out.println("M3 Default Method");
    }
    private void m4() {
    	System.out.println("M4 Private Method");
    }
	public static void main(String[] args) {
		Eg1 eg1 = new Eg1();
		eg1.m1();
		eg1.m2();
		eg1.m3();
		eg1.m4();
                    
	}

}
