package shapes;

public class Rectangle extends Shape {
	private double length;
	private double height;
	
	public Rectangle (double length, double height) {
		super();
		
		assert length > 0 : "length must be > 0";
		assert height > 0 : "height must be > 0";
		
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
