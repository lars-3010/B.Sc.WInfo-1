package apps;

import model.*;

public class ListApp {

 	public static void main(String[] args) {
		// List<Shape> shapeList = new List<Shape>; --> als Übung		
		List<Shape> shapeList = new List<Shape> (new Point(), new Line(1), new Circle(2));
		System.out.println("Die Liste hat " + shapeList.length() + " Einträge");
		System.out.println("Die Einträge sind:");
		System.out.println (shapeList);

	}
}