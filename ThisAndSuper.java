class A extends Object { // Every class extends Object class by default.
    public A() {
        System.out.println("Default constructor of A is Called.");
    }

    public A(int a) {
        System.out.println("Parameterized constructor of A is Called.");
    }
}

class B extends A { // When it extends a class, the Object class is replaced by the parent class
    /*
     * Super function is the default constructor of the parent function.
     * It is by default present at the begining of every constructor of every class.
     * We can program which parent constructors to execute by manually mensioning it
     * in the code.
     */
    public B() {
        super(); // present by default.
        System.out.println("Default constructor of B is Called.");
    }

    public B(int a) {
        super(a); // Customised by programmer.
        System.out.println("Parameterized constructor of B is Called.");
    }

    public B(byte a) {
        this();
        /*
         * this() calls a constructor of the same class depending on the parameters.
         * can't call the same constructor which results in infinite recursion.
         * 
         */
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        new B();
        new B(10);
    }
}
