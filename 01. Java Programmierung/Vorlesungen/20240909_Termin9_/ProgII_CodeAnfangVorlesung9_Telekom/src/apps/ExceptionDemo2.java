package apps;

public class ExceptionDemo2 {

	public static void main(String[] args) throws DivisionByOneSelfMade {
		// Demo, die bei Ausführung eine Exception bzgl. des Teilens durch 1 anzeigt
		int zaehler = 30;
		int nenner = 1;
		int ergebnis;
		
		if (nenner == 1) {
			//throw new DivisionByOneSelfMade();
			throw new DivisionByOneSelfMade("Hallo, doch nicht durch 1, Problem in Zeile 13!");
		} else {	
			ergebnis = zaehler/nenner;
			System.out.println(ergebnis);
		}	
	}
}
