class A {
    public A() {
        System.out.println("Object of A is created.");
    }

    public void show() {
        System.out.println("A is shown.");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new A(); // This is an anonymous object with no name.
        new A().show(); // We can access its functions this way.
    }
}