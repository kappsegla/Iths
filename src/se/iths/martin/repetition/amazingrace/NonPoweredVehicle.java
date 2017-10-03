package se.iths.martin.repetition.amazingrace;

public abstract class NonPoweredVehicle implements Vehicle {
    protected int distance;

    @Override
    public int getDistance() {
        return distance;
    }
}
