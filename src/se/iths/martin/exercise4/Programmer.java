package se.iths.martin.exercise4;

public class Programmer {
    private String name;
    private String[] languages;
    private Computer computer;

    public Programmer(String name, String[] languages, Computer computer) {
        this.name = name;
        this.languages = languages;
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(int hours){
        System.out.println(getName()+ ", time to do some work!");
        computer.boot();
        if( hours > 8 )
            computer.crash();
        if( hours > 100)
            computer.reinstall();
    }
}
