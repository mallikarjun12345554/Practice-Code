package com.Website.Creation;

public class O3_Client extends O2_Tester {
	public void clienttestwebsite() {
		System.out.println("Client tests the website and is happy that the"
				+ "website runs perfectly ");
	}

	public static void main(String[] args) {
         O2_Tester tester = new O2_Tester();
         tester.create();
         tester.submit();
         tester.testerFindsError();
         tester.testerRemovestheError();
         O3_Client client = new O3_Client();
         client.clienttestwebsite();
	}

}
