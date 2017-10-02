package se.iths.martin.repetition;

import java.util.ArrayList;

public class Player {
    private String name;
    private int score;
    //Deklaration av generisk referenstyp med namnet dice som initieras direkt till
    //en ny instance av ArrayList<>
    private ArrayList<Die> dice = new ArrayList<>();

    public Player(String name){

    }

    public int getDieValue(){
        int summa = 0;
        //Kompakt version
//        for (int i = 0; i < dice.size(); i++) {
//            summa += dice.get(i).getValue();
//        }
        //Lång version
//        for (int i = 0; i < dice.size(); i++) {
//            Die d = dice.get(i);
//            summa = summa + d.getValue();
//        }
        //Kortast version med foreach
        for (Die d : dice ) {
            summa += d.getValue();
        }

        //Behövs en return statement eftersom metoden ska returnera ett värde.
        return summa;
    }




}
