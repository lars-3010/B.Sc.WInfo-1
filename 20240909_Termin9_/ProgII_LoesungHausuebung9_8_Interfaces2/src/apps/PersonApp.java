package apps;
import model.*;

public class PersonApp {

	public static void main(String[] args) {
	try {	
		Person person = new Lecturer("Peter Meier", 
						new Location("Street 3", 32345, "Town3"), 
						new Location("Street 4", 42345, "Town4"),
						Faculty.BUSINESS_ADMINISTRATION,
						Role.PRESIDENT
					 );
		print(person);
		
		Lecturer lecturer = new Lecturer("Peter Müller", 
				new Location("Street 5", 32345, "Town5"), 
				new Location("Street 5", 42345, "Town5"),
				Faculty.BUSINESS_ADMINISTRATION,
				Role.LECTURER
			 );
		print(lecturer);
		
		Company myCompany = new Company("Firma xy", 
				new Location("Gewerbegebiet 55", 32345, "Town3"), 
				1995
			 );
		print(myCompany);
		
	} catch (IdRangeException eId) {
		System.out.println(eId);
	}
	
	}
	
	private static void print(Addressable addressableObject) {
		System.out.println("Name:" + addressableObject.getName());
		System.out.println("Location:" + addressableObject.getLocation());
		System.out.println("----------------------------------------------------------");
	}	
		
}
