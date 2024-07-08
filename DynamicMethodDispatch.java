class A {
    void callme(int a) {
        System.out.println("Inside A's callme method with input" + a);
    }

    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B extends A {
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C extends A {
    void callme(char c) {
        System.out.println("Inside C's callme method");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A r;
        r = new A();
        r.callme();
        r = new B();
        r.callme();
        r = new C();
        r.callme();
        A obj = new A();
        obj.callme(10);
        A aobj = (A) new B();
        aobj.callme(10);

        C bobj = (C) new A(); // error
        bobj.callme('a');
        /*
         * We can create an instance of Parent class and assign a child class.
         * But vise versa is not supported.
         * Method overriding is seen.
         * Line 34 : error cant convert Parent obj to child
         */
    }
}