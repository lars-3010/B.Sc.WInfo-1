package model;

public enum Voice {

	ALTO(Gender.FEMALE, "Alt"), 
	BASSO(Gender.MALE, "Bass"), 
	SOPRANO(Gender.FEMALE, "Sopran"), 
	TENOR(Gender.MALE, "Tenor");

	private Gender gender;
	private String germanName;
	
	private Voice(Gender gender, String germanName) {
		this.gender = gender;
		this.germanName = germanName;
	}
	
	public Gender getGender() {
		return this.gender;
	}
	
	public String toString() {
		return this.germanName;
	}

}

