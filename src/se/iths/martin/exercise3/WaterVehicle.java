package se.iths.martin.exercise3;

import java.util.Random;

public class WaterVehicle extends Vehicle {
    private Position gpspos;

    public WaterVehicle(int weight, int price) {
        super(weight, price);
        gpspos = new Position();
    }

    public void go() {
        Random randomGenerator = new Random();
        gpspos.lat = randomGenerator.nextFloat();
        gpspos.lon = randomGenerator.nextFloat();
    }

    public Position getGpspos() {
        return gpspos;
    }
}



