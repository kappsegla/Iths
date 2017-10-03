package se.iths.martin.repetition;

public class Train {
    private String name;
    private boolean late;
    public Train(String name, boolean late) {
        this.name = name;
        this.late = late;
    }
    public Train(String name) {
        this(name, false);
    }
    public void playMusic() {
        System.out.println("♪♫ Leende guldbruna ögon... ♪♫");
    }

    public boolean isLate() {
        return late;
    }
}