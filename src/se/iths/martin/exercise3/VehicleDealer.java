package se.iths.martin.exercise3;

public class VehicleDealer extends Person {
    public VehicleDealer(String name, String occupation, int age, int savings) {
        super(name, occupation, age, savings);
    }

    public void vehicleTransaction(Buyer vehicleBuyer, Vehicle theVehicle){
        Person vehicleSeller = theVehicle.getOwner();

        //Collect money from buyer
        int price = theVehicle.getPrice();
        vehicleBuyer.setSavings( vehicleBuyer.getSavings() - price);

        //Take our cut, 10%
        int provision = (int)(price * 0.1);
        setSavings( getSavings() + provision );

        //Send money to seller
        vehicleSeller.setSavings( vehicleSeller.getSavings() + price - provision );

        //Change owner of car
        theVehicle.setOwner(vehicleBuyer);


    }
}
