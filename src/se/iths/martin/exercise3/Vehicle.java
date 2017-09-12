package se.iths.martin.exercise3;

public class Vehicle {
    private int weight;
    private int price;
    private Person owner;

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

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
