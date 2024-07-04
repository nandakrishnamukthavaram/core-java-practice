class IPhone {
    static String brand = "Apple"; // Static variable (same for all objects)
    int version = 15; // Instance variable (could vary for various objects)
    String model = "pro";

    IPhone(int version, String model) {
        this.version = version;
        this.model = model;
    }// This is a constructor

    void about() {
        System.out.println(brand + " : " + version + " : " + model);
    }

    static void show(IPhone obj) {
        System.out.println(brand + " : " + obj.version + " : " + obj.model);

    }// this is how you access an instance variable in a static method
}

public class StaticVariable {
    public static void main(String[] args) {
        IPhone krishnasPhone = new IPhone(15, "Basic");
        IPhone mokshasPhone = new IPhone(14, "Pro Max");
        IPhone diwasPhone = new IPhone(13, "Basic");
        krishnasPhone.about();
        mokshasPhone.about();
        diwasPhone.about();
        System.out.println(IPhone.brand);// This is a class property, not an object property.
        IPhone.show(krishnasPhone);// this is how you access an instance variable in a static method
    }
}
