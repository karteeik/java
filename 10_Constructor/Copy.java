public class Copy {

	int age;
	String name;

	Copy(int a, String n) { // parameterized constructor
		age = a;
		name = n;
	}

	Copy(Copy C) { // copy constructor
		age = C.age;
		name = C.name;
	}

	void display() {
		System.out.println("value of copy constructor is : " + age + " and " + name);
	}

	public static void main(String[] args) {

		Copy obj = new Copy(24, "john due");
		Copy obj1 = new Copy(obj);
		obj.display();
		obj1.display();
	}
}