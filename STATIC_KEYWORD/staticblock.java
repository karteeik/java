// static Blocks
// Used to initialize static data.
// Runs only once when the class is loaded into memory.
// Executes before main() method.

class StaticBlock{
    static {
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
