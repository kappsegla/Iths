package se.iths.martin.v2;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public boolean hungry;

    public Person() {
        hungry = false;
    }

   public Person(boolean ishungry) {
        hungry = ishungry;
    }

    public Person(String yourName, boolean isHungry)
    {
        hungry = isHungry;
        firstName = yourName;
    }
}
