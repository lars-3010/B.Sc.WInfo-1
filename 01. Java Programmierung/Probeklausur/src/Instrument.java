public enum Instrument {
    Brass("Blechblasinstrument"),
    Keyboard("Tasteninstrument"),
    Percussion("Schlagzeug"),
    String("Streichinstrument"),
    Woodwind("Holzblasinstrument");

    private final String germanName;

    Instrument(String germanName) {
        this.germanName = germanName;
    }

    @Override
    public String toString() {
        return germanName;
    }
}