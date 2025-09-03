// Encapsulation -  The wrapping up of data and function into a single unit (called class) is known as encapsulation.
// It combines data hiding and abstraction. 

public class Encapsulation{
	
		private float balance;
		
		//getters
		public float getBalance(){
			return balance;
		}

		//setters
		public void setBalance(float b){
			balance=b;
		}
		 
	public static void  main(String[] args){
		
		Encapsulation obj=new Encapsulation();
		obj.setBalance(2340.34f);
		System.out.println("balance is : "+ obj.balance);

	}
}

// Advantages of Encapsulation

// Data Hiding → sensitive data (like balance, password) is protected.
// Controlled Access → use getters/setters to allow only valid updates.
// Flexibility → change implementation without breaking other code.
// Security → prevents unauthorized access to internal details.

// Real-Life Examples

// ATM machine (you can only interact via buttons, not access its code directly).
// Online shopping cart (you can add/remove items but not directly manipulate internal price calculation).
// Car (you can press accelerator/brake, but engine mechanism is hidden).