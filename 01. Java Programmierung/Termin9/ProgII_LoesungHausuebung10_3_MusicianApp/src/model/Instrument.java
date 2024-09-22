package model;

public enum Instrument {

	BRASS, 
	KEYBOARD, 
	PERCUSSION, 
	STRING, 
	WOODWIND;

	public String toString() {
		switch (this) {
		case BRASS:
			return "Blechblasinstrument";
		case KEYBOARD:
			return "Keyboard";
		case PERCUSSION:
			return "Schlagzeug";
		case STRING:
			return "Streichinstrument";
		case WOODWIND:
			return "Holzblasinstrument";
		default:
			return null;
		}
	}

}