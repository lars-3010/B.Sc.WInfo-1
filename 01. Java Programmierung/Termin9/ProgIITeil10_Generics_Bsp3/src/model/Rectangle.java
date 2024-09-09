package model;

public class Rectangle extends Shape {
	private double length;
	private double height;
	
	public Rectangle (double length, double height) {
		super();
		this.length = length;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public String toString() {
		return "Rectangle(" + length + " * " + height + ")";
	}
	
	public double getSize() {
		return length * height;
	}
	
	
}
