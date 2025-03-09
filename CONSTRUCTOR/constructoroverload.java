//constructor overloading
class Car {
    	String model;
    	int price;

    	Car() {  // Default Constructor
        	model = "Unknown";
        	price = 0;
    	}

    	Car(String m) {  // Constructor with 1 parameter
        	model = m;
        	price = 10000;
    	}

    	Car(String m, int p) {  // Constructor with 2 parameters
        	model = m;
        	price = p;
    	}

    	void show() {
        	System.out.println("Model: " + model + ", Price: " + price);
    	}

    	public static void main(String[] args) {
    	    	Car c1 = new Car();
        	Car c2 = new Car("Toyota");
        	Car c3 = new Car("Honda", 20000);
        	c1.show();
        	c2.show();
        	c3.show();
   	}
}
