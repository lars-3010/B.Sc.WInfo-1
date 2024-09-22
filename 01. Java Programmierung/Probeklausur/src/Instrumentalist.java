import information.*;

public class Instrumentalist extends Musician {
    private Instrument instrument;

    public Instrumentalist(String name, int yearOfBirth, Instrument instrument) {
        super(name, yearOfBirth);
        this.instrument = instrument;
    }

    public boolean isSoloist() {
        return true;
    }

    public String toString() {
        return super.toString() + this.instrument;
    }
}
