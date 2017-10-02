package se.iths.martin.repetition.amazingrace;

//Subklass till klassen Vehichle
public class Car extends Vehicle {

    @Override
    public void move(){
        //Ersätter koden från superklassen med den här
        //Rätt move metod väljs i Runtime baserat på verklig typ
        //Inte på referensens typ  == Override
        distance++;
    }

}
