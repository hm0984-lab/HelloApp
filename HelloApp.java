/**
 * HelloApp.java
 * UC1: Display "Hello World"
 * UC2: Display "Hello" with user name using command-line argument
 */

public class HelloApp {

    public static void main(String[] args) {

        // Check if user provided a name
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default output if no argument given
            System.out.println("Hello, World!");
        }
    }
}