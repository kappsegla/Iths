package se.iths.martin.repetition.amazingrace;

public class Bicycle extends NonPoweredVehicle {
    @Override
    public void move() {
        distance += 2;
    }

    @Override
    public String toString() {
        return "Mountainbike";
    }
}
