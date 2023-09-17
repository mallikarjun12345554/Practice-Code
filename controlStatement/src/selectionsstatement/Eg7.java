package selectionsstatement;

public class Eg7 {

	public static void main(String[] args) {
		
		float userSalary = 300000f;
		if(userSalary == 100000) {
			System.out.println("The adequate amount of salary is 100000");
			
		}
		else if(userSalary == 200000) {
			System.out.println("200000 is the amount of salary is more than the adequate");
			
		}
		else if(userSalary == 300000) {
			System.out.println("300000 is the wonderful salary for the best work done");
			
		}
		
		else {
			System.out.println("The salary is out of range");
		}
	}

}
