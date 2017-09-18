package se.iths.martin.v4;

public class Computer {

    private String os;

    public Computer(String os) {
        this.os = os;
    }

    public void printOS() {
        System.out.println("Operating system: " + os);
    }
}
