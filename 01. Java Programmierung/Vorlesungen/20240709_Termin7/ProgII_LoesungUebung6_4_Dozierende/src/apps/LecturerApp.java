package apps;

import model.*;
import utilities.Console;
import controller.*;

public class LecturerApp {
	public static void main(String[] args) {
		Lecturer lecturer1 = new Lecturer("Marita Beispiel", 
				new Location("Reetweg 3", 26789, "Leer"), 
				new Location ("Arbeitsweg 33", 33098, "Paderborn"), 
				Faculty.COMPUTER_SCIENCE, Role.LECTURER);
		
		System.out.println(lecturer1);
		
		// Einlesen der Daten über die Konsole:
		Lecturer lecturer2 = readLecturer();
		System.out.println(lecturer2);
	}

	private static Lecturer readLecturer() {
		return new Lecturer(
				Console.readString("Enter lecturer name"),
				LocationController.readLocation("place of birth"),
				LocationController.readLocation("residence"),
				Console.readChoice("faculty", Faculty.values()),
				Console.readChoice("role", Role.values())
				);
	}
	
}
