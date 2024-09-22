package information;
public enum Gender {
    male("männlich"),
    female("weiblich"),
    diverse("divers");

    private final String germanName;

    Gender(String germanName) {
        this.germanName = germanName;
    }

    @Override
    public String toString() {
        return germanName;
    }
}