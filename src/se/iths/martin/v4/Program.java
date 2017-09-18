package se.iths.martin.v4;

public class Program {
    public static void main(String[] args) {
        Mac m = new Mac();
        PC pc1 = new PC("Windows 10");
        Computer c = new PC("RedHat");

        //m is a Mac. playITunes() works
        m.playITunes();

        //pc1 is a PC. playGame() works
        pc1.playGame();

        //c is a Computer when the compiler looks at the code.
        c.printOS();

        //This works. c is really a PC so we can typecast.
        PC pc2 = (PC)c;

        //This will not work. Runtime ClassCastException.
       // Computer c2 = m;
       // PC pc3 = (PC)c2;




    }
}
