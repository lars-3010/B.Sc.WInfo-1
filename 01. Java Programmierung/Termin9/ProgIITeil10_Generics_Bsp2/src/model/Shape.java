package model;

public abstract class Shape {
	public abstract String toString();
	public abstract double getSize();
	
	public boolean hasEqualSize(Shape shape) {
		return this.getSize() == shape.getSize();
	}
}
