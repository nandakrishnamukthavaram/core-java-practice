// If we re-define a parent-method in a child class, it is overridden. 
class A {
    public void show() {
        System.out.println("A is shown.");
    }
}

class B extends A {
    public void show() {
        System.out.println("B is shown.");
    }
}

class C extends B {
    public void show() {
        System.out.println("C is shown.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.show();

        B b = new B();
        b.show();

        C c = new C();
        c.show();
    }
}