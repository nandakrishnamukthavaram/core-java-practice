import java.util.*;

public class StreamApi {
    public static void main(String[] args) {
        var rdm = new Random();
        var arrList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrList.add(rdm.nextInt(10));
        }
        System.out.println("Array List: \n" + arrList);
        // // If I wanted to double all the odd numbers to make all numbers even.
        // for (int i = 0; i < arrList.size(); i++) {
        // if ((int) arrList.get(i) % 2 != 0) {
        // arrList.set(i, (int) arrList.get(i) * 2);
        // }
        // }
        // System.out.println("Array List after doubling odd numbers in conventional
        // way: \n" + arrList);
        // This was implemented using stream below
        arrList.stream().filter(i -> (int) i % 2 != 0).forEach(i -> arrList.set(arrList.indexOf(i), (int) i * 2));
        System.out.println("Array List after doubling odd numbers using stream: \n" + arrList);
    }
}
