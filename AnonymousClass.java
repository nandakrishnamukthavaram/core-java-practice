abstract class Car {
    abstract void run();

    void stop() {
        System.out.println("Car is stopped");
    }

    public void playMusic() {
        System.out.println("Playing Music");

    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        /*
         * Here is the syntax of an anonymous class.
         * Its inside the AnonymousClass class hence, its an inner class
         * we can define or modify any method in this class.
         * The created object is same as an object of a class that extends the class.
         */
        Car car = new Car() {
            @Override
            void run() {
                System.out.println("Car is running");
            }
        };
        car.run();
        car.stop();
        car.playMusic();
    }
}