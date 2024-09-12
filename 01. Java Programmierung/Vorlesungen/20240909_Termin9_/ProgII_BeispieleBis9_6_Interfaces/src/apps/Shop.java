package apps;
import model.*;

public class Shop {

	public static void main(String[] args) throws ArticleIdException {
		Sellable sellable = new Article(
				"Bier",
				Unit.LITER,
				100.0,
				1.85,
				new StorageLocation("Partykeller", 1)
		);
		
		System.out.println(sellable);
		sellable.changeSalesPrice(0.30);
		System.out.println(sellable);
		sellable.setSalesPrice(1.55);
		System.out.println(sellable);
		
		sellable = new ETicket ("9-Euro-Ticket", 9.00);
		System.out.println(sellable);
		sellable.changeSalesPrice(20.00);
		System.out.println(sellable);
		sellable.setSalesPrice(25.00);
		System.out.println(sellable);

	}

}