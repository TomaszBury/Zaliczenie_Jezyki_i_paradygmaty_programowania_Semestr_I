import java.util.InputMismatchException;
import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        int number = getUserInput();
        String resulString = "";

        for (int i = 1; i <= number; i += 2){
            resulString += String.valueOf(i) + " ";
        }

        System.out.println(resulString);
        
    }
    public static int getUserInput() {
        Scanner input = new Scanner(System.in);
        int number = 0;
        while (true) {
            try {
                System.out.print("Enter a positive integer: ");
                number = input.nextInt();

                if (number > 0) {
                    break; // Exit the loop if a positive integer is entered
                } else {
                    System.out.println("Negative values are not allowed.");
                }
            } catch (InputMismatchException e) {
                // Clear the input buffer to avoid an infinite loop
                input.nextLine();
                System.out.println("Invalid input. Please enter a positive integer.");

                input.close();
                return -1;
            }
        }
        input.close();
        return number;
    }
}
