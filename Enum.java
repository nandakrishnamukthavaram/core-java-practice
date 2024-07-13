enum Subject {
    Science, Mathematics, English, Computers, Mechanics
}

enum CGPA {
    ContinuousAssignments(25), MitTerm(30), Attendance(5), EndTerm(50);

    private int weightage;

    public int getWeightage() {
        return weightage;
    }

    private CGPA(int weightage) {
        this.weightage = weightage;
    }
}

enum ABC {
    A(12), B('a'), C("str");

    private int i;
    private char c;
    private String s;

    private ABC(int i) {
        this.i = i;
        System.out.println(this.i);
    }

    private ABC(char c) {
        this.c = c;
        System.out.println(this.c);
    }

    private ABC(String s) {
        this.s = s;
        System.out.println(this.s);
    }

}

public class Enum {
    public static void main(String[] args) {
        // Subject
        Subject l = Subject.Science;
        System.out.println(l);
        // Science

        System.out.println(l.ordinal());
        // 0

        System.out.println(l.name());
        // Science

        System.out.println(l.compareTo(Subject.Mathematics));
        // -1

        System.out.println(l.equals(Subject.Science));
        // true

        System.out.println(l == Subject.Science);
        // true

        System.out.println(l.getDeclaringClass());
        // class Subject

        System.out.println(l.hashCode());
        // 1933863327

        System.out.println(l.toString());
        // Science (in a string format)

        System.out.println(Subject.valueOf("Science"));
        // Science

        for (Subject var : Subject.values()) {
            System.out.print(var + " ");
        }
        // Science Mathematics English Computers Mechanics

        // CGPA
        CGPA c = CGPA.MitTerm;
        System.out.println(c);
        // MitTerm
        System.out.println(c.ordinal());
        // 1
        System.out.println(c.getWeightage());
        // 30
        System.out.println(c.name());
        // MitTerm
        System.out.println(c.compareTo(CGPA.Attendance));
        // 2
        System.out.println(c.equals(CGPA.MitTerm));
        // true
        System.out.println(c == CGPA.MitTerm);
        // true
        System.out.println(c.getDeclaringClass());
        // class CGPA
        System.out.println(c.hashCode());
        // 1794106052
        System.out.println(c.toString());
        // MitTerm (in a string format)
        System.out.println(CGPA.valueOf("MitTerm"));
        // MitTerm
        System.out.println(CGPA.valueOf("MitTerm").getWeightage());
        // 30
        for (CGPA var : CGPA.values()) {
            System.out.print(var + " ");
            System.out.println();
        }
        // ContinuousAssignments MitTerm Attendance EndTerm
        ABC asdf = ABC.values()[1]; // I\nC\nS
        System.out.println(asdf);
    }
}
