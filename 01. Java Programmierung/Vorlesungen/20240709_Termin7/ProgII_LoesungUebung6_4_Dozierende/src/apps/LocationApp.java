//Katrin Witting (basierend auf einem Konzept von Peter Ruckmann)

package apps;

import model.Location;

public class LocationApp {

	public static void main(String[] args) {
		Location location = new Location("Reetweg 3", 26789, "Leer" );
		System.out.println(location);
	}

}
