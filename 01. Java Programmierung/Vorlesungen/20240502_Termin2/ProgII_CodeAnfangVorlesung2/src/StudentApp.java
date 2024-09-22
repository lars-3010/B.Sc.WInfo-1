/**
 * This is the class "StudentApp" which uses the class Student
 * @author Katrin W.
 *
 */
public class StudentApp {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		System.out.println(student1); //Referenz auf den Speicher
		System.out.println(student1.getName()); //aktueller Name
		System.out.println(student1.getId()); //aktuelle Id
		
		student1.setName("Peter Pan");
		student1.setId(10001);
	
		System.out.println(student1); //Referenz auf den Speicher
		System.out.println(student1.getName()); //aktueller Name
		System.out.println(student1.getId()); //aktuelle Id
		
		System.out.println(student2); //Referenz auf den Speicher
		System.out.println(student2.getName()); //aktueller Name
		System.out.println(student2.getId()); //aktuelle Id
		
		student2.setName("Max Mustermann");
		student2.setId(10002);
	
		System.out.println(student2); //Referenz auf den Speicher
		System.out.println(student2.getName()); //aktueller Name
		System.out.println(student2.getId()); //aktuelle Id
		
		System.out.println(student1.getName() + " (" + student1.getId() + ")");
		System.out.println(student1.toString());
	}

}
