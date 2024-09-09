package model;

public interface Storable extends Measurable, Nameable {
	public double getInStock();
	public void setInStock(double amount);

	public default void addToStock(double amount) {
		assert amount >= 0;
		setInStock(getInStock() + amount);
	}

	public default void takeFromStock(double amount) {
		assert amount>=0 && amount <= getInStock();
		setInStock(getInStock() - amount);
	}
}
