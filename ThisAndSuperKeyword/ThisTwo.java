//it used to this() calls another constructor in the same class to avoid duplicate code.
public class ThisTwo{
    String name;
    int age;

    ThisTwo() {
        this("Unknown", 0);  // Calls the constructor with parameters
    }

    ThisTwo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ThisTwo p1 = new ThisTwo();  // Calls default constructor
        p1.display();
        
        ThisTwo p2 = new ThisTwo("Alice", 25);
        p2.display();
    }
}
