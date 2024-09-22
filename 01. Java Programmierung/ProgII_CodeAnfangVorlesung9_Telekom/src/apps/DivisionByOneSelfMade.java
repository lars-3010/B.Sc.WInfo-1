package apps;

public class DivisionByOneSelfMade extends Exception {
	//optionaler Konstruktor mit eigenem Text zur Exception
	public DivisionByOneSelfMade() {
		super("Ich verbiete jetzt, dass wir durch 1 teilen.");
	}

	//optionaler zweiter Konstruktor der eigenen Exception
	public DivisionByOneSelfMade(String errorDescription) {
		super(errorDescription);
	}
	
}
