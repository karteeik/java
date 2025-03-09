class CopyEx{
	
	int age;
	String name;
	
	CopyEx(int a,String n){		//parameterized constructor
		age=a;
		name=n;
	}
	
	CopyEx(CopyEx C){		//copy constructor
		age=C.age;
		name=C.name;
	}

	void display(){
		System.out.println("value of copy constructor is : "+age+ " and "+name);
	}
	
	public static void main(String[] args){

		CopyEx obj=new CopyEx(24,"john due");
		CopyEx obj1=new CopyEx(obj);
		obj.display();
		obj1.display();
	}
}