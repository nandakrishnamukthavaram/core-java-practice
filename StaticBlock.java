class IRanOutOfExamples {
    IRanOutOfExamples() {
        System.out.println("Obj of IRanOutOfExamples is instansiated");
    }

    static {
        System.out.println("Static block example is invoked");
    }
}

class IRanOutOfExamplesAgain {
    IRanOutOfExamplesAgain() {
        System.out.println("Obj of IRanOutOfExamplesAgain is instansiated");
    }

    static {
        System.out.println("Static block again example is invoked");
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        IRanOutOfExamples example11 = new IRanOutOfExamples();
        IRanOutOfExamples example12 = new IRanOutOfExamples();
        IRanOutOfExamples example13 = new IRanOutOfExamples();

        Class.forName("IRanOutOfExamplesAgain"); // loads the class into the class loader
        IRanOutOfExamplesAgain example21 = new IRanOutOfExamplesAgain();
        IRanOutOfExamplesAgain example22 = new IRanOutOfExamplesAgain();
        IRanOutOfExamplesAgain example23 = new IRanOutOfExamplesAgain();
    }
}