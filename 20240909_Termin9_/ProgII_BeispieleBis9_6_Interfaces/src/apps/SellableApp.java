package apps;
import model.*;

public class SellableApp {

	public static void main(String[] args) {	
		
		Article article1 = new Article("Milch", Unit.LITER, 100, 1.22);
		System.out.println(article1);
		
		ETicket eticket1 = new ETicket("49-Eur-Ticket", 49.00);
		System.out.println(eticket1);
		
		Sellable sellable = new Article("Milch", Unit.LITER, 100, 1.22);
		print(sellable);
		sellable = new ETicket("9-Eur-Ticket", 9.00);
		print(sellable);
	}
	
	private static void print(Sellable sellable) {
		System.out.println(sellable);
	}
	
//	private static void printSellables(Sellable[] sellable) {
//		// to-do
//		System.out.println(sellable);
//	}
}
