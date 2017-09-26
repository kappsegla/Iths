package se.iths.martin.v5.generics;


import se.iths.martin.v3.Person;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<String, Integer>("hej", 5);
        String s = p1.getFirst();
        Pair<Random, Double> p2 = new Pair<Random, Double>(new Random(), 5.5);
        p2.setSecond(13.37);
        double d = p2.getSecond();

        Pair<Random, Integer> p3 = new Pair<Random, Integer>(new Random(), 5);


        //   Box b = new Box();
        //   Person p = new Person("Martin");
        //   b.set(p);
        //Person s = (Person) b.get();
    }
}
