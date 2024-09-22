package apps;
import java.util.*;

public class LinkedListApp {
	public static void main(String[] args) {
		List<String> stringList = new LinkedList<String>();
		stringList.add("Lukas");
		stringList.add("Fabian");
		stringList.add("Jan");
		stringList.add("Katrin");
		stringList.add("Lukas");
		System.out.println(stringList);
		
		stringList.remove("Katrin");
		System.out.println(stringList);
	}

}
