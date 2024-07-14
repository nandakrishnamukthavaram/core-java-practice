class A {
    public void show() throws ClassNotFoundException {
        System.out.println("In A.show()");
        String s = Class.forName("DuckingException").toString();
        System.out.println(s); // Prints "class DuckingException".
        s = Class.forName("calsi").toString(); // Execution stops at the first error.
        System.out.println(s); // Not Executed
        System.out.println("End of A.show()"); // Not executed
    }
}

public class DuckingException {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.show();
        } catch (ClassNotFoundException e) {
            System.out.println("In catch block");
            e.printStackTrace();
        }
        System.out.println("End of main");
    }
}
