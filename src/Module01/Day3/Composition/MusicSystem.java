package Module01.Day3.Composition;

public class MusicSystem {
    private int speakers;

    public MusicSystem(int speakers) {
        this.speakers = speakers;
    }

    public void play() {
        System.out.println("Playing Music");
    }

    public int getSpeakers() {
        return speakers;
    }
}
