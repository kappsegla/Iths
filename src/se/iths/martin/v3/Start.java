package se.iths.martin.v3;

import java.util.ArrayList;
import java.util.Random;

public class Start {

    public final static int MAX_BUILDINGS = 1000;

    public final static boolean DEBUG = false;

    public static void testPersons() {
        Person person = new Person("TestPerson");
        Student student = new Student("Studentsson");
        Teacher teacher = new Teacher("Martin");

        //Det går bra att lagra en reference till en instance av Student
        //i en variabel av typen Person, eftersom Student också är en Person.
        //Person person1 = new Student();

        //Om man skulle vilja konvertera tillbaka Studenten ovan till sin rätta typ
        /*if( person1 instanceof Student) {
            Student s = (Student) person1;
        }*/

        System.out.println(person.getName());
        System.out.println(student.getName());
        System.out.println(teacher.getName());

        //printName(student);
        //printName(teacher);

    }

    public static void testBuildings() {

        int count = 0;

        FarmBuilding farm = new FarmBuilding(1994, 1000000, 23);
        count++;
        FarmBuilding farm2 = new FarmBuilding(1994, 1000000);
        count++;
        CottageBuilding cottageBuilding = new CottageBuilding(1980, 2000000, 3);
        count++;
        ApartmentBuilding a = new ApartmentBuilding(2007,20000000, 10);
        count++;

        if( count > Start.MAX_BUILDINGS) {
            System.out.println("No more buildings for you!");
        }

        //Create an instance of Building. Immutable object. No setters.
        Building building = new Building(1980,100000);
        if( DEBUG ) {
            System.out.println("Testkod som bara skrivs ut när vi har DEBUG == true");
        }
        //Only the object itself is immutable. Not the reference variable
        //that can be changed to point to another object.
        building = farm;

        //A variable declared final can only be assigned once.
        final Building building1 = new Building(1980,200000);
        //The following line will fail if uncommented
        //building1 = farm;

        final FarmBuilding martinsFarm = new FarmBuilding(2010,1000,2);
        martinsFarm.setPigs(10);
        final FarmBuilding martinsSecondFarm;
        martinsSecondFarm = new FarmBuilding(2011,1000,3);
    }

    public static void main(String[] args) {
        //testPersons();
        testBuildings();
    }

    /**
     * @param person Låter oss skicka in både Students och Teacher objekt via Person argumentet
     */
    public static void printName(Person person) {
        System.out.println(person.getName());
    }

}
