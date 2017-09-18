package se.iths.martin.exercise4;

public class Mac extends Computer {
    public Mac(String model, int buildYear, long remainingDiskSpace, long totalDiskSpace) {
        super(model, buildYear, remainingDiskSpace, totalDiskSpace);
    }

    @Override
    public void boot() {
        System.out.println("And we are ready...");
    }

    @Override
    public void crash() {
        System.out.println("An error occured but you may continue.");
    }
}
