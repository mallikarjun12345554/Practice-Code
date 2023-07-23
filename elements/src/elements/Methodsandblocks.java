package elements;

//CURD operation
public class Methodsandblocks {
	public void createCustomer() {
		System.out.println("createCustomer");
				}
	public void updateCustomer() {
		System.out.println("updateCustomer");
	}
	public void readCustomer() {
		System.out.println("readCustomer");
	}
	public void deleteCustomer() {
		System.out.println("deleteCustomer");
	}

    public static void bankDetails() {
    	System.out.println("mallikarjun bank");
    }
	public static void main(String[] args) {
		new Methodsandblocks().createCustomer();
		new Methodsandblocks().updateCustomer();
		new Methodsandblocks().readCustomer();
		new Methodsandblocks().deleteCustomer();
	    Methodsandblocks.bankDetails();
		
		
		
		
		
	}

}
