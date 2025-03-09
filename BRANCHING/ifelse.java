//branching statement - decision making statement we use certain section of codebased specific condition.

// if statement 
// if-else statement
// if-else if ladder
// switch statement

class index{
	public static void main(String[] args){

		//if-else
		int a=5;
		if(a>0){
			System.out.println(a+" is positive number");
		}
		else{
			System.out.println(a+" is negetive number");
		}
		
		//if-else if ladder 	
		int marks=97;
		if(marks>90){
			System.out.println("grade A");
		}
		else if(marks>80){
			System.out.println("grade B");
		}
		else if(marks>70){
			System.out.println("grade C");
		}
		else{
			System.out.println("fail");
		}

		//switch statement
		int day = 78;
		switch (day)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			default:
				System.out.println("Invalid day");
		}
	}
}