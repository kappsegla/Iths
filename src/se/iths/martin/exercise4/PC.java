package se.iths.martin.exercise4;

public class PC extends Computer {
    public PC(String model, int buildYear, long remainingDiskSpace, long totalDiskSpace) {
        super(model, buildYear, remainingDiskSpace, totalDiskSpace);
    }

    @Override
    public void boot() {
        System.out.println("Starting " + getModel());
    }

    @Override
    public void crash() {
        System.out.println("Blue Screen");
    }
}
