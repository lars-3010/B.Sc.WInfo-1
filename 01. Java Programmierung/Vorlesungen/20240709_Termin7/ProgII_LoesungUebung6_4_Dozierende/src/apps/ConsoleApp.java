package apps;

import utilities.Console;
import model.Location;
import model.Student;

public class ConsoleApp {

	public static void main(String[] args) {
		
		Console.openSection();
		
		Student student1 = new Student(
				Console.readString("Student name"),
					new Location(
						Console.readString("Street including number"), 
						Console.readInt("Postal code"),
						Console.readString("Town")
					)
				);
		System.out.println(student1);
		
		// Anderes Beispiel: Noten verarbeiten
		//		Console.println("Bitte eine Note eingeben:");
		//		Console.openSection();
		//		String grade = Console.readChoice("grade", 
		//						"Sehr gut", "Gut", "Befriedigend", "Ausreichend", "Mangelhaft");
		//		Console.closeSection();
		//		Console.println("Die gewählte Note ist: " + grade);
		
		// Anderes Beispiel: Adresse auswählen
		//		Location fhdwLocation = Console.readChoice("Location", 
		//						new Location ("Meisenstraße 42", 33602, "Bielefeld"),
		//						new Location ("Fürstenallee 5-7", 33102, "Paderborn")
		//				);
		//		Console.println("choice was: " + fhdwLocation);
		
		
		// Sonstiges
		//Console.openSection();
		/*
		String text = Console.readString("Please enter text");
		Console.println("text just read is: " + text);
		double price = Console.readDouble("Please enter article price");
		Console.println("article price is: " + price);

		int dice = Console.readInt("Please enter dice rolling result", 1, 6);
		Console.println("dice rolling result is: " + dice);
		Console.closeSection();

		
		String choice = Console.readChoice("String", "abc", "defghi", "xyz");
		Console.println("choice was: " + choice);
						*/
		
		
		
						
		//Console.print("Bitte geben Sie einen Namen ein:");
		//Console.readString(null)
		
		//		String stud1Name = Console.readString("Name des Studenten: ");
		//		String stud1Street = Console.readString("Straße und Hausnummer: ");
		//		int stud1Zip = Console.readInt("PLZ: "); 
		//		String stud1Town = Console.readString("Wohnort: ");
		//		
		//		Console.println("Student name is: " + stud1Name + "\n\tStudent address is: " + stud1Street +", " + stud1Zip + " "+ stud1Town);
		//		
		
		
		//Console.openSection();
		

		
		// openSection, closeSection --> eingerückt Eingaben
		// Wohnort:
		//    abfrage
		// Geburtsort
		//    abfrage
		
		// methode readStudent innerhalb der main-Klasse, hat Student als Rückgabetyp
		// methode readLocation, wird in readStudent aufgerufen
		
		
		// später: arrays beispielhaft für Menge von Students anlegen und dann diese Menge einlesen
		// z.B. sehr großes Array 0 bis maxId, dann jeden Studenten an eine Id hängen (löschen: pos mit 0 überschreiben)
		// eleganter mit collections, kommt ganz zum schluss
		
		
		// Console.readInt(1) // --> korrigiert unzulässige Eingaben
                
		
		//Location location = new Location("Reetweg 3", 26789, "Leer" );
		
		//		double price = Console.readDouble("Please enter article price");
		//		Console.println("article price is: " + price);
		
		


	}

}
