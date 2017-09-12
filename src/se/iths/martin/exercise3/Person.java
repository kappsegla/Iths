package se.iths.martin.exercise3;

public class Person {

    private String name;
    private String occupation;
    private int age;
    private int savings;

    public Person(String name, String occupation, int age, int savings) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.savings = savings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSavings() {
        return savings;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }






}
