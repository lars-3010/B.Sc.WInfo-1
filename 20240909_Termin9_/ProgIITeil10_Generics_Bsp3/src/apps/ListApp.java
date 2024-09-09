package apps;

import model.*;

public class ListApp {

 	public static void main(String[] args) {
 		
		List<String> stringList = new List<String>("abc", "def", "ghi", "jkl", "mno");
		System.out.println("Die Liste hat " + stringList.length() + " Einträge");
		System.out.println("Die Einträge sind:");
		System.out.println(stringList);
		
	}
}