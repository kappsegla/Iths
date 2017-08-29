package se.iths.martin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exempel1 {
    public static void main(String[] args) {
        // write your code here
        /*
            Flera rader med kommentarer
            fungerar fint.
         */
        Scanner sc = new Scanner(System.in);

        String text = "Hej!";

        //String dynamicText = sc.nextLine();

        int antal;
        try {
            antal = sc.nextInt();
        }
        catch(InputMismatchException e){
            //Hantera felet här.
            antal = 0;
        }
//        long stortTal = 0b0101010101010111;
//        long hexTal = 0x5557;
//        long decimalTal = 21847;
        double pris = 10.0;
//        float vikt = 12.3f;
//
//        int a = 10 % 3; // a == 1
//
//        int b = 10 % 2; // b == 0  //Avgöra om talet är udda eller jämnt
//
//        int c = 124 % 10;  // c == 4  //Separera siffrorna i talet
//
//        //((124 - c) % 100)/10;
//        int d = 124 / 10 % 10;  // d == 2

        if (antal > 0 && antal < 100) {

                System.out.println(antal);
                System.out.println(pris);
                System.out.println(antal * pris);
        }
        else if(antal == 0)
        {

            System.out.println("");
        }
        else
        {
            System.out.println("Negativa antal kan inte vara möjligt.");
        }
    }
}

