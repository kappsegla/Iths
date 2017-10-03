package se.iths.martin.repetition.amazingrace;

//Subklass till klassen Vehichle
public class Car extends PoweredVehicle {

    @Override
    public void move(){
        //Ersätter koden från superklassen med den här
        //Rätt move metod väljs i Runtime baserat på verklig typ
        //Inte på referensens typ  == Override
        distance+=10;
    }

    @Override
    public String toString() {
        return "Car";
    }

    @Override
    public String makeSound() {
        return "Vrmmmm";
    }
}
