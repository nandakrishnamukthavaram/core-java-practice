class Counter {
    static int count = 0;

    // Use synchronized keyword to avoid race condition.
    public static synchronized void increment() {
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) {

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
                // try {
                // Thread.sleep(8);
                // } catch (Exception e) {
                // System.out.println(e);
                // }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
                // try {
                // Thread.sleep(8);
                // } catch (Exception e) {
                // System.out.println(e);
                // }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        // try {
        // t1.join();

        // } catch (Exception e) {
        // System.out.println(e);
        // }

        // try {
        // Thread.sleep(1);
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        System.out.println(Counter.count);

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Counter.count);
    }
}
