package se.iths.martin.v3;

//Student ärver klassen Person och får alla metoder och fält
//med sig därifrån som vi sen kan utöka här
public class Student extends Person {
    private int csnPerMonth;

    public Student(String name){
        super(name);  //Skicka anropet vidare till Person klassens konstruktor, (superklassen)
    }

    //Nya metoder för Student som blir utöver de som kommer från Person.
    public int getCsnPerMonth() {
        return csnPerMonth;
    }

    public void setCsnPerMonth(int csnPerMonth) {
        this.csnPerMonth = csnPerMonth;
    }
}
