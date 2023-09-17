package com.seven.hasa;

 public class Employee {
	 String empName;
	 String contactNo;
	 OfficeDetails details;
	 
 public Employee(String empName, String contactNo,  OfficeDetails details ) {
		
		this.empName = empName;
		this.contactNo = contactNo;
		this.details = details;
	}
 public void display() {
	 System.out.println("Employee Name: " + empName);
	 System.out.println("Contact No: " + contactNo);
	 System.out.println("Office Name: " + details.officeDetails);
	 System.out.println("Office Address: " +details.officeAddress);
	 System.out.println("Office Pincode: " +details.officePincode);
 }
   
public static void main(String[] args) {
	OfficeDetails offc1 = new OfficeDetails("Cognizant", "Hyderabad", "500104");
	Employee employee = new Employee("Suresh", "9177832353", offc1 );
	employee.display();
	}
}