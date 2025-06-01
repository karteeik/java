// 2) run-time polymorphism - method overriding
// Same method name, same parameters (method overriding).
// Decided at runtime (determined by the actual object).

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the method
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the method
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Dog object, but reference is of type Animal
        Animal a2 = new Cat();  // Cat object, but reference is of type Animal
        
        a1.makeSound();  // Calls Dog's makeSound() (Runtime polymorphism)
        a2.makeSound();  // Calls Cat's makeSound() (Runtime polymorphism)
    }
}
