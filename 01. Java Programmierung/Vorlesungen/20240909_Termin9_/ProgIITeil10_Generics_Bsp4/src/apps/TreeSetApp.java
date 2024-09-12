package apps;
import java.util.*;

public class TreeSetApp {
	public static void main(String[] args) {
		Set<String> stringList = new TreeSet<String>();
		stringList.add("Lukas");
		stringList.add("Fabian");
		stringList.add("Jan");
		stringList.add("Katrin");
		System.out.println(stringList);
		
		stringList.remove("Katrin");
		System.out.println(stringList);
		
		
		// Beispiel zur Nutzung der erweiterten for-Schleife:
		int eintrag = 1;
		for ( String s:stringList) {
		    System.out.print("Eintrag "+ eintrag + ": " + s + "\n"); 
		    eintrag++;
		 }
	}

}
