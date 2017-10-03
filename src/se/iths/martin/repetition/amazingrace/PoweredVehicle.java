package se.iths.martin.repetition.amazingrace;

public abstract class PoweredVehicle implements Vehicle {
    protected int distance;
    private String name;
    private int speed;
    private double probability;

    public PoweredVehicle(String name, int speed, double probability){
        this.name = name;
        this.speed = speed;
        this.probability = probability;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public void move() {
        if( Math.random() < probability)
            distance += speed;
    }

    @Override
    public int getDistance() {
        return distance;
    }

    public abstract String makeSound();
}
