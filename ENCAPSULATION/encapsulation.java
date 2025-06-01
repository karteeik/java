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
		System.out.println("balance is : "+ obj.getBalance());

	}
}