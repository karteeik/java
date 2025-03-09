//it used to this() calls another constructor in the same class to avoid duplicate code.
class ThisKeyword1{
    String name;
    int age;

    ThisKeyword1() {
        this("Unknown", 0);  // Calls the constructor with parameters
    }

    ThisKeyword1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ThisKeyword1 p1 = new ThisKeyword1();  // Calls default constructor
        p1.display();
        
        ThisKeyword1 p2 = new ThisKeyword1("Alice", 25);
        p2.display();
    }
}
