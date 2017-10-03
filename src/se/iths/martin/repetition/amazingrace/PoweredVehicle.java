package se.iths.martin.repetition.amazingrace;

public abstract class PoweredVehicle implements Vehicle {
    protected int distance;

    @Override
    public int getDistance() {
        return distance;
    }

    public abstract String makeSound();
}
