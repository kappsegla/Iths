package se.iths.martin.v2;

public class Start {
    public static void main(String[] args)
    {
        Person p1 = new Person(true);
        p1.firstName = "Martin";
        p1.lastName = "Blomberg";

        HotDogStand sibylla = new HotDogStand(10);
        System.out.println(p1.firstName + " is hungry = " + p1.hungry);
        sibylla.feed(p1);
        System.out.println(p1.firstName + " is hungry = " + p1.hungry);
        System.out.println("HotDogs left: " + sibylla.hotDogs);
/*
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.name = "Martin";
        e2.name = "Pelle";
        e1.adress = new Adress();
        e1.adress.city = "Kalmar";
        e1.sayHello();
        e2.sayHello();
*/
    }
}
