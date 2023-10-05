package com.dl.Three;

public class RecruiteDetails {
	int userId;
	char shift;
	double compensation;
	String jobDescription;
	String jobPosition;
	Profile profile[];
	
	public RecruiteDetails(int userId, char shift, double compensation, String jobDescription, String jobPosition, Profile[] profile) {
		this.userId = userId;
		this.shift = shift;
		this.compensation = compensation;
		this.jobDescription = jobDescription;
		this.jobPosition = jobPosition;
		this.profile = profile;
	}
	public void Display() {
		System.out.println("Employee Candidate Details");
		System.out.println("  ");
		System.out.println("Company offered Position for the candidate: ");
		System.out.println("User Id: " +userId);
		System.out.println("Shift: " +shift);
		System.out.println("Compensation: " +compensation);
		System.out.println("Job Description: " +jobDescription);
		System.out.println("Job Position: " +jobPosition);
		System.out.println("  ");
		
		System.out.println("Employee details captured at the time of interview: ");
		System.out.println("  ");
		for (Profile profile1 : profile) {
			System.out.println("First Name: " +profile1.fName);
			System.out.println("Last Name: " +profile1.lName);
			System.out.println("Contact Number: " +profile1.contactNo);
			System.out.println("Qualification: " +profile1.qualification);
			System.out.println("Skills: " +profile1.skills);
			System.out.println("Salary Expectation: "+profile1.salaryExpect);
			System.out.println("Shift Will: " +profile1.shiftWill);
			System.out.println("Willing to bond with the company in year: " +profile1.bondTime);
			System.out.println("Address: " +profile1.adress);
			
		}
	}


	public static void main(String[] args) {
		Profile profile2 = new Profile("Vikram", "Aditya", 9876541230L, "Btech(CSE)", "Java", 600000.0f, "Both(D&N)", 2, "Madhapur");
		Profile profile3[] = {profile2};
		RecruiteDetails recruiteDetails = new RecruiteDetails(2303, 'D', 565000.00, "Program Developement cycle", "Java Developer", profile3);
		recruiteDetails.Display();
		
		
		
		
		
      
	}

}
