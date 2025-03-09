// Access parent class variable using super()

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);  // Access parent variable
    }
}

class SuperKeyword2{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();	
    }
}
