// The static keyword in Java is used for memory management and allows methods, variables, blocks, and nested classes to belong to the class rather than an instance of the class.

//static Variables (Class Variables)
class Student {
    static String schoolName = "XYZ School";  // Static variable
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " studies at " + schoolName);
    }
}

class StaticVariable{
    public static void main(String[] args) {
        Student s1 = new Student("john");
        Student s2 = new Student("rohan");

        s1.display();
        s2.display();
    }
}
