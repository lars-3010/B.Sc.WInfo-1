package apps;
import model.Triple;
import model.Unit;

public class TripleApp {
    public static void main(String[] args) {
        // String Triple
        Triple<String> tripleString = new Triple("a", "b", "c");
        System.out.println(tripleString);

        tripleString.shiftLeft();
        System.out.println(tripleString);

        tripleString.shiftRight();
        System.out.println(tripleString);

        // int Triple
        Triple<Integer> tripleInt = new Triple(1,2,3);
        System.out.println(tripleInt);

        tripleInt.shiftLeft();
        System.out.println(tripleInt);

        tripleInt.shiftRight();
        System.out.println(tripleInt);

        // Mengeneinheiten Triple
        Triple<Unit> tripleUnit = new Triple(Unit.KILO, Unit.LITER, Unit.PIECE);
        System.out.println(tripleUnit);

        tripleUnit.shiftLeft();
        System.out.println(tripleUnit);

        tripleUnit.shiftRight();
        System.out.println(tripleUnit);
    }
}
