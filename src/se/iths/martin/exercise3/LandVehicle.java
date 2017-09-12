package se.iths.martin.exercise3;

public class LandVehicle extends Vehicle{

    private int km;

    public LandVehicle(int weight, int price) {
        super(weight, price);
    }

    public int getKm() {
        return km;
    }

    public void drive(int kms){
        km += kms;
    }
}
