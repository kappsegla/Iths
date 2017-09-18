package se.iths.martin.exercise4;

public class PC extends Computer {
    public PC(String model, int buildYear, long remainingDiskSpace, long totalDiskSpace) {
        super(model, buildYear, remainingDiskSpace, totalDiskSpace);
    }

    @Override
    public void boot() {
        super.boot();
    }

    @Override
    public void crash() {
        super.crash();
    }
}
