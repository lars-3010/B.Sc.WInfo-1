/**
 * This is the class "StudentApp" which uses the class Student
 * @author Katrin W.
 *
 */
public class StudentApp {

public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		System.out.println(student1); 
		System.out.println(student1.getName()); //aktueller Name
		System.out.println(student1.getId()); //aktuelle Id
		
		student1.setName("Peter Pan");
		//student1.setId(10001);
	
		System.out.println(student1); 
		System.out.println(student1.getName()); //aktueller Name
		System.out.println(student1.getId()); //aktuelle Id
		
		System.out.println(student2); //Referenz auf den Speicher
		System.out.println(student2.getName()); //aktueller Name
		System.out.println(student2.getId()); //aktuelle Id
		
		student2.setName("Max Mustermann");
		//student2.setId(10002);
	
		System.out.println(student2);
		System.out.println(student2.getName()); //aktueller Name
		System.out.println(student2.getId()); //aktuelle Id
		
		System.out.println(student1.getName() + " (" + student1.getId() + ")");
		System.out.println(student1.toString());
		
		student2 = student1;
		
		student1.setName("Name Student1-geändert");
		
		System.out.println(student1.getName());
		System.out.println(student2.getName());
		
		student1.setName("Lars", "Boes");
		System.out.println(student1.getName());
		
		// Student student4 = new Student(10004);
		// System.out.println(student4.getName());
		
		//	Student student5 = new Student(10005, "Lubna Ishaq");
		//	System.out.println(student5.getName());
		//		
		//	Student student6 = new Student(10);
		//	Student student7 = new Student(10007,"Philipp Salmen");
		//	System.out.println(student7.getName());
		//		
		//	System.out.println(student7);
		//  System.out.println(student5);
		
	    System.out.println("Number of available Id's: "+ Student.getNoOfAvailableIds());
	    System.out.println("Number of assigned Id‘s: "+ Student.getNoOfAssignedIds());
	}

}
