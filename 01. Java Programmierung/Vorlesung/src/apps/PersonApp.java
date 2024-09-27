package apps;

import model.IdRangeException;
import model.Student;

public class PersonApp {
    public static void main(String[] args) {
        try {
            Person person1 = new Student();
            Person person2 = new Student();
            Person person3 = new Student();
        } catch (IdRangeException eId) {
            System.out.println(eId);
        }
    }
}
