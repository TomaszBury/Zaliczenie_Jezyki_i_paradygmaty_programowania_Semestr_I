package Zad_2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zad_2 {
    public static int findBiggest(int num1, int num2, int num3) {
    // Use Math.max to find the largest of the three numbers
    return Math.max(Math.max(num1, num2), num3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String prompt = "Enter first integer: ";
        int num1 = getValidIntegerInput(scanner, prompt);

        prompt = "Enter second integer: ";
        int num2 = getValidIntegerInput(scanner, prompt);

        prompt = "Enter third integer: ";
        int num3 = getValidIntegerInput(scanner, prompt);

        int biggest = findBiggest(num1, num2, num3);
        System.out.println("The biggest number is: " + biggest);
        
        scanner.close();
    }

    public static int getValidIntegerInput(Scanner scanner, String prompt) {
        int number;
        do {
          try {
            System.out.print(prompt);
            number = scanner.nextInt();
            return number; // Exit the loop if input is valid
          } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.nextLine(); // Clear the invalid input from the scanner buffer
          }
        } while (true); // Loop indefinitely until a valid integer is entered
    }
    public static int findBiggestLame(int num1, int num2, int num3) {
        int biggest = num1; // Initialize biggest with the first number
      
        if (num2 > biggest) {
          biggest = num2;
        }
      
        if (num3 > biggest) {
          biggest = num3;
        }
      
        return biggest;
      }
}
