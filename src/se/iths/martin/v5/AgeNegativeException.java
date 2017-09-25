package se.iths.martin.v5;

public class AgeNegativeException extends IllegalArgumentException {
    public AgeNegativeException(){
        super("Negative values not a valid age.");
    }
}
