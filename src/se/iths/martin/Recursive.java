package se.iths.martin;

public class Recursive {

    public static int numberOfCalls = 0;

    public static void main(String[] args){
        recursiveMethod();
    }

    public static void recursiveMethod()
    {
        numberOfCalls++;
        System.out.println(numberOfCalls);

        if( numberOfCalls < 100)
            recursiveMethod();
    }
}
