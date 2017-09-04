package se.iths.martin.v2;

public class Start {
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.firstName = "Martin";
        p1.lastName = "Blomberg";
        p1.hungry = true;

        HotDogStand sibylla = new HotDogStand();
        sibylla.hotDogs = 1;
        System.out.println(p1.firstName + " is hungry = " + p1.hungry);
        sibylla.feed(p1);
        System.out.println(p1.firstName + " is hungry = " + p1.hungry);



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
