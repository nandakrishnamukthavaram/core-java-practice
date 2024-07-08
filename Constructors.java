class Car {
    Car() {
        System.out.println("Object of car is created without any details");
    }

    String name;
    String model;

    Car(String name, String model) {
        System.out.println("Object of car is created");
        this.name = name;
        this.model = model;
        System.out.println(this.name + " " + this.model + " is been added");
    }
}

public class Constructors {
    public static void main(String[] args) {
        Car c1 = new Car("Lamborghini", "Aventador");
        Car c2 = new Car("BMW", "X7");
        Car c3 = new Car();
        c3.name = "Audi";
        c3.model = "A8";

        System.out.println();

        System.out.println(c1.name + " " + c1.model);
        System.out.println(c2.name + " " + c2.model);
        System.out.println(c3.name + " " + c3.model);
    }
}
