package Zad_9;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Licczba calkowita dodatnia:");
        double number_start = input.nextDouble();
        input.close();

        double returnNuber = 2;
        double powNum = 0;
        int i = 1;

        // for (int i = 1; powNum <= number_start ; i ++){
        //     powNum = Math.pow(returnNuber, i);
        //     System.out.println(powNum);
        // }

        do  {
            powNum = Math.pow(returnNuber, i);
            System.out.println(powNum);
            i++;
            
        }while (powNum <= number_start);
    }
}
