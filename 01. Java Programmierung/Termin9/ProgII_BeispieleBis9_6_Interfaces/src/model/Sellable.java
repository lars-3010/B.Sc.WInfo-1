package model;

public interface Sellable extends Measurable, Nameable {
  // abstract methods
  public double getSalesPrice();
  public void setSalesPrice(double price);
  
  // default methods
  public default void changeSalesPrice(double change) {
  	this.setSalesPrice(this.getSalesPrice() + change);
  }
  
}