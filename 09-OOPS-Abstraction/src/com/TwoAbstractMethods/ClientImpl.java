package com.TwoAbstractMethods;

public class ClientImpl extends Client {
	
	@Override
	public void m1() {
              System.out.println("M1 Method");		
    }

	@Override
	public void m2() {
		System.out.println("M2 Method");
	}
		
		public static void main(String[] args) {
	      ClientImpl clientImpl =  new ClientImpl();
		   clientImpl.m1();
		   clientImpl.m2();
		}

}
