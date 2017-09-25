package se.iths.martin.v5;

public class Person {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age < 0)
            throw new AgeNegativeException();
        this.age = age;
    }

    private int age;

}
