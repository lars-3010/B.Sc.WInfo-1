// Peter Ruckmann

package apps;
import model.*;

public class PrintArrays {

	public static void main(String[] args) {

		Shape[] shapeArray = {new Point(), new Line(5), new Circle(3)};
        System.out.println("Shape object list is:");
        printArray(shapeArray);

		
        Integer[] intArray = {Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(5)};
        System.out.println();
        System.out.println("Integer value list is:");
        printArray(intArray);

	}
	

	private static <T> void printArray(T[] array) {
		for (T value: array) {
			System.out.println("- " + value);
		}
	}

}
