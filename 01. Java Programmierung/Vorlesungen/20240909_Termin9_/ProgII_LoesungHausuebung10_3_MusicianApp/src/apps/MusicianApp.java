package apps;

import model.*;

public class MusicianApp {

	public static void main(String[] args) {
		
		Ageable person1 = new Instrumentalist("Moritz", 1980, Instrument.WOODWIND);
			
		System.out.println(person1);
		System.out.println();
		//System.out.println(person1.getAge());
		
		Musician person2 = new Singer("Frida", 1989, Voice.SOPRANO);
		
		System.out.println(person2);
		System.out.println(person2.getName() + " ist Soloist: " + person2.isSoloist());  
		System.out.println();
        
		//weiteres Beispiel
		Musician person3 = new Conductor("Max", 1977);

		System.out.println(person3);
		System.out.println(person3.isSoloist()); 
		System.out.println(person3.getAge());

	}

}