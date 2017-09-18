package se.iths.martin.exercise4;

public class Mac extends Computer {
    public Mac(String model, int buildYear, long remainingDiskSpace, long totalDiskSpace) {
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
