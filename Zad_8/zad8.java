package Zad_8;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pierwsza liczba calkowicat:");
        int number_start = input.nextInt();
        System.out.println("Druga liczba calkowita:");
        int number_stop = input.nextInt();
        input.close();

        int result = 0;

        for (int i = number_start; i <= number_stop; i ++){
            result += i;
        }
        System.out.println("Suma ciagu:");
        System.out.println(result);
        
    }
}
