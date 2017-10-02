package se.iths.martin.repetition;

import java.util.Random;

public class Die {
    //Klassens fält
    private int value;
    private int sides;
    private boolean real;

    //"Konstant" variabel som inte kan ändras. Namnges med stora bokstäver och underscore.
    public static final int MAX_SIDES = 12;

    private static Random random = new Random();

    //Default konstruktor.
    // Skapas automatiskt så länge vi inte har några konstruktorer.
    public Die(){
        this(6);  //Skicka vidare anropet till konstruktorn som tar en int som inparameter
                  //Måste utföras på första raden.
    }

    //Konstruktor som tar antalet sidor som inparameter
    public Die(int sides){
        //sides gömmer objektets sides
        //så vi måste använda this för att komma åt rätt variabel
        this.sides = sides;
    }

    //Getter metod för variabeln sides
    public int getSides() {return  sides;}

    public int getValue() {
        return value;
    }

    //Setter method för Value.
    public void setValue(int value) {
        this.value = value;
    }

    //Getter för boolean value kallas för is istället för get.
    //Används sen ofta med koden: if( isReal() )
    public boolean isReal() {
        return real;
    }

    public void setReal(boolean real) {
        this.real = real;
    }

    //Vanlig instancemetod
    public void roll(){
        value = random.nextInt(sides) + 1;
    }
}
