package Zad_4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal income = getValidBigDecimalInput(scanner, "Employment income: ");

        BigDecimal tax = taxCalculation(income);

        comunicateTaxBurden(tax);

        scanner.close();
        
    }
    public static void comunicateTaxBurden(BigDecimal tax){
        if (tax.compareTo(BigDecimal.valueOf(0)) == 1){
            System.out.println("You are $" + roundMeSomeNumbers(tax, 0) + " poorer." );
        }else{
            System.out.println("You refund is :$" + roundMeSomeNumbers(tax, 0).abs());
        }
    }
    public static BigDecimal taxCalculation(BigDecimal income){
        BigDecimal firstBracked = BigDecimal.valueOf(3089);
        BigDecimal secondBracket = BigDecimal.valueOf(85528);
        BigDecimal taxToBePaid = BigDecimal.valueOf(0);
        BigDecimal taxBase = BigDecimal.valueOf(0);

        if (income.compareTo(firstBracked) == -1){
            System.out.println("fsdfdsfsfds");
            income = income.subtract(firstBracked);
        } else if (income.compareTo(secondBracket) == -1){
            income = income.subtract(firstBracked);
            taxToBePaid = taxToBePaid.add(income.multiply(BigDecimal.valueOf(0.18)));
        } else {
            taxToBePaid = taxToBePaid.add(BigDecimal.valueOf(14839.02));
            taxBase = income.subtract(secondBracket);
            taxToBePaid = taxToBePaid.add(taxBase.multiply(BigDecimal.valueOf(.32)));
        }

        return taxToBePaid;
    }
    public static BigDecimal getValidBigDecimalInput(Scanner scanner, String prompt) {
        BigDecimal number;
        do {
          try {
            System.out.print(prompt);
            number = scanner.nextBigDecimal();
            return number; // Exit the loop if input is valid
          } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter ." + prompt);
            scanner.nextLine(); // Clear the invalid input from the scanner buffer
          }
        } while (true); // Loop indefinitely until a valid prompt is entered.
    }
    public static BigDecimal roundMeSomeNumbers(BigDecimal value, int scale) {
        return value.setScale(scale, RoundingMode.HALF_UP);
    }
}
