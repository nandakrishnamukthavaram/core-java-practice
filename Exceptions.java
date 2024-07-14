class IndeterminateException extends Exception {
    public IndeterminateException() {
        super("Indeterminate value");
    }
}

public class Exceptions {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[] arr = new int[5];
        String str = null;
        try {
            if (i == 0 && j == 0) {
                throw new IndeterminateException();
            }
            j = i / j;
            System.out.println(j);
        } catch (IndeterminateException e) {
            System.out.println("IndeterminateException");
        } catch (Exception e) {
            System.out.println("Something Went Wrong " + e);
        }
        try {
            j = 8 / i;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Something Went Wrong " + e);
        }

        try {
            arr[10] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Something Went Wrong " + e);
        }

        try {
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (Exception e) {
            System.out.println("Something Went Wrong " + e);
        }

        try {
            int a = Integer.parseInt("abc");
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (Exception e) {
            System.out.println("Something Went Wrong " + e);
        }
        System.out.println(j);
        System.out.println("END");
    }
}
