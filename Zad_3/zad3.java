package Zad_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight = getValidIntegerInput(scanner, "Your weight in kg:");
        float height = getValidIntegerInput(scanner, "Your height in meters:");

        double BMI = weight / (height * height);
        BMI = roundMeSomeNumbers(BMI, 2);

        if (BMI <= 18.4){
            System.out.println("Underweight " + String.valueOf(BMI));
        }else if (BMI > 18.4 && BMI < 24.9) {
            System.out.println("You are Normal. " + String.valueOf(BMI));
        }else if (BMI >= 24.9 && BMI < 39.9){
            System.out.println("You are Overweight. " + String.valueOf(BMI));
        }else{
            System.out.println("Obese " + String.valueOf(BMI));
        }
        
    }
    public static float getValidIntegerInput(Scanner scanner, String prompt) {
        float number;
        do {
          try {
            System.out.print(prompt);
            number = scanner.nextFloat();
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
}
