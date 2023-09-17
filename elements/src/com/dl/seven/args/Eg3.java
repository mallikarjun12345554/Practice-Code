package com.dl.seven.args;

public class Eg3 {
	public void createAccount(String userName, String Address, long Contact) {
	System.out.println("UserName:" + userName);
	System.out.println("Adress:" + Address);
	System.out.println("Contact:" + Contact);
	}
    public static void bankDetails(String bankName, String ifsc) {
    	System.out.println("BankName:" + bankName);
    	System.out.println("IFSC:" + ifsc);}
    	
    public Eg3(String epName, String epId, String Address) {
    	System.out.println("EpName:" + epName);
    	System.out.println("EpId:" + epId);
    	System.out.println("Address:" + Address);
    }
    
	public static void main(String[] args) {
	       Eg3 eg3 = new Eg3("Dheeraj", "Dheeru12345", "Patancheru" );
	       eg3.createAccount("Manager", "Patancheru", 9177832353L);
	       Eg3.bankDetails("UnionBank", "UBIN08335648");
          
	}

}
