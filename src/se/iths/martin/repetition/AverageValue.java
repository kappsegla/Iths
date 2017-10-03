package se.iths.martin.repetition;

import java.util.Scanner;

public class AverageValue {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hur många personer");
        int numberOfPersons = sc.nextInt();

        int[] ages = new int[numberOfPersons];
        double total = 0;

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Ålder:");
            ages[i] = sc.nextInt();
        }
        System.out.println("Alla åldrar");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(ages[i]);
            total += ages[i];
        }
        System.out.println("Genomsnitt: " + total / numberOfPersons);





    }




}
