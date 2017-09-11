package se.iths.martin.v3;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name) {
        super(name);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
