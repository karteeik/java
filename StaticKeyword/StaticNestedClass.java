// static Nested Class
// A static class inside another class.
// Can access only static members of the outer class.

class Outer{
    static String message = "Hello from Outer";

    static class Inner{
        void display() {
            System.out.println(message);  // Can access static members of Outer
        }
    }
}

public class StaticNestedClass{
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}
