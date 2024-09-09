package model;

public enum Faculty {
	BUSINESS_ADMINISTRATION("Business Administration"),
	COMPUTER_SCIENCE("Computer Science");
	
	private String englishName;
	
	private Faculty(String englishName) {
		this.englishName = englishName;
	}
	
	public String toString() {
		return englishName;
	}
}
