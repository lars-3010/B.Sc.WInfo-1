package information;

public enum Voice {
    SOPRANO("Sopran", Gender.FEMALE),
    ALTO("Alt", Gender.FEMALE),
    TENOR("Tenor", Gender.MALE),
    BASS("Bass", Gender.MALE);

    private String germanName;
    private Gender gender;

    private Voice(String germanName, Gender gender) {
        this.germanName = germanName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return germanName;
    }
    
    public Gender getGender() {
        return this.gender;
    }
}