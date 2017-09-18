package se.iths.martin.exercise4;

public class Computer {
    private String model;
    private int buildYear;
    private long remainingDiskSpace;
    private long totalDiskSpace;

    public Computer(String model, int buildYear, long remainingDiskSpace, long totalDiskSpace) {
        this.model = model;
        this.buildYear = buildYear;
        this.remainingDiskSpace = remainingDiskSpace;
        this.totalDiskSpace = totalDiskSpace;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public long getRemainingDiskSpace() {
        return remainingDiskSpace;
    }

    public void setRemainingDiskSpace(long remainingDiskSpace) {
        this.remainingDiskSpace = remainingDiskSpace;
    }

    public long getTotalDiskSpace() {
        return totalDiskSpace;
    }

    public void setTotalDiskSpace(long totalDiskSpace) {
        this.totalDiskSpace = totalDiskSpace;
    }

    public void boot(){
        System.out.println("Welcome!");
    }

    public void reinstall(){
        setRemainingDiskSpace(getTotalDiskSpace());
    }

    public void crash(){
        System.out.println("Crash!");
    }
}
