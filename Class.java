class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class Class {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(a, b));
    }
}
