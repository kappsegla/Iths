package se.iths.martin.v3;

public class Student extends Person {
    private int csnPerMonth;

    public Student(String name){
        super(name);
    }

    public int getCsnPerMonth() {
        return csnPerMonth;
    }

    public void setCsnPerMonth(int csnPerMonth) {
        this.csnPerMonth = csnPerMonth;
    }
}
