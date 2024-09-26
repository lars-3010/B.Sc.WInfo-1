package apps;
import model.Student;

public class StudentApp {
    public static void main(String[] args) {

        Student marisa = new Student(1, "Marisa");

        Student maybrit = new Student();

        maybrit.setId(2);

        maybrit.setName("Maybrit", "Lange");

        System.out.println(marisa);

        System.out.println(maybrit.getName() + " (" + maybrit.getId() + ")");
    }
}