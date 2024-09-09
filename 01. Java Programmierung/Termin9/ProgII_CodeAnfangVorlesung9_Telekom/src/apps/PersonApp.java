package apps;
import model.*;

public class PersonApp {

	public static void main(String[] args) throws IdRangeException {
		
		System.out.println("---- Beispiel 1: in die Variable person wird ein Student eingetragen ----");
		Person person = new Student("Hanne Meier",
							new Location("Street 1", 12345, "Town1"), 
							new Location("Street 2", 22345, "Town2"),
							Subject.BUSINESS_INFORMATICS
						);
		//System.out.println(getTypeName(person)); // Lösung ohne abstrakte Klassen
		System.out.println(person.getTypeName());
		System.out.println(person);
		System.out.println("------------------------------------------------------------------------\n");
		
		
		System.out.println("---- Beispiel 2: in die Variable person wird nun ein Lecturer eingetragen ----");
		person = new Lecturer("Peter Meier", 
					new Location("Street 3", 32345, "Town3"), 
					new Location("Street 4", 42345, "Town4"),
					Faculty.BUSINESS_ADMINISTRATION,
					Role.PRESIDENT
				 );
		//System.out.println(getTypeName(person)); // Lösung ohne abstrakte Klassen
		System.out.println(person.getTypeName());
		System.out.println((Lecturer) person);
		System.out.println("------------------------------------------------------------------------\n");
		
		System.out.println("---- Beispiel 3: person wird in eine neue Variable lecturer kopiert ----");
		Lecturer lecturer = (Lecturer) person;
		//System.out.println(getTypeName(lecturer)); // Lösung ohne abstrakte Klassen
		System.out.println(lecturer.getTypeName());
		System.out.println(lecturer);
		System.out.println(lecturer.getFaculty());
		System.out.println("------------------------------------------------------------------------\n");
	   
		
		Person person3 = new Student("Hanne Meier",
				new Location("Street 1", 12345, "Town1"), 
				new Location("Street 2", 22345, "Town2"),
				Subject.BUSINESS_INFORMATICS
		);
	
		// Provozieren der IdRangeException
		//		Person person4 = new Student("Hanne Meier",
		//				new Location("Street 1", 12345, "Town1"), 
		//				new Location("Street 2", 22345, "Town2"),
		//				Subject.BUSINESS_INFORMATICS
		//		);
	}
    
	// Lösung ohne abstrakte Klasse Person
	//	private static String getTypeName(Person person) {
	//		if (person instanceof Student) {
	//			return "Student";
	//		} else if (person instanceof Lecturer){
	//			return "Lecturer";
	//		} else {
	//			return "Person";
	//		}		
	//	}
	// später wurde diese Methode verlagert in die Unterklassen, zzgl. Definition als abstrakte Klasse in Person
	// Zugriff dann über person.getTypeName()

	

}
