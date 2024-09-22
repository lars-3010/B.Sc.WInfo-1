// authors: Katrin Witting and Peter Ruckmann
package apps;

public class StringDemo {

	public static void main(String[] args) {
		
		//Examples for some methods of class String
		String name = "Max";
		name = name + " Mustermann";
		System.out.println(name);
		System.out.println("Zeichen 0: " + name.charAt(0));
		System.out.println("Zeichen 5: " + name.charAt(3));
		System.out.println("Zeichen 5: " + name.charAt(6));
		
		System.out.println("OPQ"+name.charAt(6));
		System.out.println(name.length());

		String name2 = "max mustermann";
		System.out.println("Ist name und name2 ohne Beachtung von Groß-/Kleinschreibung gleich? " + name.equalsIgnoreCase(name2));
        
		System.out.println("Enthält name das Wort Max? " + name.contains("Max"));
		System.out.println("Enthält name das Wort Maxi? " + name.contains("Maxi"));
		
		String name3 = name.concat("-Mueller");
		System.out.println(name3);
		
		//Examples for storage locations of strings
		String string1 = "abcde";
		String string2 = "abcde";
		String string3 = new String("abcde");

		String string4 = "abcd";
		String string5 = null;
		String string6 = string2;

		System.out.println("HashCode von string1: " + System.identityHashCode(string1));
		System.out.println("HashCode von string2: " + System.identityHashCode(string2));
		System.out.println("HashCode von string3: " + System.identityHashCode(string3));
		System.out.println("HashCode von string4: " + System.identityHashCode(string4));
		System.out.println("HashCode von string5: " + System.identityHashCode(string5));
		System.out.println("HashCode von string6: " + System.identityHashCode(string6));
		
		System.out.println(string1 == string2);
		System.out.println(string1 == string3);
		System.out.println(string6 == string2);
		System.out.println(string6 == string1);
		System.out.println(string6 == string3);	
		
		// Examples for using the method getReverse() (see below)
      	System.out.println(getReverse("Max"));
     	System.out.println("Mutakirorikatum rückwärts ist: " + getReverse("Mutakirorikatum"));
		
	}
	
    // Method for reverse writing of strings
	private static String getReverse(String string) {
		if (string.length()==0) {
			return "";
		} else {
			// Outputs to understand what happens (to comment in temporarily)
			//System.out.println(string);
			//System.out.println(string.length());
			//System.out.println(string.substring(0, string.length()-1));
			//System.out.println(string.charAt(string.length()-1));
			return string.charAt(string.length()-1) + getReverse(string.substring(0, string.length()-1));
		}
	}


}
