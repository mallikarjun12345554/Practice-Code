package com.dl.seven.args;


public class Eg2 {
	public void conversation(String arya, String naresh) {
	System.out.println("arya:" + arya);
	System.out.println("naresh:" + naresh);
	
	}
         public static void main(String[] args) {
		 new Eg2().conversation("1+2=3 man", "No its 4 :(" );
		 new Eg2().conversation("youre a illiterate fellow naresh", "you bastard my father is a lecturer and your father is a farmer" );
		 new Eg2().conversation("If your father is a lecturer it doesnt mean that you also a educated person", "how dare you to talk to me like that stupid fellow :(" );
		 new Eg2().conversation("you did'nt study while you were a small kid otherwise till now you would be like your father", "Even I did'nt study my level in the society is so high as my father is a lecturer" );
         new Eg2().conversation("Haha maaaaaaan....! Even though your father profession gives you the respect in the society, still you are a dumb idiot that you think fathers authority can change the rules of education", "Yeah man I can change the rules as per my wish");
	}

}
