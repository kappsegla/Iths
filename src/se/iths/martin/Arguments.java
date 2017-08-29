package se.iths.martin;

import java.util.Scanner;

public class Arguments {

    public static void main(String[] args){

        int income = readANumber("Vad tjänar du?");
        double taxAmount = calculateTax(income);
        System.out.print("Då får du betala "+ taxAmount + " i skatt.");
    }

    public static int readANumber(String promptText){
        Scanner sc = new Scanner(System.in);
        System.out.println(promptText);
        return sc.nextInt();
    }

    public static double calculateTax(int grossIncome)
    {
        double tax;
        if( grossIncome > 100000)
            tax = grossIncome * 0.4;
        else
            tax = grossIncome * 0.3;

        return tax;
    }

}
