import java.util.InputMismatchException;
import java.util.Scanner;

public class zad1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double temp = getValidDoubleInput(scanner, "Enter a temperature in Celsius to convert it to Fahrenheit: ");

    System.out.println("You entered: " + temp + "°C.");

    double temp_fahrenheit = celsiusToFahrenheit(temp);

    System.out.println("Temperature in Fahrenheit is: " + temp_fahrenheit + "°F.");

    scanner.close();
  }

  public static double getValidDoubleInput(Scanner scanner, String prompt) {
    double temp = Double.NEGATIVE_INFINITY;
    do {
      try {
        System.out.print(prompt);
        temp = scanner.nextDouble();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.nextLine(); // Clear the invalid input from the scanner buffer
      }
    } while (temp == Double.NEGATIVE_INFINITY); // Keep looping until temp is not infinity & is nuber.

    return temp;
  }
  public static double celsiusToFahrenheit(double celsius) {
    // Formula to convert Celsius to Fahrenheit: (celsius * 9/5) + 32
    double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
    // Use Math.round to round to nearest integer, then cast to double and divide by 100 for two decimals
    return Math.round(fahrenheit * 100.0) / 100.0;
  }
}
