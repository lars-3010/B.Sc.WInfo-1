/**
 * This is the class "Student"
 * @author Katrin W.
 *
 **/

public class Student {
	
	public static final int FIRST_ID = 10001;
	public static final int LAST_ID = 99999;
	private static int nextId = FIRST_ID;
	
	//Instanzvariablen
	private int id;
	private String name;
	/**
	 * @return the id
	 * weiterer Text zum Testen
	 */
	
	//Konstruktoren
	public Student(){
		//empty constructor
		this.id = nextId++; //wir möchten trotzdem eine Id vergeben
	}
	
	//	public Student(int id){
	//		//if (id>10000 && id<=99999) {
	//		if (id>=FIRST_ID && id<=LAST_ID) {
	//			this.id = id;
	//		}
	//		else {
	//			System.out.println("Fehler bei der id-Eingabe (falscher Bereich)");
	//			this.id = 0;
	//		}
	//		this.name = "UNKNOWN";
	//	}
	
	public Student(String name){
		this.id = nextId++;
		this.name = name;
	}
	
	
	// Getter and setter
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	private void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String firstName, String lastName) {
		this.name = firstName + " " + lastName;
	}
	
	// Klassenmethoden laut Aufgabenteil d)
	
	static int getNoOfAvailableIds() {
	    return LAST_ID-nextId+1;	
	}

	static int getNoOfAssignedIds() {
	    return nextId-FIRST_ID;	
	}

	@Override
	public String toString() {
		//return "Student [id=" + id + ", name=" + name + "]";
		return "Student " + name + " hat die Id " + id;
	}
}
