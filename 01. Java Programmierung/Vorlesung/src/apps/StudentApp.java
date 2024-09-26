package apps;
import model.Student;

public class StudentApp {
    public static void main(String[] args) {

        Student st1 = new Student("Andrea Schmidt");
        System.out.println(st1.getName() + " (" + st1.getId() + ")");

        System.out.println("Number of available Id's: "+ Student.getNoOfAvailableIds());
        System.out.println("Number of assigned Id‘s: "+ Student.getNoOfAssignedIds());

        /*
        System.out.println(student5.getName() + " (" + student5.getId() + ")");
        System.out.println(student6.getName() + " (" + student6.getId() + ")");
         */
    }
}