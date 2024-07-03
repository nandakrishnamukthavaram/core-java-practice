
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(5, 6));
        System.out.println(add(5, 6, 7));
        System.out.println(add(5.5, 6.6));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }
}
