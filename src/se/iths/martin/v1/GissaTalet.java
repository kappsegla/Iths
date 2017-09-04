package se.iths.martin.v1;

import java.util.Scanner;

public class GissaTalet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = (int) (Math.random() * 50) + 1;
        int yourGuess = 0;

        int numberOfGuesses = 0;

        while (true) {
            System.out.println("Välj ett tal mellan 1-50");
            yourGuess = sc.nextInt();

            //Tre olika sätt att räkna upp variabeln numberOfGuesses ett steg.
            //numberOfGuesses = numberOfGuesses + 1;
            //numberOfGuesses += 1;
            numberOfGuesses++;

            if (yourGuess == secretNumber) {
                System.out.println("Grattis, du gissade rätt på " + numberOfGuesses + " försök!");
                break;
            } else if (yourGuess > secretNumber)
                System.out.println("För stort");
            else
                System.out.println("För litet");
        }
    }
}
