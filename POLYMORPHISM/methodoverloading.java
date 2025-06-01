// polymorphism - Polymorphism means "many forms." In Java, it allows the same method or operator to behave differently based on the object that calls it.
// 2 types of polymorphism 

// 1) compile-time polymorphism - method overloading 
// Same method name, different parameters (method overloading).
// Resolved at compile time (determined by argument types).

class MathOperations{
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5, 10));         // Calls add(int, int)
        System.out.println(obj.add(5, 10, 15));     // Calls add(int, int, int)
        System.out.println(obj.add(5.5, 2.5));      // Calls add(double, double)
    }
}
