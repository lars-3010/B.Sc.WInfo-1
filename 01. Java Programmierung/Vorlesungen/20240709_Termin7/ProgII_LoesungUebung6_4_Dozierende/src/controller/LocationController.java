package controller;

import model.Location;
import utilities.Console;

public class LocationController {
	
	public static Location readLocation(String locationType) {
		Console.println("Enter " + locationType + ":");
		Console.openSection();
		Location location = new Location (
				Console.readString("Enter street"), 
				Console.readInt("Enter zip", 1, 99999),
				Console.readString("Enter town"));
		Console.closeSection();
		return location;
	}
}