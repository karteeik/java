//constructor - A constructor is special type of method it invoked automatically at the time of object creation.
// Same name as the class
// No return type (not even void)
// Automatically called when an object is created
// Used for object initialization

// 3 types of constructor - 
// 1)default constructor
// 2)parameterized constructor
// 3)copy constructor

public class Default{
 	Default(){ // Default constructor
 		System.out.println("Default constructor called..");
 	}
 	public static void main(String[] args){
		Default a = new Default();
		System.out.println(a);
	}
} 
