import java.util.*;

class Student implements Comparable<Student> {
    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public String toString() {
        return "Marks: " + marks + " Name: " + name + "\n";
    }

    @Override
    public int compareTo(Student o) {
        return this.marks > o.marks ? -1 : 1; // ascending order
    }
}

public class ComparatorNdComparable {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        var rd = new Random();
        for (int i = 0; i < 7; i++) {
            nums.add(rd.nextInt(100));
        }
        System.out.println("Before sorting:\n" + nums);
        Collections.sort(nums); // TimSort
        System.out.println("After sorting:\n" + nums);
        /*
         * If you want to define a new logic.
         * Like if you want to sort based on index value.
         */
        Collections.sort(nums, (a, b) -> a % 10 > b % 10 ? 1 : -1);
        System.out.println("Sorted based on index values:\n" + nums);
        var std1 = new Student(90, "Krishna");
        var std2 = new Student(80, "Rama");
        var std3 = new Student(70, "Sita");
        var std4 = new Student(60, "Lakshman");
        List<Student> students = new ArrayList<>() {
            public String toString() {
                String res = "";
                for (var std : this) {
                    res += std;
                }
                return res;
            }
        };
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
        System.out.println("Before sorting:\n" + students);
        Collections.sort(students);
        System.out.println("After sorting:\n" + students);
        /*
         * If you want to sort based on name in alphabetical order.
         */
        Collections.sort(students, (a, b) -> a.name.compareTo(b.name));
        System.out.println("Sorted based on name:\n" + students);
        /*
         * If you want to sort based on name length.
         */
        Collections.sort(students, (a, b) -> a.name.length() > b.name.length() ? 1 : -1);
        System.out.println("Sorted based on length of name:\n" + students);
    }
}
