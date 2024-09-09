package apps;
import java.util.*;

public class HashSetApp {
	public static void main(String[] args) {
		Set<String> stringList = new HashSet<String>();
		stringList.add("Lukas");
		stringList.add("Fabian");
		stringList.add("Jan");
		stringList.add("Katrin");
		stringList.add("Jan");
		System.out.println(stringList);
		
		stringList.remove("Katrin");
		System.out.println(stringList);
	}

}
