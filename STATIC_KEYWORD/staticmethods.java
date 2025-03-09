//static Methods

//Can be called without creating an object.
//Cannot use this or super.
//Can only access static variables and methods.
class Test{
    static int square(int x) {
        return x * x;
    }
}

class StaticMethod{
    public static void main(String[] args) {
        System.out.println(Test.square(5));  // No object needed
    }
}
