package com.dl.Two;

public class UserProfileImpl {
	int userId;
	UserProfile userProfile[];
	
     public UserProfileImpl(int userId, UserProfile[] userProfile) {
	    this.userId = userId;
		this.userProfile = userProfile;
	}
     
     
		public void Display() {
			System.out.println(userId);
		for (UserProfile userProfile2 : userProfile) {
			System.out.println(userProfile2.firstName);
			System.out.println(userProfile2.lastName);
			System.out.println(userProfile2.address);
			System.out.println(userProfile2.job);
			System.out.println(userProfile2.contact);
			}
	}
     
    public static void main(String[] args) {
    	UserProfile profile2 = new UserProfile("Aditya", "Verma", "Madhapur", "Web Develper", 9876543210L);
    	UserProfile profile1[] = {profile2};
        UserProfileImpl userprofileImpl = new UserProfileImpl(101, profile1);
        userprofileImpl.Display();
          
    	
         
	}

}
