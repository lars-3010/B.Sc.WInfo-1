package shapes;

public class Ellipse extends Shape {
	private double horizontalSemiAxis;
	private double verticalSemiAxis;
	
	public Ellipse(double horizontalSemiAxis, double verticalSemiAxis) {
		super();
		
		assert horizontalSemiAxis > 0 : "horizontalSemiAxis must be > 0";
		assert verticalSemiAxis > 0 : "verticalSemiAxis must be > 0";
		
		this.horizontalSemiAxis = horizontalSemiAxis;
		this.verticalSemiAxis = verticalSemiAxis;
	}

	public double getHorizontalSemiAxis() {
		return horizontalSemiAxis;
	}

	public double getVerticalSemiAxis() {
		return verticalSemiAxis;
	}

	public String toString() {
		return "Ellipse (" + this.horizontalSemiAxis + ", " + this.verticalSemiAxis +")";
	}
	
	public double getSize() {
		return Math.PI * horizontalSemiAxis * verticalSemiAxis;
	}
}

