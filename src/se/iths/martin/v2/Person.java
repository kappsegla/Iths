package se.iths.martin.v2;

import java.awt.event.AdjustmentEvent;
import java.util.Random;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private boolean hungry;

    public Person() {
        setHungry(false);
}

   public Person(boolean ishungry) {
        setHungry(ishungry);
    }

    public Person(String yourName, boolean isHungry)
    {
        setHungry(isHungry);
        firstName = yourName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}
