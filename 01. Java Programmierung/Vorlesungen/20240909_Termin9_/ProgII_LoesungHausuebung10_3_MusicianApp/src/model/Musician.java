package model;

public abstract class Musician extends Person {

	public Musician(String name, int yearOfBirth) {
		super(name, yearOfBirth);
	}

	public abstract boolean isSoloist(); 

	public String toString() {
		return super.toString();
	}
}