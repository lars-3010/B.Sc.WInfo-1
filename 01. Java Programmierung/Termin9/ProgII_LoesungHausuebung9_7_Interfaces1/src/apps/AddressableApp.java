package apps;
import model.*;

public class AddressableApp {

	public static void main(String[] args) {
		try {
			Addressable addressable = new Student(
					"Hans Mustermann",
					new Location("Lessingstr. 99", 59227, "Ahlen"),
					new Location("Hanselstr. 11", 59227, "Ahlen"),
					Subject.APPLIED_INFORMATICS
					); 
					
			
			Addressable addressable2 = new Company(
					"myCompany",
					new Location("Haupstr. 140", 53113, "Köln"),
					1995
					); 
			
			System.out.println(addressable);
			System.out.println(addressable2);
			
			// etwas schöner:
			print(addressable);
			print(addressable2);
			
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