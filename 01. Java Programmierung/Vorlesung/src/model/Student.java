package model;

public class Student {
    private int id;
    private String name;
    public static final int FIRST_ID = 10001;
    public static final int LAST_ID = 99999;
    private static int nextId = FIRST_ID;

    // Konstruktoren

    public Student() {
        this.id = nextId++;
        this.name = "UNKNOWN";
    }

    public Student(String name) {
        this.id = nextId++;
        this.name = name;
    }

    // Getter und Setter
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    public String toString(String type) {
        if (type.equals("long")) {
            return "Student " + name + " hat die Id " + id + ".";
        } else {
            return super.toString();
        }
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    public static int getNoOfAvailableIds() {
        return LAST_ID-nextId+1;
    }
    public static int getNoOfAssignedIds() {
        return nextId-FIRST_ID;
    }

    
}
