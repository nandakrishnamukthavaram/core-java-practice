public class WrapperClasses {
    public static void main(String[] args) {
        @SuppressWarnings("removal") // Ignores the depricated syntax warning for the next line.
        Integer num = new Integer(100); // Depricated Boxing method.
        Integer num1 = 20; // Auto Boxing
        System.out.println(num + num1);
        System.out.println(num.intValue() + num1.intValue());

        int a = 10;
        Integer num2 = Integer.valueOf(a); // Boxing
        int b = num2.intValue(); // Unboxing
        int c = num; // Auto Unboxing
        System.out.println(a + b + c);
        int maxnum = Integer.MAX_VALUE;
        int minnum = Integer.MIN_VALUE;
        System.out.println(maxnum + " " + minnum);
        System.out.println(Integer.compare(10, 20));

    }
}
