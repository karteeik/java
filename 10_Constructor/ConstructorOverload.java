//constructor overloading
public class ConstructorOverload {
    	String model;
    	int price;

    	ConstructorOverload() {  // Default Constructor
        	model = "Unknown";
        	price = 0;
    	}

    	ConstructorOverload(String m) {  // Constructor with 1 parameter
        	model = m;
        	price = 10000;
    	}

    	ConstructorOverload(String m, int p) {  // Constructor with 2 parameters
        	model = m;
        	price = p;
    	}

    	void show() {
        	System.out.println("Model: " + model + ", Price: " + price);
    	}

    	public static void main(String[] args) {
    	    ConstructorOverload c1 = new ConstructorOverload();
        	ConstructorOverload c2 = new ConstructorOverload("Toyota");
        	ConstructorOverload c3 = new ConstructorOverload("Honda", 20000);
        	c1.show();
        	c2.show();
        	c3.show();
   	}
}
