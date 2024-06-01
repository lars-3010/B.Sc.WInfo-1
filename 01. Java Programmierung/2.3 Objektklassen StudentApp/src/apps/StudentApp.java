import model.Location;
import model.Student;
import utilities.IdFactory;

package apps;
public class StudentApp {
    public static void main(String[] args) {
        
        // alte Varianten: 

//        Student student1 = new Student();
//        Student student1 = new Student(67453, "Philipp");
//        Student studi4 = new Student(10004);
//        Student studi5 = new Student(10005,"Norbert Mueller");

//        student1.setId(10001);
//        student1.setName("Hans", "Erster-Test");

//        System.out.println(student1.getName() + " (" + student1.getId() + ")");
//        System.out.println(studi4.toString());
//        System.out.println(studi5.toString());


        System.out.println("Number of available Id's: "+ IdFactory.getNoOfAvailableIds());
        System.out.println("Number of assigned Id‘s:"+ IdFactory.getNoOfAssignedIds());

        Student student3 = new Student("Simon", 
                                        new Location("Meisenstr. 92", 33333, "Bielefeld"),
                                        new Location("Ahrstr. 92", 44444, "Aachen"));

        System.out.println(student3);
    }
}