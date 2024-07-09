class Computer {
    String brand = "Apple";
    int price = 87000;

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}

class Laptop {
    String brand = "Apple";
    String model = "Air";
    int version = 2;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + version;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (version != other.version)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", model=" + model + ", version=" + version + ", hashCode()=" + hashCode()
                + ", getClass()=" + getClass() + "]";
    }

}

public class ObjectClass {
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        System.out.println(myComputer.toString());
        // myLaptop by default returns myLaptop.toString()
        // and it returns getClass().getName() + "@" + Integer.toHexString(hashCode())
        Laptop myLaptop = new Laptop();
        System.out.println(myLaptop);
        System.out.println(myLaptop.toString());

    }
}