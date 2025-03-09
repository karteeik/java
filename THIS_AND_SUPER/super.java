// Super keyword - The super keyword refers to the parent class (superclass). It is used to:
// Call parent class constructor
// Access parent class methods
// Access parent class variables

class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super();  // Calls Parent constructor
        System.out.println("Child class constructor");
    }
}

class SuperKeyword{
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
