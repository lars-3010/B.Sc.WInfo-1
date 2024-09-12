package apps;
import shapes.*;

public class ShapeApp {

	public static void main(String[] args) {
		// impossible: Shape shape1 = new Shape();
		Shape shape1 = new Ellipse(2.0, 8.0);
		Shape shape2 = new Circle(4.0);
		Shape shape3 = new Line(-2.5);
		System.out.println("shape1 = " + shape1);
		System.out.println("shape2 = " + shape2);
		System.out.println("shape1 and shape2 have equals sizes: " + shape1.hasEqualSize(shape2));
		System.out.println("shape3 = " + shape3);
		
		System.out.println("\n-----------------------------------------------------\n");
		Shape[] shapes = new Shape[] { 
				new Point(),
				new Line(5),
				new Ellipse(3.0, 2.0),
				new Circle (0.0)
		};

		for (Shape shape : shapes) {
			System.out.println(shape + " has size " + shape.getSize());
		}
	}	

}
