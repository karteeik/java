// this keyword - The this keyword refers to the current object. It is used to:-
// Differentiate instance variables from local variables
// Call another constructor in the same class
// Return the current object
// Pass the current object as a parameter

class ThisOne{
    int x; // Instance variable

    // Differentiate instance variables from local variables
    ThisOne(int x) {  
        this.x = x;  // `this.x` refers to instance variable, `x` is local
    }

    void display() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        ThisOne obj = new ThisOne(10);
        obj.display();
    }
}
