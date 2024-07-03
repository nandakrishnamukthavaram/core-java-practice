public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a++ == 11 || a++ == 11 || a++ == 12) {
            System.out.println(a + "" + b + "" + c);
        }
        System.out.println(a + "" + b + "" + c);
    }
}
