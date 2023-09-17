package com.dl.three;

public class ClientImpl implements ClientOne, ClientTwo {

	@Override
	public void m3() {
		System.out.println("M3 Method");
		
	}

	@Override
	public void m4() {
       System.out.println("M4 Method");		
	}

	@Override
	public void m1() {
       System.out.println("M1 Method");		
	}

	@Override
	public void m2() {
        System.out.println("M2 Method");		
	}

	
	

}
