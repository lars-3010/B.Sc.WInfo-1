package information;

public enum Gender {
    MALE("männlich"),
    FEMALE("weiblich"),
    DIVERSE("divers");

    private String germanName;

    private Gender(String germanName) {
        this.germanName = germanName;
    }

    @Override
    public String toString() {
        return germanName;
    }
}