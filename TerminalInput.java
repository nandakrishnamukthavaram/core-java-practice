
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

@SuppressWarnings("unused")
public class TerminalInput {
    public static void main(String[] args) {
        /*
         * When you run the command "javac TerminalInput.java" and then
         * "java TerminalInput", It will compile and run the code.
         * But you can give input strings in the 2nd command like
         * "java TerminalInput Krishna"
         * String "Krishna" will be passed to main method and we can use it in the code
         * like mensioned below.
         */
        // System.out.println("Hello, " + args[0]);
        // Execute one method at a time.
        // --------------------------------------------------------------------------//
        // // Method 1:
        // try {
        // // This method takes a single character and returns its ASCII value.
        // System.out.println("Enter a char to know its ASCII value:");
        // int input = System.in.read();
        // System.out.println("ASCII value is: " + input);

        // // This method takes a string and returns an array of bytes of ASCII values.
        // System.out.println("Enter a series of chars and when done press ctrl+D:");
        // byte[] intputarr = System.in.readAllBytes();
        // System.out.println("Input chars are: ");
        // for (byte b : intputarr)
        // System.out.print((char) b);
        // System.out.println();
        // // Note: This method reads space, tab, newLine etc as a charachters.
        // // press ctrl+D to proceed the execution.
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // --------------------------------------------------------------------------//
        // // Method 2:
        // InputStreamReader is = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(is);
        // String s = "Empty";
        // try {
        // // This method takes input a single line of input and returns a string.
        // System.out.println("Enter a string:");
        // s = br.readLine();
        // // Note: Space and tab are considered as charachters.
        // // newLine i.e. return will proceed the execution.
        // } catch (Exception e) {
        // System.out.println(e);
        // } finally {
        // try {
        // br.close(); // Not a compulsion but it is a good practice
        // is.close(); // to close the resources.
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // }
        // System.out.println("You entered: " + s);
        // --------------------------------------------------------------------------//
        // // Try with resources:
        // // the above mess can be optimised using a try with resources.
        // try (BufferedReader br1 = new BufferedReader(new
        // InputStreamReader(System.in));) {
        // s = "Empty";
        // // This method takes input a single line of input and returns a string.
        // System.out.println("Enter a string:");
        // s = br1.readLine();
        // System.out.println("You entered : " + s);
        // // Note: Space and tab are considered as charachters.
        // // newLine i.e. return will proceed the execution.
        // } catch (Exception e) {
        // System.out.println(e);
        // } // this will close the mensioned resources at the end of try catch block.
        // --------------------------------------------------------------------------//
        // // Method 3:(Most commonly used)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter an integer: ");
        // int i = sc.nextInt();
        // System.out.println("You entered: " + i);
        // sc.close();

    }
}
