import information.Instrument;

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
        return super.toString() + " und spielt: " + this.instrument;
    }
}
