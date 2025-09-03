public class Unary{
    public static void main(String[] args) {
        int a = 5,b=10;
        
        System.out.println(a++); // 5 (prints first, then increases)
        System.out.println(++a); // 7 (increases first, then prints)
        System.out.println(b--); // 10 (prints first, then increases)
        System.out.println(--b); // 8 (increases first, then prints)
    }
}
