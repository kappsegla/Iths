package se.iths.martin.v5.generics;


import se.iths.martin.v3.Person;

public class Program {
    public static void main(String[] args) {
        Box b = new Box();
        Person p = new Person("Martin");
        b.set(p);
        //Person s = (Person) b.get();
    }
}
