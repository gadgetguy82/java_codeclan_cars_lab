package carParts;

public class StearingWheel {

    private String horn;
    private Boolean paddles, musicControls;

    public StearingWheel(String horn, Boolean paddles, Boolean musicControls) {
        this.horn = horn;
        this.paddles = paddles;
        this.musicControls = musicControls;
    }

    public String getHorn() {
        return horn;
    }

    public Boolean getPaddles() {
        return paddles;
    }

    public Boolean getMusicControls() {
        return musicControls;
    }
}

