package apps;
import java.util.*;

public class ArrayListApp {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("Lukas");
		stringList.add("Fabian");
		stringList.add("Jan");
		stringList.add("Katrin");
		System.out.println(stringList);
		
		stringList.remove("Katrin");
		System.out.println(stringList);

	}

}
