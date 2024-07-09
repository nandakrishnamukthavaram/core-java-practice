class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    B(int a) {
        this.a = a;
    }

    void show() {
        System.out.println("B");
    }

    void show1() {
        System.out.println("B2");
    }

    int a;
}

public class ObjectCasting {
    public static void main(String[] args) {
        // UpCasting
        A obj = new B(62); // equivalent to "A obj = (A) new B();"
        obj.show();
        // obj.show1(); error
        // System.out.println(obj.a); error
        // the above lines gives errors because obj is stored in a container A which
        // doesn't have the methods or properties which are defined or instantiated in
        // its child class.
        // DownCasting
        B obj1 = (B) obj;
        obj1.show1();
        System.out.println(obj1.a);
    }
}
