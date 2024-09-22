package apps;
import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		
		// vielleicht zunächst verblüffendes Beispiel
		double zahl = 0.01;
		double sum = 0;
		for (int i = 1; i<=1000; i++){
			sum += zahl;
		}
		System.out.println("Datentyp double:");
		System.out.println("Erwartete Summe: 1000*0.01 = " + (double)1000*0.01);
		System.out.println("Die Summe ist: " + sum);
		double dev = sum-10;
		System.out.println("Abweichung: " + dev +"\n");


		// gleiches Beispiel mit BigDecimal
		BigDecimal zahlbd = new BigDecimal("0.01");
		BigDecimal sumbd = new BigDecimal("0");
		for (int i = 1; i<=1000; i++){
			sumbd =sumbd.add(zahlbd);
		}
		
		BigDecimal devbd = new BigDecimal("0");	
		devbd = devbd.add(sumbd.subtract(BigDecimal.valueOf(10)));
		
		System.out.println("Datentyp BigDecimal:");
		System.out.println("Erwartete Summe: 1000*0.01 = " + (double)1000*0.01);
		System.out.println("Die Summe (bigDecimal) ist: " + sumbd);
		System.out.println("Abweichung: " + devbd);
		
		// BigDecimal erlaubt wirklich sehr große Zahlen
		BigDecimal bd = new BigDecimal ("12345678901234567890123456789.1234567890123456789");
		//System.out.println(bd);
		for (int i=0; i<=1000; i++) {
			bd = bd.add(bd);
			//System.out.println(bd);
		}

		
	}

}

