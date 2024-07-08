// Types of inheritances                                   Parent->Child
// 1. Single Inheritance                                        A->B
// 2. Multilevel Inheritance                                    A->B->C
// 3. Hierarchical Inheritance                                  A->B,A->C
// 4. Multiple Inheritance (Achieved through interface in java) B->A,C->A
// 5. Hybrid Inheritance (Achieved through interface in java)   Mixture

class CalcV1 {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class CalcV2 extends CalcV1 {
    public int div(int a, int b) {
        if (b == 0)
            return -1;
        return a / b;
    }

    public int square(int a) {
        return a * a;
    }

    public int cube(int a) {
        return a * a * a;
    }
}

class CalcV21 extends CalcV1 {
    public int sqrt(int a) {
        return (int) Math.sqrt(a);
    }
}

class CalcV3 extends CalcV2 {
    public int mod(int a, int b) {
        return a % b;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        CalcV1 calculate = new CalcV1();
        System.out.println(calculate.sum(12, 23));

        CalcV2 advCalculate = new CalcV2();
        System.out.println(advCalculate.sum(12, 23));
        System.out.println(advCalculate.div(1223, 23));
        System.out.println(advCalculate.cube(5));

        CalcV3 veryAdvCalculate = new CalcV3();
        System.out.println(veryAdvCalculate.sum(12, 23));
        System.out.println(veryAdvCalculate.div(1223, 23));
        System.out.println(veryAdvCalculate.cube(5));
        System.out.println(veryAdvCalculate.mod(1223, 23));

    }
}
