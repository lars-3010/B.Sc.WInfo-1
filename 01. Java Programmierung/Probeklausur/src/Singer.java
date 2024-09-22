import information.*;

public class Singer extends Musician{
    private Voice voice;

    public Singer(String name, int yearOfBirth) {
        super(name, yearOfBirth);
    }

    public boolean isSoloist() {
        return true;
    }

}
