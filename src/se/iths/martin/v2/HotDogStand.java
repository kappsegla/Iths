package se.iths.martin.v2;

public class HotDogStand {
    public int hotDogs;

    public HotDogStand(int count) {
        hotDogs = count;
    }

    public void feed(Person p)
    {
        if( p.isHungry() && hotDogs > 0) {
            p.setHungry(false);
            hotDogs--;
        }
    }
}
