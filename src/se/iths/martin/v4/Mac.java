package se.iths.martin.v4;

public class Mac extends Computer {

    public Mac() {
        super("Mac OSX");
    }

    public void playITunes() {
        System.out.println("there’s music in the air");
    }

    @Override
    public void printYourInventor() {
        super.printYourInventor();
        System.out.println("Steve & Steve");
    }
}
