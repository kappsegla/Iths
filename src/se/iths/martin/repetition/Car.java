package se.iths.martin.repetition;

public class Car extends Vehicle {
    public Car(){
        System.out.println("Car created. 100 miles to go!");
    }

    @Override
    public void drive() {
        if( getDriver() == null )
            System.out.println("Car didn’t drive - there’s no driver");

    }
}
