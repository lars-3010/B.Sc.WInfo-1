package model;

public class Instrumentalist extends Musician {

	private Instrument instrument;

	public Instrumentalist(String name, int yearOfBirth, Instrument instrument) {
		super(name, yearOfBirth);
		this.instrument = instrument;
	}

	public String toString() {
		return super.toString() + ", Instrument: " + this.instrument;
	}

	public boolean isSoloist() {
		return true;
	}
}
