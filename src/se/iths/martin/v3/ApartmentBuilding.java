package se.iths.martin.v3;

import se.iths.martin.v2.Adress;

/**
 *A class representing an commercial apartment building that has a number
 * of apartments.
 * @author Martin
 */
public class ApartmentBuilding extends CommercialBuilding {
    private int apartments;

    public ApartmentBuilding(int year, int value, int apartments) {
        super(year, value);
        this.apartments = apartments;
    }

    /**
     * Get the number of apartments in the building.
     * @return Number of apartments, greater than 0
     */
    public int getApartments() {
        return apartments;
    }

    /**
     * Changes the number of apartments in the building. Use when renovating or adding floors.
     * @param apartments Number of apartments, must be greater 0
     */
    public void setApartments(int apartments) {
        this.apartments = apartments;
    }
}
