
class A extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("    " + ((2 * i) + 1));
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println((2 * i) + 2);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        obj2.start();
    }
}
