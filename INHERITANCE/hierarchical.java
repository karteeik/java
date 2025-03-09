class Animal {
    void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("I can bark");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("I can meow");
    }
}

class HierarchicalInheritanceEx{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  //  Inherited from Animal
        d.bark(); //  Own method

        Cat c = new Cat();
        c.eat();  //  Inherited from Animal
        c.meow(); // Own method
    }
}
