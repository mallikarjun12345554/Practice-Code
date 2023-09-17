package com.Method.OverRiding;

class RBI {
	public int returnrateofinterest() {
		return 0;
	}
}
class SBI extends RBI{
	

public int returnrateofinterest() {
	return 5;
}
}
class HDFC extends RBI{
	public int returnrateofinterest() {
		return 7;
	}
}
class UNION extends RBI{
	public int returnrateofinterest() {
		return 6;
	}
}
public class Eg2 extends RBI{

	public static void main(String[] args) {
    RBI r = new SBI();
    System.out.println(r.returnrateofinterest());
     RBI b = new HDFC();
     System.out.println(b.returnrateofinterest());
     RBI i = new UNION();
     System.out.println(i.returnrateofinterest());
     RBI c = new RBI();
     System.out.println(c.returnrateofinterest());
     
	}

}
