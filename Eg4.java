package elements;

public class Eg4 {
	
	String fName = "19J25A0318";
	String lName = "Yalala";
	String cAddress = "Chitrapuri colony";
	String cMail = "ymallikarjun299@gmail.com";
	long mobileNo = 9177832353l;
	long adhaarNo = 728326797078l;
	
	//Static variable bank details
	static String bankName = "ICICI";
    static String bankAdress = "Puppalguda";	
    static String bankIfscNo	= "ICICI00322";
    
	public static void main(String[] args) {
		System.out.println(new Eg4().fName);
		System.out.println(new Eg4().lName);
		System.out.println(new Eg4().mobileNo);
		System.out.println(new Eg4().adhaarNo);
		System.out.println(new Eg4().cAddress);
		System.out.println(new Eg4().cMail);
		System.out.println(Eg4.bankName);
		System.out.println(Eg4.bankAdress);
		System.out.println(Eg4.bankIfscNo);
		System.out.println(new Eg3().studentId1);
				
		
		

	}

}
