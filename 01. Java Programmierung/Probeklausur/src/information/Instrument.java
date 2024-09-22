package information;

public enum Instrument {
    BRASS("Blechblasinstrument"),
    KEYBOARD("Tasteninstrument"),
    PERCUSSION("Schlagzeug"),
    STRING("Streichinstrument"),
    WOODWIND("Holzblasinstrument");

    private String germanName;

    private Instrument(String germanName) {
        this.germanName = germanName;
    }

    @Override
    public String toString() {
        return germanName;
    }
}