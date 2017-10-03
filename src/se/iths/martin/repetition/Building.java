package se.iths.martin.repetition;

public class Building {

    private String street;
    private int houseNumber;
    private int floors;
    private float squareMeters;
    private boolean shimney;
    private boolean elevator;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setFloors(int floors) {
        if(floors < 1 )
            this.floors = 1;
        else
            this.floors = floors;
    }

    public void setSquareMeters(float squareMeters) {
        this.squareMeters = squareMeters;
        if( this.squareMeters < floors * 100)
            this.squareMeters = floors * 100;
    }

    public void setShimney(boolean shimney) {
        this.shimney = shimney;
    }

    public void setElevator(boolean elevator) {
        this.elevator = elevator;
        if( floors > 3)
            this.elevator = true;
    }

    public Building(String street, int houseNumber, int floors, float squareMeters, boolean shimney, boolean elevator) {
        setStreet(street);
        setHouseNumber(houseNumber);
        setFloors(floors);
        setSquareMeters(squareMeters);
        setShimney(shimney);
        setElevator(elevator);
    }






}
