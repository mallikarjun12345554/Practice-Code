package com.dl.Two;

//If we use the different variables for the instance variables and for parameters has effect
//There is no need to use the this keyword while using the different variables
public class CreateAccount {
	int userId;
    String fName;
    String lName;
    String email;
    long contactNo;
    String experience;
    
    public CreateAccount(int uId, String firstName, String lastName, String gmail, long contactNumber, String Experience) {
		
		userId = uId;
		fName = firstName;
		lName = lastName;
		email = gmail;
		contactNo = contactNumber;
		experience = Experience;
		}
	public void display() {
		System.out.println(userId);
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(email);
		System.out.println(contactNo);
		System.out.println(experience);
		}
	
	public static void main (String [] args) {
		 CreateAccount create = new CreateAccount(6556454, "Nitish", "Kumar", "ymanikanta299@gmail.com", 65498454L, "Five Years experience");
		 create.display();
		
	}

}



