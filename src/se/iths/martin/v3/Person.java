package se.iths.martin.v3;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name; //this refererar till objektets variabler för att skilja på lokala variabeln name
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
