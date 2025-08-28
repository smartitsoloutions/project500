import java.util.Scanner;

public class GreetingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner objects

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();          // Read user input

        greetUser(name);                           // Call the method with user input and output

        scanner.close();                           // Close the scanner
    }

    // Method to greet the user
    public static void greetUser(String userName) {
        System.out.println("Hello, " + userName + "! Welcome to Java.");
    }
}

def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y == 0:
        return "Error: Cannot divide by zero."
    return x / y

def main():
    print("Simple Calculator")
    print("Operations: +, -, *, /")

    try:
        num1 = float(input("Enter first number: "))
        op = input("Enter operation (+, -, *, /): ")
        num2 = float(input("Enter second number: "))

        if op == '+':
            result = add(num1, num2)
def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y == 0:
        return "Error: Cannot divide by zero."
    return x / y

def main():
    print("Simple Calculator")
    print("Operations: +, -, *, /")

    try:
        num1 = float(input("Enter first number: "))
        op = input("Enter operation (+, -, *, /): ")
        num2 = float(input("Enter second number: "))

        if op == '+':
            result = add(num1, num2)

    



