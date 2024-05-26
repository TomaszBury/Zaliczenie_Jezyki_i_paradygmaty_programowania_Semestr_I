package Zad_5;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        System.out.println("Stuff for sale:");
        
    }

    public static BigDecimal getValidBigDecimalInput(Scanner scanner, String prompt) {
        BigDecimal number;
        do {
          try {
            // System.out.print(prompt);
            number = scanner.nextBigDecimal();
            if (validatedInput(number, prompt)){
                return number; // Exit the loop if input is valid
            }
          } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter correct one.");
            scanner.nextLine(); // Clear the invalid input from the scanner buffer
          }
        } while (true); // Loop indefinitely until a valid prompt is entered.
    }
    public static boolean validatedInput(BigDecimal input, String typeInput){
        if (typeInput == "stuff"){
            if (input.compareTo(BigDecimal.valueOf(100)) == -1 && input.compareTo(BigDecimal.valueOf(10000)) == 1){
                return true;
            }
        } else if (typeInput == "installmentPlan"){
            if (input.compareTo(BigDecimal.valueOf(6)) == 1 && input.compareTo(BigDecimal.valueOf(48)) == -1){
                return true;
            }
        }
        return false;
    }
    
}
