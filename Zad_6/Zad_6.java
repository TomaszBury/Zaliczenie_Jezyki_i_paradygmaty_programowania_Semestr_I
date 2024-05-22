package Zad_6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad_6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
    
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // Extract the first character
    
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        double result = Double.NaN;

        try{
            result = calculate(firstNumber, secondNumber, operator);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());  // Print error to standard error stream
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());  // Print error to standard error stream
        }

        System.out.println("The result of " + firstNumber + " " + operator + " " + secondNumber + " is: " + result);
        
        scanner.nextLine();
        scanner.nextLine();
        
        scanner.close();
    }


  public static double calculate(double num1, double num2, char operator) {
    switch (operator) {
      case '+':
        return num1 + num2;
      case '-':
        return num1 - num2;
      case '*':
        return num1 * num2;
      case '/':
        // Handle division by zero
        if (num2 == 0) {
          throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
      default:
        throw new IllegalArgumentException("Invalid operator. Please use +, -, *, or /.");
    }
  }
  public static double getUserInput() {
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine(); // Clear the input buffer (optional)

    System.out.print("Enter the second number: ");
    double number;
    try {
        number = scanner.nextDouble();
    } catch (InputMismatchException e) {
        System.out.println("Error: Please enter a valid number.");
        scanner.nextLine(); // Clear the input buffer (optional)
        scanner.close();
        return Double.NaN; // Indicate an error (Not a Number)
    }

    scanner.close();
    return number;
    }
}
