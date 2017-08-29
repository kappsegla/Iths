package se.iths.martin;

import java.util.Scanner;

public class Arguments {

    public static void main(String[] args){

        int income = readANumber("Vad tjänar du?");
        double taxAmount = calculateTax(income);
        System.out.print("Då får du betala ");
        System.out.print(taxAmount);
        System.out.print(" i skatt.");
    }

    public static int readANumber(String promptText){
        Scanner sc = new Scanner(System.in);
        System.out.println(promptText);

        return sc.nextInt();
    }

    public static double calculateTax(int grossIncome)
    {
        if( grossIncome > 100000)
            return grossIncome * 0.4;
        else
            return grossIncome * 0.3;
    }

}
