package se.iths.martin.exercise3;

public class AirVehicle extends Vehicle {

    private int height;

    public AirVehicle(int weight, int price) {
        super(weight, price);
    }

    public int getHeight() {
        return height;
    }

    public void fly(boolean fly) {
        if (fly) {
            height++;
        } else {
            height = 0;
        }
    }
}




