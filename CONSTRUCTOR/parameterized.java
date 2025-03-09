class ParameterizedEx{
	
	int age;
	String name;
	
	ParameterizedEx(int a,String n){		//parameterized constructor
		age=a;
		name=n;
	}

	void display(){
		System.out.println("value of parameterized constructor is : "+age+ " and "+name);
	}
	
	public static void main(String[] args){

		ParameterizedEx obj=new ParameterizedEx(24,"john due");
		obj.display();
	}
}