package model;

public class Singer extends Musician {

	private Voice voice;

	public Singer(String name, int yearOfBirth, Voice voice) {
		super(name, yearOfBirth);
		this.voice = voice;
	}

	public String toString() {
		return super.toString() + ", Stimmlage: " + this.voice;
	}

	public boolean isSoloist() {
		return true;
	}
}
