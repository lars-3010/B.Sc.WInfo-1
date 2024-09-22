package model;
//Katrin Witting (basierend auf einem Konzept von Peter Ruckmann)

//Klasse Student als Unterklasse von Person (diese ist final, d.h. die kann keine Unterklassen haben)
public final class Student extends Person {
	
	//Instanzvariablen von Student (nun ohne die Instanzvariablen von Person)
	private int id;
	private Subject subject;
	
	//Konstruktoren von Student
	public Student(String name, Location placeOfBirth, Location residence, Subject subject) throws IdRangeException { 
		super(name, placeOfBirth, residence);
		this.id = IdFactory.getNextId();
		this.subject = subject;
	}

	public Student(String firstName, String lastName, Location placeOfBirth, Location residence, Subject subject) throws IdRangeException {
		super(firstName + " " + lastName, placeOfBirth, residence);
		this.id = IdFactory.getNextId();
		this.subject = subject;
	}	
	
	
	// Instanzmethoden von Student:
	
	public int getId() {  // später: public final int getId()
		return this.id;
	}
	
	public Subject getSubject() {
	    return subject;
	}
	
	public void setSubject(Subject subject) {
        this.subject = subject;
    }
	
	public String getTypeName() {
		return "Student";
	}
	
	//	Weitere Standardmethoden
	public String toString() {
		return super.toString() 
				+ ", has id "  + this.id 
				+ ", studies " + this.subject;
	}	
}


