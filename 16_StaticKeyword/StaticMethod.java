//static Methods

//Can be called without creating an object. then use class name
//Cannot use this or super.
//Can only access static variables and methods.
class Test{
    static int square(int x) {
        return x * x;
    }
}

public class StaticMethod{
    public static void main(String[] args) {
        System.out.println(Test.square(2));  // No object needed
    }
}
