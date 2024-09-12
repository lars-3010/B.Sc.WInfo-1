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
	
	public String[] toStrings() {
		String[] germanNames = new String[Unit.values().length];
		Unit[] germanUnits = new Unit[Unit.values().length];
		for (int i = 0; i<germanNames.length; i++) {
			germanNames[i] = germanUnits[i].toString();
		}
		return germanNames;
	}
	
	public static Unit parse(String germanName) {
		switch (germanName) {
		case "Liter":
			return LITER;
		case "Kilo":
			return KILO;
		case "Stück":
			return PIECE;
		default:
			return null;
		}
	}

}
