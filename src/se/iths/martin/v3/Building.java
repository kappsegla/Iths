package se.iths.martin.v3;

public class Building {
    private int year;
    private int value;

    public Building(int year, int value){
        this.year = year;
        this.value = value;
    }

    public int getYear() {
        return year;
    }

    /* public void setYear(int year) {
        this.year = year;
    }*/

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
