package se.iths.martin.v4.intabs;

public class Dog extends Mammal implements Pet, LandBound {

    @Override
    public boolean isCute() {
        return true;
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public int getAge() {
        return 0;
    }
}
