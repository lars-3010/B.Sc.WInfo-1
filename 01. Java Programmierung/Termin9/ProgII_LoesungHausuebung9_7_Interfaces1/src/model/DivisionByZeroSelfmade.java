package model;

public class DivisionByZeroSelfmade extends Exception {
	
	//Konstruktor der eigenen Exception
	public DivisionByZeroSelfmade(){
		super("\nIch möchte nochmal explizit darauf hinweisen, \ndass hier durch 0 geteilt werden soll - das geht nicht!");
		//super("text");
	}
	
	//zweiter Konstruktor der eigenen Exception
	public DivisionByZeroSelfmade(String errorDescription){
		super(errorDescription);
	}
}
