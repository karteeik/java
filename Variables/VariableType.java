//A variable is a container which holds the value while the Java program is executed. Variable is a name of memory location.
//three types of variables in java 

//1) local 
//2) instance 
//3) static
class VariableType{
	static int  b=20;		//static var - using static keyword delared static var 
	int c=30;		//instance var - declared inside the class but outside of all the methods 
	public static void main(String[] args){

		//three types of variables in java 

		//1) local 
		//2) instance 
		//3) static

		int a=10;		 //local var - declared inside body of the method or method parameters

		VariableType obj = new VariableType();		//creat new object

		System.out.println("local variable : "+a);		// local var direct access
		System.out.println("static variable : "+VariableType.b); 		//static var class name through access
		System.out.println("instance variable : "+obj.c);		//instance var object through
	}
}