package apps;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// Demo, die bei Ausführung eine Exception bzgl. des Teilens durch 0 anzeigt
		int zaehler = 30;
		int nenner = 0;
		int ergebnis;
		
		ergebnis = zaehler/nenner;
		System.out.println(ergebnis);

	}

}
