// Single Abstract Method Interfaces are called Functional Interfaces
@FunctionalInterface
interface A {
    void myMethod();
}

interface B {
    String show(String str);
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
        A traditional = new A() {
            @Override
            public void myMethod() {
                System.out.println("Anonymous Inner Class");
            }
        };// This creates a new .class file
        traditional.myMethod();

        A lambda = () -> System.out.println("Lambda Expression");// this does not.
        lambda.myMethod();

        B strLambda = str -> str.toUpperCase();
        System.out.println(strLambda.show("Lambda Expression with input and return type"));
    }
}
