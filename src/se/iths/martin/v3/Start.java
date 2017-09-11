package se.iths.martin.v3;

public class Start {
    public static void main(String[] args) {

        Person person = new Person("TestPerson");

        Student student = new Student("Studensson");

        Teacher teacher = new Teacher("Martin");

       // Person person1 = new Student();

        /*if( person1 instanceof Student) {
            Student s = (Student) person1;
        }*/

        System.out.println(person.getName());
        System.out.println(student.getName());
        System.out.println(teacher.getName());

        //printName(student);
        //printName(teacher);
    }

    public static void printName(Person person) {
       System.out.println(person.getName());
    }

}
