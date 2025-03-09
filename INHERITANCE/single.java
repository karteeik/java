// inheritance - Inheritance is the process by which a class can acquire the properties and methods of its parent class
// types of inheritance - 
// 1) single inheritance
// 2) multilevel inheriatance
// 3) multiple inheritance - not supported in  java
// 4) hierarchical inheritance
// 5) hybrid inheritance - not supported in java
// Parent class
class Animal {
    void eat() {
        System.out.println("I can eat");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("I can bark");
    }
}

class SingleInheritanceEx{   
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark(); //  Own method
    }
}
