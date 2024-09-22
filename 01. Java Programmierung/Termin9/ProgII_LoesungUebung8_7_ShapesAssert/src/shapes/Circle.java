package shapes;

public class Circle extends Ellipse {
	private double radius;

	public Circle(double radius) {
		super(radius, radius);
	}
	
	public String toString() {
		return "Circle (" + super.getHorizontalSemiAxis() + ")";
	}
}
