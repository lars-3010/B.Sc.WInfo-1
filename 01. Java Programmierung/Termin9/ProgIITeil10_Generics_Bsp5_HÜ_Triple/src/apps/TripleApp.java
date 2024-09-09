package apps;
import model.*;

public class TripleApp {

	public static void main(String[] args) {
		Triple<String> tripleString = new Triple("a", "b", "c");
		System.out.println(tripleString);
		tripleString.shiftLeft();
		System.out.println(tripleString);
		
		tripleString.shiftRight();
		System.out.println(tripleString);	
		
		Triple<Integer> tripleInt = new Triple(1,8,25);
		System.out.println(tripleInt);
		tripleInt.shiftLeft();
		System.out.println(tripleInt);
		
		tripleInt.shiftRight();
		System.out.println(tripleInt);	
		
		Triple<Unit> tripleUnit = new Triple(Unit.KILO, Unit.LITER, Unit.PIECE);
		System.out.println(tripleUnit);
		tripleUnit.shiftRight();
		System.out.println(tripleUnit);
		
		tripleUnit.shiftLeft();
		System.out.println(tripleUnit);	
		
		
	}

}
