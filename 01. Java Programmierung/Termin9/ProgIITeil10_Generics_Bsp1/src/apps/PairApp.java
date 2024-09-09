package apps;
import model.*;

public class PairApp {

	public static void main(String[] args) {
		Pair<String, String> stringPair = new Pair("Max", "Mustermann");
		System.out.println(stringPair);
		
		Pair<String, Faculty> stringFacultyPair = new Pair("Mustermann", Faculty.COMPUTER_SCIENCE);
		System.out.println(stringFacultyPair);
		
		Pair<String, Integer> personAgePair = new Pair("Mustermann", Integer.valueOf(22));
		System.out.println(personAgePair);
		
		Pair<int[], String> intArrayStringPair = new Pair (new int[] {0,1,5,3}, "abc");
		System.out.println(intArrayStringPair);
		
		int[] myArrayAtFirst = intArrayStringPair.getFirst();
		System.out.println(myArrayAtFirst);

		
		for (int eintrag : myArrayAtFirst) {
			System.out.print(" " + eintrag);
		}
		
		String myArrayAtSecond = intArrayStringPair.getSecond();
		System.out.println("\n\n" + myArrayAtSecond);
	}

}
