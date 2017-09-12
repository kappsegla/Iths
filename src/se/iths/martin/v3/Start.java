package se.iths.martin.v3;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {

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

    /**
     *
     * @param person Låter oss skicka in både Students och Teacher objekt via Person argumentet
     */
    public static void printName(Person person) {
       System.out.println(person.getName());
    }

}
