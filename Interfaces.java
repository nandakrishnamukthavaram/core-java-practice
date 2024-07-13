/*
 * Interfaces are must contain only abstract method
 */
interface Computer {
    void code();
}

abstract class Mobile implements Computer {
}

abstract class A {
}

abstract class B {
}

// abstract class C extends A,B{} // error
// Multiple inheritance is neither possible in concrete nor abstract class but
// possible in interfaces.
interface D {
}

interface E {
}

interface F extends D, E {
}

class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("Coding...");
    }
}

class Desktop implements Computer {

    @Override
    public void code() {
        System.out.println("Coding faster");
    }

}

class Employee {
    public void work(Computer com) {
        com.code();
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Employee emp = new Employee();
        emp.work(lap);
        emp.work(desk);
    }
}