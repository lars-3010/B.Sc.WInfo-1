public class Person{
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int yearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String toString() {
        return "name: " + name + "yearOfBirth: " + yearOfBirth;
    }
}

/*
Es soll eine Klasse Person mit den Instanzvariablen name (Name der Person) und yearOfBirth 
(Geburtsjahr der Person) geben, die die gebräuchlichen Standardmethoden enthält.
 */