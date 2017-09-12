package se.iths.martin.v3;

public class CottageBuilding extends PrivateBuilding {
    private int rooms;

    public CottageBuilding(int year, int value, int rooms) {
        super(year, value);
        this.rooms = rooms;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}
