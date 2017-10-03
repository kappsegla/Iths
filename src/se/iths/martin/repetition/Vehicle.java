package se.iths.martin.repetition;

public abstract class Vehicle {
    private Driver driver;
    public abstract void drive();
    public void setDriver(Driver d){
        driver = d;
    }

    public Driver getDriver() {
        return driver;
    }
}
