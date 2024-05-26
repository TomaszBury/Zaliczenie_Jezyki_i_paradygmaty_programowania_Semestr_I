package Zad_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = getValidFloatInput(scanner, "Your weight in kg:");
        double height = getValidFloatInput(scanner, "Your height in meters:");

        double BMI = calculateBMI(weight, height);
        BMI = roundMeSomeNumbers(BMI, 2);

        System.out.println("You are: " + categoriesBMI(BMI));
        
    }
    public static double getValidFloatInput(Scanner scanner, String prompt) {
        double number;
        do {
          try {
            System.out.print(prompt);
            number = scanner.nextDouble();
            return number; // Exit the loop if input is valid
          } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter ." + prompt);
            scanner.nextLine(); // Clear the invalid input from the scanner buffer
          }
        } while (true); // Loop indefinitely until a valid prompt is entered.
    }
    public static double roundMeSomeNumbers(double value, int scale) {
        return Math.round(value * Math.pow(10, scale)) / Math.pow(10, scale);
    }
    public static double calculateBMI(double weight, double height){
        return weight / (height * height);
    }
    public static String categoriesBMI(double BMI){
        if (BMI < 18.5){
            return "Underweight";
        }else if (BMI >= 18.5 && BMI < 24.9) {
            return "Normal";
        }else if (BMI >= 25 && BMI < 29.9){
            return "Overweight";
        }else{
            return "Obesity";
        }
    }
}
