package com.dl.seven.args;

public class Eg1 {
	public void createAccount(String userName, String adress, long contact){
	System.out.println("UserName:" + userName);
	System.out.println("Adress:" + adress);
	System.out.println("Contact:" + contact);    
	}

	
	public static void bankDetails(String bankName, String bankAdress, String Ifsc) {
		System.out.println("bankName:" + bankName);
		System.out.println("bankAdress:" + bankAdress);
		System.out.println("Ifsc:" + Ifsc);
		}
	public static void main(String[] args) {
		new Eg1().createAccount("Mallikarjun", "Chitrapuri colony", 9177832353l);
		
		Eg1.bankDetails("ICICI", "Madhapur", "ICIC0835678");

	}

}