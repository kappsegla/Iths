package se.iths.martin.repetition;

public class Driver {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Driver(String name, int age) {
        setName(name);
        setAge(age);
    }

    private String name;
    private int age;

}
