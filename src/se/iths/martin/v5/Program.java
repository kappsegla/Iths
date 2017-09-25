package se.iths.martin.v5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(-2);
        } catch (AgeNegativeException e) {
            System.out.println(e.getMessage());
        }


        readAge();

        int d = 0;
        try {

            d = sc.nextInt();

            int i = 3 / d;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("Ogiltig division!");
        } catch (InputMismatchException e) {
            System.out.println("Felaktig inmatning, inte en Integer!");
        } catch (Exception e) {
            System.out.println("Alla andra fel hamnar här.");
        } finally {
            System.out.println("Körs alltid.");
        }

        System.out.println("Gör något mer...." + d);
    }

    public static void readAge() {
        boolean valid = false;
        do {
            System.out.println("Enter your age:");
            try {
                int age = sc.nextInt();
                System.out.println("Age accepted: " + age);
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong, try again!");
                sc.next();
            }
        } while (!valid);
    }
}
