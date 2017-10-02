package se.iths.martin.repetition.amazingrace;

//Superklass som är abstract, går inte skapa instancer av klassen
public abstract class Vehicle {
    protected int distance;

    public void move(){}

    public int getDistance(){
        return distance;
    }
}
