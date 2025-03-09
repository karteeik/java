// Access parent class methods using super()

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        super.makeSound();  // Calls Parent's method
        System.out.println("Dog barks");
    }
}

class SuperKeyword1{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
