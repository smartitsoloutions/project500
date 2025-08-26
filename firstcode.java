import java.util.Scanner;

public class GreetingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();          // Read user input

        greetUser(name);                           // Call the method with user input

        scanner.close();                           // Close the scanner
    }

    // Method to greet the user
    public static void greetUser(String userName) {
        System.out.println("Hello, " + userName + "! Welcome to Java.");
    }
}


