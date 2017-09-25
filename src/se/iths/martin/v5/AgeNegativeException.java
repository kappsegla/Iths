package se.iths.martin.v5;

public class AgeNegativeException extends Exception {
    public AgeNegativeException(){
        super("Negative values not a valid age.");
    }
}
