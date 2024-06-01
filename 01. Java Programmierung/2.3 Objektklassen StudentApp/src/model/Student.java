package model;
import utilities.IdFactory;

public class Student {
    private int id;
    private String name;
    private Location placeOfBirth;
    private Location residence;
    
    // Konstruktorens
    public Student() {
        this.id = IdFactory.getNextId();
        this.name = "UNKNOWN";
    }
    public Student(String name) {
        this.id = IdFactory.getNextId();
        this.name = name;
    }

    public Student(String name, Location placeOfBirth, Location residence) {
        this.id = IdFactory.getNextId();
        this.name = name;
        this.placeOfBirth = placeOfBirth;
        this.residence = residence;
    }

    /* keine Ahnung wofür, aber er ist da
    public Student(int id) { 
        if (id >= 10001 && id <= 99999) {
            this.id = id;
        }
        else {
            System.out.println("Fehler, muss zwischen 10001 & 99999 liegen");
            this.id = 0;
        }
    }

    public Student(int id, String name) {
        if (id >= 10001 && id <= 99999) {
            this.id = id;
        }
        else {
            System.out.println("Fehler, muss zwischen 10001 & 99999 liegen");
            this.id = 0;
        }
        this.name = name;
    }
    */

    // Getter
    public int getId() {
        return this.id;
    }
    /* Setter
    private void setId(int id) {
        this.id = id;
    }
    */

    // Getter
    public String getName() {
        return this.name;
    }
    // Setter
    public void setName(String name) {
        this.name = name;
    }
    // Overloaded Setter
    public void setName(String name1, String name2) {
        this.name = name1 + " " + name2;
    }
    @Override
    public String toString(){
        return "Student [id=" + id + ", name=" + name + "]";
    }
    public String toString(String type) {
        if (type == "long") {
            return "Student "+ name +" hat die Id “ + id";
        }
        else {
            return toString();
        }
    }
}