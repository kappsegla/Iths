package se.iths.martin.exercise3;

public class Start {
    public static void main(String[] args) {
        Buyer b1 = new Buyer("Martin", "Teacher", 40, 700000);
        Buyer b2 = new Buyer("Pelle", "Police", 32, 100000);
        Buyer b3 = new Buyer("Stina", "Firefighter", 40, 300000);

        Seller s1 = new Seller("Amida", "Retired", 68, 100000);
        Seller s2 = new Seller("Kent", "Carpenter", 27, 200000);

        VehicleDealer hedin = new VehicleDealer("Lars", "Vehicledealer", 52, 1000000);

        Car volvo = new Car(2000, 100000);
        volvo.setOwner(s2);
        Plane sevene8seven = new Plane(150000, 200000);
        sevene8seven.setOwner(s1);
        Chopper littleGoRound = new Chopper(8000, 400000);
        littleGoRound.setOwner(s1);


        //Move the following prints into metod for reuse.
        System.out.println("Helikoptern ägs av " + littleGoRound.getOwner().getName());
        System.out.println("Säljaren har " + s1.getSavings() + " kr på banken.");
        System.out.println("Köparen " + b1.getName()+ " har " + b1.getSavings() + " kr på banken.");

        hedin.vehicleTransaction(b1, littleGoRound);

        System.out.println("Helikoptern ägs av " + littleGoRound.getOwner().getName());
        System.out.println("Säljaren har " + s1.getSavings() + " kr på banken.");
        System.out.println("Köparen " + b1.getName()+ " har " + b1.getSavings() + " kr på banken.");


    }
}
