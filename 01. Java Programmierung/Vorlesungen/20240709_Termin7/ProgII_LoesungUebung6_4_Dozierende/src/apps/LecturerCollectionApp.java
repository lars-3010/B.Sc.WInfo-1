package apps;

import model.*;
import utilities.Console;
import controller.*;

public class LecturerCollectionApp {

	public static void main(String[] args) {
		
		LecturerCollection collection = new LecturerCollection();
		
		//Ausgabe aller aktuell eingetragenen Daten
		System.out.println(collection + "\n\n");
		
		// Erstellung einiger Einträge zum Testen
		collection.add(
				new Lecturer("Dr. Marita Beispiel", 
						new Location("Reetweg 3", 26789, "Leer"), 
						new Location ("Arbeitsweg 33", 33098, "Paderborn"), 
						Faculty.COMPUTER_SCIENCE, Role.LECTURER
						)
				);
		collection.add(
				new Lecturer("Dr. Mario Brenner", 
						new Location("Alter Weg 33", 38723, "Seesen"), 
						new Location ("Studiweg 11", 33098, "Paderborn"), 
						Faculty.BUSINESS_ADMINISTRATION, Role.VISITING_LECTURER
						)
				);
		collection.add(new Lecturer());
		System.out.println(collection);
		
		collection.delete("Dr. Marita Beispiel");
		collection.delete("Unknown");
		
		System.out.println(collection);
		
		// Erstellung von Einträgen über Eingaben auf der Konsole:		
		collection.add(new Lecturer(
					Console.readString("Enter lecturer name"),
					LocationController.readLocation("place of birth"),
					LocationController.readLocation("residence"),
					Console.readChoice("faculty", Faculty.values()),
					Console.readChoice("role", Role.values())
					)
				);
		System.out.println(collection);
	}

}

