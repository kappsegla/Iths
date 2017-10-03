package se.iths.martin.repetition.amazingrace;

import java.util.ArrayList;

public class Race {
    public static void main(String[] args) {
        Race r = new Race();
        r.game();
    }

    private void game() {
        ArrayList<Vehicle> veichles = new ArrayList<>();
        veichles.add(new Car());  //Tack vare polymorfism kan vi lagra Car som en Vehicle
        veichles.add(new Bicycle());

        for (Vehicle v : veichles ) {
            v.move();
            System.out.println("Vehicle " + v + " moved to a new record distance of " +
                    v.getDistance() + " km.");
        }
    }
}
