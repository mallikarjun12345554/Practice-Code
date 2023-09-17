package com.dl.four;

public class BankBranch {
	public BankBranch() {
		System.out.println("Default constructor of Bank Branch");
	}
	public BankBranch(String bankBranch) {
		this();
		System.out.println("Bank Branch: " +bankBranch);
	}

	public static void main(String[] args) {
              new BankBranch("Khajaguda");
              
	}

}
