public class ThreadsWithLambda {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(1);
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(8);
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
