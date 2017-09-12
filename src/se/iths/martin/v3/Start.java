package se.iths.martin.v3;

import java.util.ArrayList;
import java.util.Random;

public class Start {

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

        FarmBuilding farm = new FarmBuilding(1994, 1000000, 23);
        FarmBuilding farm2 = new FarmBuilding(1994, 1000000);
        CottageBuilding cottageBuilding = new CottageBuilding(1980, 2000000, 3);
        ApartmentBuilding a = new ApartmentBuilding(2007,20000000, 10);
        a.getApartments();


        Building building = farm;


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
