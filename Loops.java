public class Loops {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        // For loop
        // Normal for loop
        System.out.println("Printing using For Loop");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced for loop
        System.out.println("Printing using Enhanced For Loop");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Labeled for loop
        System.out.println("Printing using Labeled For Loop");
        label1: for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (i == 2) {
                break label1;
            }
        }

        // While loop
        int i = 0;
        System.out.println("Printing Using While loop");
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        // Do-while loop
        System.out.println("Printing Using Do-While loop");
        i = 0;
        do {
            System.out.println(numbers[i]);
            i++;
        } while (i < numbers.length);
    }
}