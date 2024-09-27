package model;

public enum Unit {
    LITER,
    KILO,
    PIECE;

    public String toString() {
		switch (this) {
		case LITER:
			return "Liter";
		case KILO:
			return "Kilo";
		case PIECE:
			return "Stück";
		default:
			return null;
		}
	}
}
