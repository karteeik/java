// Using this() to Return the Current Object

public class ThisThree{
    ThisThree getObject() {
        return this;  // Returns the current object
    }

    void show() {
        System.out.println("Method called using this keyword");
    }

    public static void main(String[] args) {
        ThisThree obj = new ThisThree();
        obj.getObject().show();  // Calls show() using returned object
    }
}
