// Using this() to Return the Current Object

class Thiskeyword2{
    Thiskeyword2 getObject() {
        return this;  // Returns the current object
    }

    void show() {
        System.out.println("Method called using this keyword");
    }

    public static void main(String[] args) {
        Thiskeyword2 obj = new Thiskeyword2();
        obj.getObject().show();  // Calls show() using returned object
    }
}
