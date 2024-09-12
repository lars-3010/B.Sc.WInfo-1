// authors: Katrin Witting and Peter Ruckmann
package apps;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		
		long power = 1;
		for (long i=1; i<=65; i++) {
			power += power;
			System.out.println(power);
		}
		
		// comment the following out for reading the output above ;-)
		BigInteger power2 = BigInteger.ONE;
		for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(67)) < 0; i=i.add(BigInteger.ONE)) {
			System.out.println("i = " + i);
			power2 = power2.add(power2); 
			System.out.println(power2);
		}
	}

}
