package se.iths.martin.repetition;

public class Program {

    public static int variableName;
    public int variableTwo;

    //I java består en metods signatur av metodnamn + argumentstyper.
    //Returtyp ingår inte i signaturen
    public void metod1(){
        this.metod1(1);  //this refererar till det egna objektet
        metod1(2);       //Går lika bra utan this
    }
    //En metod1 till som har en inparameter och blir en overloadad version
    public void metod1(int i){}

    //Statisk metod
    public static int metod2(int i, double d){

        return 10;  //Returnera en int. Java tillåter endast en returtyp
    }

    public static void main(String[] args) {
        Program p = new Program();  //Skapa en instance av klassen Program. Spara referensen i p
        p.metod1();  //Instancemetod

        Program.metod2(1,2.0); //Statisk metod, accessas via klassen
    }
}
