package se.iths.martin.v2;

public class Adress {
    public String road;
    public int houseNumber;
    public int zipCode;
    public String city;

    public Adress(){

    }

    public Adress(Adress adress) {
        this.road = adress.road;
        this.houseNumber = adress.houseNumber;
        this.zipCode = adress.zipCode;
        this.city = adress.city;
    }
}
