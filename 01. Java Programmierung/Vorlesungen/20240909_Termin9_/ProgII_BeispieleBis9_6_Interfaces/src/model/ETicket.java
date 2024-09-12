package model;

public class ETicket implements Sellable {
	private String name;
	private double salesPrice;
	
	public ETicket(String name, double salesPrice) {
		this.name = name;
		this.salesPrice = salesPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	public Unit getUnit() {
		return Unit.PIECE;
	}
	
	public String toString() {
		return name + "(" + salesPrice + " €)";
	}
	
	public boolean available(double amount) {
		return true;
	}
	
}
