package se.iths.martin.exercise3;

public class Vehicle {
    private int weight;
    private int price;

    public Vehicle(int weight, int price){
        this.weight = weight;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
