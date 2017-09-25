package se.iths.martin.v5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int d = 0;
            d = sc.nextInt();

            int i = 3 / d;
            System.out.println(i);
        }
        catch (ArithmeticException e) {
            System.out.println("Ogiltig division!");
        }
        catch (InputMismatchException e){
            System.out.println("Felaktig inmatning, inte en Integer!");
        }
        catch (Exception e) {
            System.out.println("Alla andra fel hamnar här.");
        }



        System.out.println("Gör något mer....");



    }
}
