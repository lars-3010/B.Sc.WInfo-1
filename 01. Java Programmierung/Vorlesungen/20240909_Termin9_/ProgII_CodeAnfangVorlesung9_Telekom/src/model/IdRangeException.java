package model;

public class IdRangeException extends Exception {
	public IdRangeException() {
		super("Nicht mehr genügend Matrikelnummern verfügbar.");
	}
}