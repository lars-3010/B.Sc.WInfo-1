package model;

// Loesung der Hausübung 6.6
public enum Function {
	ADMINISTRATION("Administration"), 
	IT("IT"), 
	MARKETING("Marketing"), 
	SALES("Sales");

	private String englishName;

	private Function(String englishName) {
		this.englishName = englishName;
	}

	public String toString() {
		return englishName;
	}
}

