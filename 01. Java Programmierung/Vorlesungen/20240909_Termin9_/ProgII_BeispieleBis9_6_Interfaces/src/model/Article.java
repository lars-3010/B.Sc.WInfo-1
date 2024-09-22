

package model;

public class Article implements Sellable, Storable {
	// Regel: alle statischen Größen vor allen instanzbezogenen Größen
	// static variables
	public final static int MIN_ID = 10001;
	public final static int MAX_ID = 99999;
	private static int nextId = MIN_ID;

	// static methods
	public static int getNoofAssignedIds() {
		return nextId - MIN_ID;
	}

	public static int getNoofAvailableIds() {
		return MAX_ID - nextId + 1;
	}

	// instance variables
	private int id;
	private String name;
	private Unit unit;
	private double inStock;
	private double salesPrice;
	private StorageLocation storageLocation;

	// constructor
	public Article(String name, Unit unit, double inStock, double salesPrice) {
		this.id = nextId++;
		this.unit = unit;
		this.inStock = inStock;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	// constructor
	public Article(String name, Unit unit, double inStock, double salesPrice, StorageLocation storageLocation) {
		this.id = nextId++;
		this.unit = unit;
		this.inStock = inStock;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storageLocation = storageLocation;
	}

//	public Article(String name, Unit unit, double salesPrices) {
//		this.id = nextId++;
//		// this.id = id>=10001 && id<=99999 ? id : 0;
//		this.name = name;
//		this.unit = unit;
//		this.salesPrice = salesPrice;
//	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public double getInStock() {
		return inStock;
	}

	public void setInStock(double inStock) {
		this.inStock = inStock;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String toString() {
		return this.name + " (" + this.id + ") - Bestand " + this.inStock + " " + this.unit + " - Preis " + this.salesPrice + " Euro";

	}

	public double getInventoryValue() {
		return this.inStock * this.salesPrice;
	}
	
	public boolean available(double amount) {
		assert amount>=0.0;
		return amount <= inStock;
	}
}
