public class Parameterized{
	
	int age;
	String name;
	
	Parameterized(int a,String n){		//parameterized constructor
		age=a;
		name=n;
	}

	void display(){
		System.out.println("value of parameterized constructor is : "+age+ " and "+name);
	}
	
	public static void main(String[] args){

		Parameterized obj=new Parameterized(24,"john due");
		obj.display();
	}
}