package se.iths.martin.repetition;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arrayer {
    public static void main(String[] args) {
        //Skapa en array med 10 platser som kan lagra en int på varje plats.
        int[] intarray = new int[10];

        //Skapa en arraylist som inte är begränsad till en viss storlek
        //Kan dock inte lagra int utan måste använda Integer
        //Generics i Java klarar inte värdetyper
        ArrayList<Integer> arrayList = new ArrayList<>();
      
        arrayList.add(100);  //Kommer att autoboxas till en Integer
        arrayList.add(new Integer(40));  //Här gör vi samma jobb själva

        //Tilldela ett värde (100) till första platsen i arrayen
        //0 indexerad
        intarray[0] = 100;
        //Skriv ut 2a platsen i arrayen
        System.out.println( intarray[1] );
        //Skriv ut hela arraylistan.
        //Använder println metoden som tar en Object referens
        //Den anropar sedan toString på arrayList (override på Objects implementation)
        //som i sin tur kör toString på alla lagrade objekt
        System.out.println( arrayList );

    }
}







