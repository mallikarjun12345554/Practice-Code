package com.SettersAndGetter;

class Register{
	private String fName;
	private String lName;
	private String gender;
	private int age;
	private long contact;
	public String getfName() {
		return fName;
	}
	//setters and getters
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	}
//Creating Object to the above Instant Variables
public class RegisterImpl extends Register{
	public static void main(String[] args) {
		Register register = new Register();
		register.setfName("Raghu");
		register.setlName("Nandhan");
		register.setGender("Male");
		register.setAge(25);
		register.setContact(9885880088L);
		
		System.out.println(register.getfName());
		System.out.println(register.getlName());
		System.out.println(register.getGender());
		System.out.println(register.getAge());
	    System.out.println(register.getContact());
	}
}
   
	

       
	


