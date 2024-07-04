class Demo {
    private String pvtname = "Nanda ";

    String getName() {
        return pvtname;
    }
}

public class Encapsulation {
    // Encapsulation is a process of privatising the data to a class.
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.getName());
    }
}
