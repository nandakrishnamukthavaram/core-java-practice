class Demo {
    private String pvtname = "Nanda ";

    String getName() {
        return pvtname;
    }

    void setName(String pvtname) {
        this.pvtname = pvtname;
    }
}

public class Encapsulation {
    // Encapsulation is a process of privatising the data to a class.
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.getName());
        obj.setName("Krishna");
        System.out.println(obj.getName());
    }
}
