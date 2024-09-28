import information.Voice;

public class Singer extends Musician{
    private Voice voice;

    public Singer(String name, int yearOfBirth, Voice voice) {
        super(name, yearOfBirth);
        this.voice = voice;
    }

    public boolean isSoloist() {
        return true;
    }

    public String toString() {
        return super.toString() + " und ist: "+this.voice;
    }
}
