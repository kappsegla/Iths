package se.iths.martin.repetition.amazingrace;

//Subklass till klassen Vehichle
public class Car extends PoweredVehicle {

    public Car(String name){
        super(name, 100, 0.9); //Call Constructor of PoweredVehicle
    }

    @Override
    public String makeSound() {
        return "Vrmmmm";
    }
}
