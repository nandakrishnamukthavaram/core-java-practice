public class StringAndStringBuffer {
    public static void main(String[] args) {
        // String

        String name = "Krishna";
        name = "Nanda" + name;
        int favNum = 7;
        /*
         * Strings in java are immutable .
         * But you wonder why you can't see any error in the code.
         * It happens so because..,
         * In the backend every time you chande or update the value of a string in java,
         * You are dedicating another part of memory from the jvm memory heap
         * and storing the updated value in the new memory
         */
        System.out.println(name + favNum);

        // String Functions
        // Format
        String message = String.format("My name is %s and My favourite number is %d", name, 7);
        System.out.println(message);
        // Hashcode
        System.out.println(message.hashCode());
        /*
         * This method can be used to store passwords.
         * We can compare hashcodes of two strings but never can dehash a hashcode to
         * get the string.
         * These may not be unique because of loss of data
         * for example Siblings and Teheran would have the same hashcodes.
         * But there is one in a billion chance for the hash collision to occur.
         */

        // equals returns a boolean
        System.out.println(name.equals(name));

        // split returns an array of strings
        System.out.println(name.split("a")); // prints the location of String module and id of the String array
        // There are a ton of methods to experiment

        // StringBuffer (mutable)
        StringBuffer nameBuffer = new StringBuffer("Nanda");// Gives additional space for 16 chars which can be altered
                                                            // using the ensureCapacity() function
        System.out.println(nameBuffer.capacity());
        nameBuffer.append("krishna"); // changes are made to the same memory location.
        System.out.println(nameBuffer);
        System.out.println(nameBuffer.capacity());

    }
}
