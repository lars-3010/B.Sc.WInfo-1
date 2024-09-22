import information.*;

public class Instrumentalist extends Musician {
    private Voice voice;

    public Instrumentalist(String name, int yearOfBirth) {
        super(name, yearOfBirth);
    }

    public boolean isSoloist() {
        return true;
    }

    public String toString() {
        return super.toString();
    }
}
