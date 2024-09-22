package shapes;

public class Line extends Shape {

	private double length;
	
	public Line(double length) {
		this.length = length;
	}
	
	public String toString() {
		return "Line(" + this.length + ")";
	}
	
	public double getSize() {
		return 0.0;
	}
}
