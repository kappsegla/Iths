package se.iths.martin.repetition;

public class ConsolePrinter {
    //Overloading exempel. Kompilatorn väljer rätt metod vid kompilering
    //baserat på inparametrarnas typer och antal och ordning.
    //Overloading och override är inte samma sak.

    public static void println(String s) {
        System.out.println(s);
    }

    //Dålig metod, använd overloading istället
//    public static void printInt(int i) {
//
//    }

    public static void println(int i){
        System.out.println(i);
    }

    //Detta fungerar inte, då overloading där endast returtyp skiljer inte supportas.
//    public static int println(String s){
//        return  0;
//    }


}
