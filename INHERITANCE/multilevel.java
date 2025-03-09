//multilevel inheritance
class Animal {
    void eat() {
        System.out.println("I can eat");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("I can walk");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("I can bark");
    }
}

class MultilevelInheritanceEx{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal
        myDog.walk(); // Inherited from Mammal
        myDog.bark(); // Own method
    }
}
