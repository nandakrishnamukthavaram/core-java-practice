public class TypeConversions {
    static void PrimitiveImplicit() {
        // byte -> short -> int -> long -> float -> double
        byte byteValue = 127;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
    }

    static void PrimitiveExplicit() {
        // double -> float -> long -> int -> short -> byte
        double doubleValue = 123456789.012345678901;
        float floatValue = (float) doubleValue;
        long longValue = (long) floatValue;
        int intValue = (int) longValue;
        short shortValue = (short) intValue;
        byte byteValue = (byte) shortValue;
        System.out.println("Double: " + doubleValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Long: " + longValue);
        System.out.println("Int: " + intValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Byte: " + byteValue);
    }

    public static void main(String[] args) {
        // Primitive casting
        PrimitiveImplicit();
        PrimitiveExplicit();
        // Upcasting and downcasting after revising classes and methods
    }
}
