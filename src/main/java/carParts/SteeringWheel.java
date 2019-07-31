package carParts;

public class SteeringWheel {

    private String horn;
    private Boolean paddles, musicControls;

    public SteeringWheel(String horn, Boolean paddles, Boolean musicControls) {
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
    public String tuneRadio(String station){
        return "You tuned the radio! to " + station + "!";
    }
}

