package se.iths.martin.v3;

public class FarmBuilding extends CommercialBuilding {
    private int pigs;

    public FarmBuilding(int year, int value){
        this(year,value,0);
    }

    public FarmBuilding(int year, int value, int pigs) {
        super(year, value);
        this.pigs = pigs;
    }

    public int getPigs() {
        return pigs;
    }

    public void setPigs(int pigs) {
        this.pigs = pigs;
    }
}
