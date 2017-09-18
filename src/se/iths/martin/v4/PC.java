package se.iths.martin.v4;

public class PC extends Computer{

    public PC(String os) {
        super(os);
    }

    public void playGame(){
        System.out.println("GTA V rules");
    }

    @Override
    public void printYourInventor() {
        super.printYourInventor();
        System.out.println("Bill Gates");
    }
}
