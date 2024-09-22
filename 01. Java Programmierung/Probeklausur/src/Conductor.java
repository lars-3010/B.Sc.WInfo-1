public class Conductor extends Musician {
    public Conductor(String name, int yearOfBirth) {
        super(name, yearOfBirth);
    }

    public boolean isSoloist() {
        return false;
    }
}
