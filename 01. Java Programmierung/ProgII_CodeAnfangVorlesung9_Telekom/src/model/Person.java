package model;
//Katrin Witting (basierend auf einem Konzept von Peter Ruckmann)

public abstract class Person {
	private String name;
	private Location placeOfBirth;
	private Location residence;
	
	public Person(String name, Location placeOfBirth, Location residence) {
		this.name = name;
		this.placeOfBirth = placeOfBirth;
		this.residence = residence;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final Location getPlaceOfBirth() {
		return placeOfBirth;
	}

	public final void setPlaceOfBirth(Location placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public final Location getResidence() {
		return residence;
	}

	public final void setResidence(Location residence) {
		this.residence = residence;
	}
	
	public String toString() {
		return this.name
				+ ", born at " + this.placeOfBirth
				+ ", lives at " + this.residence;
	}
	
	public abstract String getTypeName();
	
}

