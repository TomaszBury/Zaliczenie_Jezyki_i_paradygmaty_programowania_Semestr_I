package Zad_5;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much you want to borrow? Min:100 Max:$10.000,00.");
        BigDecimal principal = getValidBigDecimalInput(input, "principal");

        System.out.println("For how long? Min:6 m Max:48 months.");
        BigDecimal numberPeriods = getValidBigDecimalInput(input, "installmentPlan");

        BigDecimal rate = rate(numberPeriods);

        System.out.println("Principal: " + principal + " number of periods " + numberPeriods);



        // Create a NumberFormat instance for the desired locale (e.g., US)
        NumberFormat nf = NumberFormat.getInstance(Locale.US);

        // Set the formatting options
        nf.setGroupingUsed(true); // Enable thousands separators
        nf.setMinimumFractionDigits(2); // Set the minimum number of decimal places
        nf.setMaximumFractionDigits(2); // Set the maximum number of decimal places
            

        MathContext mc = new MathContext(2);
        BigDecimal instalment = principal.divide(numberPeriods, mc);
        BigDecimal amount =  BigDecimal.ZERO;
        BigDecimal intrestToPayThisMonth = BigDecimal.ZERO;
        String formattedAmount = "";

        BigDecimal looserFactor = BigDecimal.ZERO;

        for (int i = 0; numberPeriods.compareTo(BigDecimal.valueOf(i)) > 0 ; i++){
            
            intrestToPayThisMonth = principal.multiply(rate, mc);

            principal = principal.subtract(instalment);
            
            amount =  instalment.add(intrestToPayThisMonth);

            // Format the BigDecimal
            formattedAmount = nf.format(amount);

            System.out.println("Pay me: " + formattedAmount);

            looserFactor = looserFactor.add(amount);
        }
        
        // Format the BigDecimal
        formattedAmount = nf.format(looserFactor);
        System.out.println("It cost you: " + formattedAmount);
        
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
        if (typeInput == "principal"){
            if (input.compareTo(BigDecimal.valueOf(100)) >= 0 && input.compareTo(BigDecimal.valueOf(10000)) <= 0){
                return true;
            } else {
                System.out.println("Min:100 Max:10.000,00");
            }
        } else if (typeInput == "installmentPlan"){
            if (input.compareTo(BigDecimal.valueOf(6)) >= 0 && input.compareTo(BigDecimal.valueOf(48)) <= 0){
                return true;
            } else {
                System.out.println("Min:6 Max:48.");
            }
        }
        return false;
    }
    public static BigDecimal rate(BigDecimal numberPeriods){
        BigDecimal firstBucket = BigDecimal.valueOf(12);
        BigDecimal secondBucket = BigDecimal.valueOf(24);

        if (numberPeriods.compareTo(firstBucket) <= 0){
            return BigDecimal.valueOf(.025);
        } else if (numberPeriods.compareTo(secondBucket) <= 0){
            return BigDecimal.valueOf(.05);
        } 
        return BigDecimal.valueOf(.1);
    }
}
