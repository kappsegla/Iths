package se.iths.martin.repetition.amazingrace;

import java.util.ArrayList;
import java.util.Scanner;

public class Race {
    public static void main(String[] args) {
        Race r = new Race();
        r.game();
    }

    private void game() {
        ArrayList<Vehicle> veichles = new ArrayList<>();
        veichles.add(new Car("Volvo"));  //Tack vare polymorfism kan vi lagra Car som en Vehicle
        veichles.add(new Bicycle());
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Time to move your ass. Press enter key.");
            sc.nextLine();

            for (Vehicle v : veichles) {
                v.move();
                System.out.println("Vehicle " + v + " moved to a new record distance of " +
                        v.getDistance() + " km.");
            }
        }
    }
}
