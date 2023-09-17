package selectionsstatement;

public class Eg12 {

	public static void main(String[] args) {
		int key = 10;
		switch (key) {
		case 30: {
			System.out.println("This is the case 30");
		}
			
			break;
       case 10: {
	   System.out.println("This is the case for value 10");
}
			
			break;
			
      case 20: {
	  System.out.println("This is the case match for the value 20");
       }
	
	  break;

		default: {
			System.out.println("The implemented switch case is wrong please"
					+ " check for the error or the mistake in the code.");
		}
			break;
		}
		if (key==10) {
			System.out.println("The case is matched with the 10");
			
		} 
		else if(key==20){
			System.out.println("The case is matched with the 20");
		}
		else if (key==30) {
			System.out.println("The case is matche with 30");
			}
		else {
			System.out.println("The key for the last is 55");
		}
	}
	

}
